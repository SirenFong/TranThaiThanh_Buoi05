package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVien nhanVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "MaMB")
    private MayBay mayBay;

}
