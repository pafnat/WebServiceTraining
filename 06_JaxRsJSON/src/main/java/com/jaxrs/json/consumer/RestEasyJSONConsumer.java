package com.jaxrs.json.consumer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

public class RestEasyJSONConsumer {

    public static void main(String[] args) {

        try
        {
            URL url = new URL("http://localhost:8080/JaxRsJSON/Employee/Json/empList");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Implicit and Explicit

            System.out.println("Connection Time out = " + con.getConnectTimeout());
            System.out.println("Connection Read out = " + con.getReadTimeout());

            con.setDoOutput(true);
            con.setConnectTimeout(100000);
            con.setReadTimeout(100000);

            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Failed to get the successful Connection..." + con.getResponseCode());
            }

            BufferedReader readBuffer = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String result;
            while ((result = readBuffer.readLine()) != null) {
                System.out.println(result);


            }

            con.disconnect();
            readBuffer.close();

        } catch (MalformedURLException malEx) {

            malEx.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }





}
