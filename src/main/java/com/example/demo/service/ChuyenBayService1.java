package com.example.demo.service;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayService1 implements ChuyenBayService{
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;
    @Override
    public List<ChuyenBay> cau1() {
        return chuyenBayRepository.cau1();
    }

    @Override
    public List<ChuyenBay> cau4() {
        return chuyenBayRepository.cau4();
    }

    @Override
    public List<ChuyenBay> cau5() {
        return chuyenBayRepository.cau5();
    }

    @Override
    public int cau6() {
        return chuyenBayRepository.cau6();
    }

    @Override
    public List<ChuyenBay> cau14() {
        return chuyenBayRepository.cau14();
    }

    @Override
    public List<ChuyenBay> cau17() {
        return chuyenBayRepository.cau17();
    }

    @Override
    public List<Object[]> cau18() {
        return chuyenBayRepository.cau18();
    }

    @Override
    public List<Object[]> cau19() {
        return chuyenBayRepository.cau19();
    }

    @Override
    public List<ChuyenBay> cau20() {
        return chuyenBayRepository.cau20();
    }

    @Override
    public List<Object[]> cau21() {
        return chuyenBayRepository.cau21();
    }

    @Override
    public List<ChuyenBay> cau28() {
        return chuyenBayRepository.cau28();
    }
}
