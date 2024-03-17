package com.example.picturelib.service;

import com.example.picturelib.model.Picture;
import com.example.picturelib.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PictureService implements IPictureService{

    @Autowired
    private PictureRepository repository;

    @Override
    public Iterable<Picture> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Picture> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Picture save(Picture picture) {
        return repository.save(picture);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
