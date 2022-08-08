package com.decagondev.entities;

public class Result {
    private int calculationResult;
    private String message;

    public Result(int calculationResult, String message) {
        this.calculationResult = calculationResult;
        this.message = message;
    }

    public int getCalculationResult() {
        return calculationResult;
    }

    public void setCalculationResult(int calculationResult) {
        this.calculationResult = calculationResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
