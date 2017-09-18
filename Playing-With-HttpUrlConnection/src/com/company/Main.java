package com.company;

import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Main {

    static final String ADSB_URL = "https://public-api.adsbexchange.com/VirtualRadar/AircraftList.json?fRegQ=G-ZBJH";

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpURLConnection con = (HttpURLConnection) new URL(ADSB_URL).openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3218.0 Safari/537.36");

        con.setDoOutput(true);

        InputStream response = con.getInputStream();

        StringBuilder responseBuilder = new StringBuilder();
        Reader reader = new BufferedReader(new InputStreamReader(response, "UTF-8"));
        int c = 0;
        while ((c = reader.read()) != -1) {
            responseBuilder.append((char) c);
        }

        JSONObject flightObject = new JSONObject(responseBuilder.toString());

        System.out.println("Response code: " + con.getResponseCode());
        System.out.println("Request method: " + con.getRequestMethod());
        System.out.println("Permission: " + con.getPermission());
        System.out.println("Response message: " + con.getResponseMessage());
        System.out.println("Connection timeout: " + con.getConnectTimeout());
        System.out.println("Expiration: " + con.getExpiration());
        Map<String, List<String>> responseHeaders = con.getHeaderFields();

        System.out.println("Available response headers: ");
        for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
            System.out.println("\t" + entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println(flightObject.toString(4));
    }
}
