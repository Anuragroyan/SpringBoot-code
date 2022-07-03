package com.example.isthesiteup.controllers;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    
    private final String Site_Is_Up = "Site is up!";
    private final String Site_Is_Down = "Site is down";
    private final String Incorrect_Url = "Url is incorrect!";



    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url){
        String returnMessage = "";
        try {
            URL urlobj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlobj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCodeCategory = conn.getResponseCode() / 100;
            if (responseCodeCategory != 2 || responseCodeCategory != 3){
                returnMessage = Site_Is_Down;
            }
            else {
                returnMessage = Site_Is_Up;
            }
        } catch (MalformedURLException e) {
            returnMessage = Incorrect_Url;
        } catch (IOException e){
           returnMessage = Site_Is_Down;
        }
    
        return returnMessage;
    }

}
