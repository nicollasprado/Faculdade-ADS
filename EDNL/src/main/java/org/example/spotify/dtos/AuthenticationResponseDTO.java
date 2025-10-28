package org.example.spotify.dtos;

public record AuthenticationResponseDTO(
        String access_token,
        String token_type,
        int expires_in
) {
}
