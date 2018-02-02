package com.newproject.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String type;
    private Value value;

    public Weather(){

    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public Value getValue(){
        return value;
    }

    public void setValue(Value value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
