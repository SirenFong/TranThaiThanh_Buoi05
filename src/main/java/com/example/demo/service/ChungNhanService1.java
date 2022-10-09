package com.example.demo.service;

import com.example.demo.repository.ChungNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChungNhanService1 implements ChungNhanService{
    @Autowired
    ChungNhanRepository chungNhanRepository;


    @Override
    public List<String> cau9() {
        return chungNhanRepository.cau9();
    }
}
