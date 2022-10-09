package com.example.demo.service;

import com.example.demo.entity.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService1 implements NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> cau3() {
        return nhanVienRepository.cau3();
    }

    @Override
    public int cau8() {
        return nhanVienRepository.cau8();
    }

    @Override
    public List<NhanVien> cau10() {
        return nhanVienRepository.cau10();
    }

    @Override
    public List<String> cau12() {
        return nhanVienRepository.cau12();
    }

    @Override
    public List<String> cau15() {
        return nhanVienRepository.cau15();
    }

    @Override
    public List<String> cau22() {
        return nhanVienRepository.cau22();
    }

    @Override
    public List<Object[]> cau23() {
        return nhanVienRepository.cau23();
    }

    @Override
    public List<Object[]> cau24() {
        return nhanVienRepository.cau24();
    }

    @Override
    public List<NhanVien> cau25() {
        return nhanVienRepository.cau25();
    }

    @Override
    public List<String> cau26() {
        return nhanVienRepository.cau26();
    }

    @Override
    public int cau27() {
        return nhanVienRepository.cau27();
    }
}
