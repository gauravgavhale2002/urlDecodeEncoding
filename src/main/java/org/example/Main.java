package org.example;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Main {

    public static void main(String[] args) {
        try {
            // Given URL
            String url = "http://localhost:9080/blueprint/servlet/service/productSearch/11224/WG motor-graders/filter? wgSpecifications-en GB-weight-netTorque Rise OTH--50%252E0+%25=true";

            // Encode URL
            String encodedUrl = URLEncoder.encode(url, "UTF-8");
            System.out.println("Encoded URL: " + encodedUrl);

            // Decode URL
            String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
            System.out.println("Decoded URL: " + decodedUrl);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}