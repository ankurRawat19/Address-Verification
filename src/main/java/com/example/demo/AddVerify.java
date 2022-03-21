package com.example.demo;

import java.util.HashMap;
import java.util.Map;


public class AddVerify {
    public final static String US = "US";
    //51 states
    @SuppressWarnings("serial")
    public final static Map<String, Integer> mapOfUSStates = new HashMap<String, Integer>() {
        {
            put("Alabama", 0);
            put("Alaska", 1);
            put("Arizona", 2);
            put("Arkansas", 3);
            put("California", 4);
            put("Colorado", 5);
            put("Connecticut", 6);
            put("Delaware", 7);
            put("Dist of Columbia", 8);
            put("Florida", 9);
            put("Georgia", 10);
            put("Hawaii", 11);
            put("Idaho", 12);
            put("Illinois", 13);
            put("Indiana", 14);
            put("Iowa", 15);
            put("Kansas", 16);
            put("Kentucky", 17);
            put("Louisiana", 18);
            put("Maine", 19);
            put("Maryland", 20);
            put("Massachusetts", 21);
            put("Michigan", 22);
            put("Minnesota", 23);
            put("Mississippi", 24);
            put("Missouri", 25);
            put("Montana", 26);
            put("Nebraska", 27);
            put("Nevada", 28);
            put("New Hampshire", 29);
            put("New Jersey", 30);
            put("New Mexico", 31);
            put("New York", 32);
            put("North Carolina", 33);
            put("North Dakota", 34);
            put("Ohio", 35);
            put("Oklahoma", 36);
            put("Oregon", 37);
            put("Pennsylvania", 38);
            put("Rhode Island", 39);
            put("South Carolina", 40);
            put("South Dakota", 41);
            put("Tennessee", 42);
            put("Texas", 43);
            put("Utah", 44);
            put("Vermont", 45);
            put("Virginia", 46);
            put("Washington", 47);
            put("West Virginia", 48);
            put("Wisconsin", 49);
            put("Wyoming", 50);
        }
    };
    static int stateIndex = 0;
    String country = "";
    String city = "";

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStateIndex() {
        return stateIndex;
    }

    public void setStateIndex(int stateIndex) {
        AddVerify.stateIndex = stateIndex;
    }

}

