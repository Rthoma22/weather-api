package com.alphavantage.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



public class MetaData {
    @JsonProperty("1. Information")
    private String Information;
    @JsonProperty("2. Symbol")
    private String Symbol;
    @JsonProperty("3. Last Refreshed")
    private String LastRefreshed;
    @JsonProperty("4. Interval")
    private String Interval;
    @JsonProperty("5. Output Size")
    private String OutputSize;
    @JsonProperty("6. Time Zone")
    private String TimeZone;

    public MetaData() { }

    public String getInformation() {
        return Information;
    }

    public String getSymbol() {
        return Symbol;
    }

    public String getLastRefreshed() {
        return LastRefreshed;
    }

    public String getInterval() {
        return Interval;
    }

    public String getOutputSize() {
        return OutputSize;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public void setLastRefreshed(String lastRefreshed) {
        LastRefreshed = lastRefreshed;
    }

    public void setInterval(String interval) {
        Interval = interval;
    }

    public void setOutputSize(String outputSize) {
        OutputSize = outputSize;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "Information='" + Information + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", LastRefreshed='" + LastRefreshed + '\'' +
                ", Interval='" + Interval + '\'' +
                ", OutputSize='" + OutputSize + '\'' +
                ", TimeZone='" + TimeZone + '\'' +
                '}';
    }
}
