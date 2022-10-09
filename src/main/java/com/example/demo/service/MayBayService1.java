package com.example.demo.service;

import com.example.demo.repository.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayService1 implements MayBayService{
    @Autowired
    private MayBayRepository mayBayRepository;
    @Override
    public List<String> cau2() {
        return mayBayRepository.cau2();
    }

    @Override
    public int cau7() {
        return mayBayRepository.cau7();
    }

    @Override
    public List<String> cau11() {
        return mayBayRepository.cau11();
    }

    @Override
    public List<String> cau13() {
        return mayBayRepository.cau13();
    }

    @Override
    public List<Object[]> cau16() {
        return mayBayRepository.cau16();
    }
}
