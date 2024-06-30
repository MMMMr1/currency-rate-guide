package com.michalenok.currency_rate_guide.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RateResponse(
        @JsonProperty("Cur_ID") String curId,
        @JsonProperty("Date") LocalDate date,
        @JsonProperty("Cur_OfficialRate") String  curOfficialRate){}
