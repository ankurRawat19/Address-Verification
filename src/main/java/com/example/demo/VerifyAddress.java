package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

//Dummy Code for 2 character state code (No use)
public class VerifyAddress {


    public static int verifyAddress(String country, String state) {

        if (country.equals("US")) {
            return AddVerify.mapOfUSStates.getOrDefault(state, -1);
        } else {
            return -1;
        }

    }


    public static JSONObject confirmationApi(int sIndex, HttpStatus statusCode) throws JSONException {
        JSONObject json = new JSONObject();
        json.put("stateIndex", sIndex);
        String mssg = "";
        HttpStatus status = statusCode;
        if (statusCode.equals(HttpStatus.OK)) {
            System.out.println(status);
            json.put("message", "Successful");

        } else if (statusCode.equals(HttpStatus.BAD_REQUEST)) {
            System.out.println(status);
            json.put("message", "Invalid Address");

        } else {
            System.out.println(status);
            json.put("message", "Invalid Address");
        }
        return json;

    }
}

