package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfo(
        @JsonPropertyDescription("stateOrCountry") String stateOrCountry,
        @JsonPropertyDescription("capital") String capital,
        @JsonPropertyDescription("population") String population,
        @JsonPropertyDescription("region") String region,
        @JsonPropertyDescription("language") String language,
        @JsonPropertyDescription("currency") String answercurrency) {
}