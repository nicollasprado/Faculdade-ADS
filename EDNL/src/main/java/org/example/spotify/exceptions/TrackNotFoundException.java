package org.example.spotify.exceptions;

public class TrackNotFoundException extends RuntimeException {
    public TrackNotFoundException() {
        super("Música não encontrada");
    }

    public TrackNotFoundException(String name) { super("Música não encontrada com o nome: '" + name + "'");}
}
