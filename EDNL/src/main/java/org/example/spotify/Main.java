package org.example.spotify;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.spotify.enums.SORT_TYPE;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String id = dotenv.get("CLIENT_ID");
        SpotifyClient client = new SpotifyClient();
        client.test();

        Playlist playlist = new Playlist(6);

        playlist.addTrack(new Track(
                "Joao",
                "2",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.addTrack(new Track(
                "Bruno",
                "8",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.addTrack(new Track(
                "caio",
                "5",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.addTrack(new Track(
                "via",
                "3",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.addTrack(new Track(
                "nic",
                "9",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.addTrack(new Track(
                "vel",
                "1",
                2002,
                "Album",
                "musicUrl",
                "capeUrl"
        ));

        playlist.sort(SORT_TYPE.Alphabetical);
    }
}