package org.example.spotify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyTrack {
    private String artist;
    private String music;
    private int year;
    private String album;
    private String musicUrl;
    private String capeUrl;

    @Override
    public String toString(){
        return "Música: " + music + "; Artista: " + artist + "; Album: " + album + "; Publicada em: " + year + "; Url: " + musicUrl + " Url da capa: " + capeUrl;
    }
}
