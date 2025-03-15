package org.example;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class A {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="Gaurav@123%kg";

        System.out.println("Encoded URL: " + URLEncoder.encode(s, "UTF-8"));
    }
}
