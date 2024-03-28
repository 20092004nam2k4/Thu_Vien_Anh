package com.example.picturelib;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class PictureLibApplication {
    //nơi chạy
    public static void main(String[] args) {
        //luong chay
        SpringApplication.run(PictureLibApplication.class, args);
        //đường dẫn
        System.out.println("http://localhost:8080/product/home");
    }
}
