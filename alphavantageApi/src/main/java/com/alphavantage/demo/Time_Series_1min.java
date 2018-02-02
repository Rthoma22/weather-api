package com.alphavantage.demo;
import com.fasterxml.jackson.annotation.*;

import java.util.*;
import java.util.HashMap;

@JsonIgnoreProperties("Time Series (1min)")
public class Time_Series_1min {
    @JsonIgnore
    HashMap<String, TimeStamp> timeStamp = new LinkedHashMap<>();

    //private Map<String,TimeStamp>timeStamp;

    public Time_Series_1min(){}

    @JsonAnyGetter
    public HashMap<String, TimeStamp> getTimeStamp() {
        return timeStamp;
    }
    @JsonAnySetter
    public void setTimeStamp(String time, TimeStamp value) {
        timeStamp.put(time,value);
    }

//timeStamp.put(String, TimeStamp);

    @Override
    public String toString() {
        return "Time_Series_1min{" +
                "timeStamp=" + timeStamp +
                '}';
    }
}
