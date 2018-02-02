package com.cryptonator.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Markets {

    private String market;
    private String price;
    private int volume;

    public Markets(){

    }

    public String getMarket() {
        return market;
    }

    public String getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Markets{" +
                "market='" + market + '\'' +
                ", price='" + price + '\'' +
                ", volume=" + volume +
                '}';
    }
}
