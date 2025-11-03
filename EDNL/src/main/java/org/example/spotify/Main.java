package org.example.spotify;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.spotify.enums.SORT_TYPE;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        SpotifyClient client = new SpotifyClient();

        File file = new File("./busca.txt");

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String artistName = "";
            int limit = 0;
            String country = "";
            SORT_TYPE sortType = SORT_TYPE.RELEVANCIA;

            String line;
            while((line = reader.readLine()) != null){
                if(line.startsWith("NOME_ARTISTA")){
                    String[] splitted = line.split("NOME_ARTISTA = ");
                    artistName = splitted[1];
                }

                if(line.startsWith("QUANTIDADE_MUSICAS")){
                    String[] splitted = line.split("QUANTIDADE_MUSICAS = ");
                    limit = Integer.parseInt(splitted[1]);
                }

                if(line.startsWith("PAIS_BUSCA")){
                    String[] splitted = line.split("PAIS_BUSCA = ");
                    country = splitted[1];
                }

                if(line.startsWith("TIPO_ORDEM")){
                    String[] splitted = line.split("TIPO_ORDEM = ");
                    sortType = SORT_TYPE.valueOf(splitted[1]);
                }
            }

            MyTrack[] tracks = client.fetch(artistName, limit, country);
            Playlist playlist = new Playlist(tracks.length);

            for(MyTrack t : tracks){
                playlist.addTrack(t);
            }

            playlist.sort(sortType);

            playlist.listAll();

            System.out.println("------------");
            playlist.find("2 Minutes to Midnight - 2015 Remaster");
            playlist.find("Essa musica nem existe na vdd");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}