package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoResponse(
        @JsonPropertyDescription("The name of the country") String stateOrCountry,
        @JsonPropertyDescription("The name of the capital") String capital,
        @JsonPropertyDescription("The population") Integer population,
        @JsonPropertyDescription("The region") String region,
        @JsonPropertyDescription("The primary language spoken") String language,
        @JsonPropertyDescription("The currency used") String answercurrency) {
}