package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "MaNV")
    private String maNV;

    @Column(name ="Ten")
    private String ten;

    @Column(name = "Luong")
    private int luong;

    @OneToMany(mappedBy = "nhanVien")
    private List<ChungNhan> chungNhans;

    @Override
    public String toString(){
        return "NhanVien [maNV=" + maNV + ", ten=" + ten +",luong=" +luong + "]";
    }
}
