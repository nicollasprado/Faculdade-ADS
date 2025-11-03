package org.example.spotify.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GetArtistItemDTO(ArtistDTO[] items) {
}
