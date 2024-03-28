package com.example.demo.controller;


import com.example.picturelib.model.Picture;
import com.example.picturelib.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("product")
public class ControllerPicture {

    @Autowired
    private PictureRepository repository;

    public static final String UPLOAD_DIRECTORY = "\\C:\\Users\\namca\\image\\";

    @GetMapping("/create")
    public ModelAndView displayCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", new Picture());
        return modelAndView;
    }

    @PostMapping("/upload")
    public ModelAndView upload(@RequestParam("file") MultipartFile file, Picture picture) {
        ModelAndView modelAndView = new ModelAndView("redirect:/product/create");

        // Check if file is not empty
        if (!file.isEmpty()) {
            try {
                // Save the file to the specified upload directory
                String fileName = file.getOriginalFilename();
                file.transferTo(new File(UPLOAD_DIRECTORY + fileName));
                picture.setImage(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Save product to the database
        repository.save(picture);
        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView displayHomePage() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("allPictures", repository.findAll());
        return modelAndView;
    }

}
