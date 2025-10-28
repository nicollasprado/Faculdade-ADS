package org.example.spotify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Track {
    private String artist;
    private String music;
    private int year;
    private String album;
    private String musicUrl;
    private String capeUrl;
}
