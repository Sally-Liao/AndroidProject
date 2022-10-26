package com.example.jsontestworktest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetUtil {
//    public  static String doGet(){

//        String result = "";
//        BufferedReader reader = null;
//        String bookJSONString = null;
//
//        try{
//            HttpURLConnection httpURLConnection = null;
//            String url = "http://www.baidu.com";
//            URL requestUrl = new URL(url);
//            httpURLConnection = (HttpURLConnection)requestUrl.openConnection();
//            httpURLConnection.setRequestMethod("GET");
//            httpURLConnection.setConnectTimeout(5000);
//            httpURLConnection.connect();
//
//            InputStream inputStream = httpURLConnection.getInputStream();
//
//            reader = new BufferedReader(new InputStreamReader(inputStream));
//
//            String line;
//            StringBuilder builder = new StringBuilder();
//            while ((line = reader.readLine()) != null){
//                builder.append(line);
//                builder.append("\n");
//            }
//
//            if (builder.length() == 0){
//                return null;
//            }
//
//            result = builder.toString();
//
//        }catch (MalformedURLException e){
//            e.printStackTrace();
//        }
//        return result;
//    }
}
