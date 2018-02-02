package com.alphavantage.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)

public class Container {
    @JsonProperty("Meta Data")
    private MetaData metaData;
    @JsonProperty("Time Series (1min)")
    private Time_Series_1min timeSeries;

    public Container(){}

    public MetaData getMetaData() {
        return metaData;
    }

    public Time_Series_1min getTimeSeries() {
        return timeSeries;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public void setTimeSeries(Time_Series_1min timeSeries) {
        this.timeSeries = timeSeries;
    }



    @Override
    public String toString() {
        return "Container{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}
