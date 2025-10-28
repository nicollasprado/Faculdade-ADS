package org.example.spotify;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.spotify.dtos.AuthenticationResponseDTO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpotifyClient {
    private final String CLIENT_ID = Dotenv.load().get("CLIENT_ID");
    private final String CLIENT_SECRET = Dotenv.load().get("CLIENT_SECRET");
    private String access_token;
    private final String API_URL = "https://api.spotify.com/";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public SpotifyClient() {
        this.access_token = getAccessToken();
    }

    private String getAccessToken(){
        HttpClient client = HttpClientBuilder.create().build();

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

    public void test() {
        System.out.println(this.access_token);
    }
}
