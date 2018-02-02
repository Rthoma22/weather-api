package com.cryptonator.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Container {
    private Ticker ticker;
    private int timeStamp;
    private boolean success;
    private String error;

    public Container() {

    }

    public Ticker getTicker() {
        return ticker;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getError() {
        return error;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Container{" +
                "ticker=" + ticker +
                ", timeStamp=" + timeStamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}


