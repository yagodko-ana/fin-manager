package com.example.personinfo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.UUID;

@Value
public class UUIDDto {
    UUID id;

    @JsonCreator
    public UUIDDto(@JsonProperty("id") UUID id) {
        this.id = id;
    }
}
