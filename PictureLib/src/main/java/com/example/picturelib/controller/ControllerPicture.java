package com.example.picturelib.controller;

import com.example.picturelib.model.Picture;
import com.example.picturelib.repository.PictureRepository;
import com.example.picturelib.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/picture")
public class ControllerPicture {
        @Autowired
        private IPictureService service;
        @Autowired
        private PictureRepository repository;

        //show
        @GetMapping
        public ResponseEntity<Iterable<Picture>> findAllCustomer() {
            List<Picture> pictures = (List<Picture>) service.findAll();
            if (pictures.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(pictures, HttpStatus.OK);
        }


        //dùng để tìm kiếm 1 ID của computers nào đó
        @GetMapping("/{id}")
        public ResponseEntity<Picture> findCustomerById(@PathVariable Long id) {
            Optional<Picture> customerOptional = service.findById(id);
            if (!customerOptional.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
        }

        //add
        @PostMapping
        public ResponseEntity<Picture> saveCustomer(@RequestBody Picture picture, BindingResult bindingResult) {
            return new ResponseEntity<>(service.save(picture), HttpStatus.CREATED);
        }

}
