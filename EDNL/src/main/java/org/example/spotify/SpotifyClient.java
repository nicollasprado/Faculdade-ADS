package org.example.spotify;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neovisionaries.i18n.CountryCode;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.spotify.dtos.AuthenticationResponseDTO;
import org.example.spotify.dtos.GetArtistDTO;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.model_objects.specification.Track;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpotifyClient {
    private final String CLIENT_ID = Dotenv.load().get("CLIENT_ID");
    private final String CLIENT_SECRET = Dotenv.load().get("CLIENT_SECRET");
    private String accessToken;
    private final String API_URL = "https://api.spotify.com";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpClient client = HttpClientBuilder.create().build();

    public SpotifyClient() {
        this.accessToken = getAccessToken();
    }

    private String getAccessToken(){
        HttpPost req = new HttpPost("https://accounts.spotify.com/api/token");
        req.addHeader("Content-Type", "application/x-www-form-urlencoded");

        String reqBody = "grant_type=client_credentials&client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET;
        StringEntity reqBodyEntity = new StringEntity(reqBody, StandardCharsets.UTF_8);
        req.setEntity(reqBodyEntity);

        try {
            HttpResponse res = client.execute(req);
            HttpEntity entity = res.getEntity();
            int statusCode = res.getStatusLine().getStatusCode();

            if(statusCode != 200){
                throw new RuntimeException("Erro com a requisicao");
            }

            String resBody = EntityUtils.toString(entity);
            AuthenticationResponseDTO resDTO = objectMapper.readValue(resBody, AuthenticationResponseDTO.class);

            return resDTO.access_token();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MyTrack[] fetch(String name, int limit, String country){
        String refinedName = name.replaceAll("\s", "%20");

        try {
            HttpGet getArtistReq = new HttpGet(API_URL + "/v1/search?q=" + refinedName + "&type=artist&limit=1");
            getArtistReq.addHeader("Authorization", "Bearer " + accessToken);
            HttpResponse getArtistRes = client.execute(getArtistReq);
            int getArtistStatusCode = getArtistRes.getStatusLine().getStatusCode();

            if(getArtistStatusCode != 200){
                throw new RuntimeException("Nome de artista invalido");
            }

            HttpEntity artistEntity = getArtistRes.getEntity();
            String artistResBody = EntityUtils.toString(artistEntity);
            GetArtistDTO artistDTO = objectMapper.readValue(artistResBody, GetArtistDTO.class);

            SpotifyApi spotifyApi = new SpotifyApi.Builder().setAccessToken(accessToken).build();

            Track[] tracks = spotifyApi.getArtistsTopTracks(artistDTO.artists().items()[0].id(), CountryCode.valueOf(country)).setQueryParameter("limit", limit).build().execute();

            MyTrack[] myTracks = new MyTrack[tracks.length];

            for(int i = 0; i < tracks.length; i++){
                Track track = tracks[i];

                myTracks[i] = new MyTrack(
                        track.getArtists()[0].getName(),
                        track.getName(),
                        2025,
                        track.getAlbum().getName(),
                        track.getPreviewUrl(),
                        track.getUri()
                );
            }

            return myTracks;
        }catch (Exception e){
            System.out.println(e);
        }
        return new MyTrack[0];
    }

    public void test() {
        System.out.println(this.accessToken);
    }
}
