package com.example.demo;

import com.example.demo.service.ChungNhanService1;
import com.example.demo.service.ChuyenBayService1;
import com.example.demo.service.MayBayService1;
import com.example.demo.service.NhanVienService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ChungNhanService1 cnserv;

    @Autowired
    private ChuyenBayService1 cbserv;

    @Autowired
    private MayBayService1 mbserv;

    @Autowired
    private NhanVienService1 nvserv;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        System.out.println("----------Cau 1----------");
        cbserv.cau1().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 2----------");
        mbserv.cau2().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 3----------");
        nvserv.cau3().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 4----------");
        cbserv.cau4().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 5----------");
        cbserv.cau5().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 6----------");
        System.out.println(cbserv.cau6());
        System.out.println();
        System.out.println("----------Cau 7----------");
        System.out.println(mbserv.cau7());
        System.out.println();
        System.out.println("----------Cau 8----------");
        System.out.println(nvserv.cau8());
        System.out.println();
        System.out.println("----------Cau 9----------");
        cnserv.cau9().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 10----------");
        nvserv.cau10().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 11----------");
        mbserv.cau11().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 12----------");
        nvserv.cau12().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 13----------");
        mbserv.cau13().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 14----------");
        cbserv.cau14().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 15----------");
        nvserv.cau15().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 16----------");
        for (Object[] objects : mbserv.cau16()) {
            System.out.println(objects[0] + " == " + objects[1] + " == " + objects[2]);
        }
        System.out.println();
        System.out.println("----------Cau 17----------");
        cbserv.cau17().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 18----------");
        for (Object[] objects : cbserv.cau18()) {
            System.out.println(objects[0] + " == " + objects[1]);
        }
        System.out.println();
        System.out.println("----------Cau 19----------");
        for (Object[] objects : cbserv.cau19()) {
            System.out.println(objects[0] + " == " + objects[1]);
        }
        System.out.println();
        System.out.println("----------Cau 20----------");
        cbserv.cau20().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 21----------");
        for (Object[] objects : cbserv.cau21()) {
            System.out.println(objects[0] + " == " + objects[1]);
        }
        System.out.println();
        System.out.println("----------Cau 22----------");
        nvserv.cau22().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 23----------");
        for (Object[] objects : nvserv.cau23()) {
            System.out.println(objects[0] + " == " + objects[1]);
        }
        System.out.println();
        System.out.println("----------Cau 24----------");
        for (Object[] objects : nvserv.cau24()) {
            System.out.println(objects[0] + " == " + objects[1]);
        }
        System.out.println();
        System.out.println("----------Cau 25----------");
        nvserv.cau25().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 26----------");
        nvserv.cau26().forEach(System.out::println);
        System.out.println();
        System.out.println("----------Cau 27----------");
        System.out.println(nvserv.cau27());
        System.out.println();
        System.out.println("----------Cau 28----------");
        cbserv.cau28().forEach(System.out::println);
    }
}
