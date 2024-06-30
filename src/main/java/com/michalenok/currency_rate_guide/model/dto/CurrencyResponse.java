package com.michalenok.currency_rate_guide.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrencyResponse(@JsonProperty("Cur_ID") String curId,
                               @JsonProperty("Cur_Code") String curCode,
                               @JsonProperty("Cur_Abbreviation") String curAbbreviation,
                               @JsonProperty("Cur_Name") String  curName,
                               @JsonProperty("Cur_DateStart") LocalDate curDateStart,
                               @JsonProperty("Cur_DateEnd") LocalDate curDateEnd) {}
