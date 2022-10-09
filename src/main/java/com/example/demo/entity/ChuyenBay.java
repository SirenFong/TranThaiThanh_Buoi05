package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChuyenBay implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "macb")
    private String maCB;

    @Column(name = "gadi")
    private String gaDi;

    @Column(name = "gaden")
    private String gaDen;

    @Column(name = "dodai")
    private int doDai;

    @Column(name = "giodi")
    private Date gioDi;

    @Column(name = "gioden")
    private Date gioDen;

    @Column(name = "chiphi")
    private int chiPhi;

    @Override
    public String toString(){
        return "ChuyenBay [maCB = " +maCB+",gaDi = "+gaDi+ ", gaDen = "+gaDen+",gioDi = "+ gioDi+",gioDen ="+gioDen+",chiPhi = "+chiPhi+"]";
    }

}
