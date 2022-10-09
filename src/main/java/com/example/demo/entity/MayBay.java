package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MayBay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "mamb")
    private String maMB;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tambay")
    private int tamBay;

    @OneToMany(mappedBy = "mayBay")
    private List<ChungNhan> chungNhans;

    @Override
    public String toString(){
        return "MayBay [maMB = " +maMB +", loai = "+loai+",tamBay = "+tamBay+"]";
    }

}
