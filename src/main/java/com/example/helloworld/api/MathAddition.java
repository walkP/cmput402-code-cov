package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MathAddition {
    private Double result;

    public MathAddition() { }

    public MathAddition(Double left, Double right) {
        result = left + right;
    }

    @JsonProperty
    public Double getResult() { return result; }
}
