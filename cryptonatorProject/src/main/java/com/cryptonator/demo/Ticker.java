package com.cryptonator.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Ticker {

    private String base;
    private String target;
    private String price;
    private String volume;
    private List<Markets> markets;

    public Ticker(){

    }

    public String getBase() {
        return base;
    }

    public String getTarget() {
        return target;
    }

    public String getPrice() {
        return price;
    }

    public String getVolume() {
        return volume;
    }

    public List<Markets> getMarkets() {
        return markets;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setMarkets(List<Markets> markets) {
        this.markets = markets;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", markets=" + markets +
                '}';
    }
}
