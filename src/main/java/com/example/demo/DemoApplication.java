package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        String str = new String("ankur");
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/print")
    @ResponseBody()
    public ResponseEntity<Object> verify(@RequestParam("country") String country, @RequestParam("state") String state, @RequestParam("street") String street, @RequestParam("county") String county, @RequestParam("zip") String zip) throws JSONException {

        try {
            Thread.sleep(7000);
            int sIndex = VerifyAddress.verifyAddress(country, state);
                System.out.println(sIndex);
                JSONObject response = VerifyAddress.confirmationApi(sIndex, HttpStatus.OK);
            return new ResponseEntity<Object>(response.toString(), HttpStatus.OK);

        } catch (ArrayIndexOutOfBoundsException | JSONException | InterruptedException e) {
            JSONObject response = VerifyAddress.confirmationApi(-1, HttpStatus.BAD_REQUEST);
            return new ResponseEntity<Object>(response.toString(), HttpStatus.BAD_REQUEST);
        }
    }
}



