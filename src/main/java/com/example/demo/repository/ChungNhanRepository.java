package com.example.demo.repository;

import com.example.demo.entity.ChungNhan;
import com.example.demo.entity.ChungNhanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChungNhanRepository extends JpaRepository<ChungNhan , ChungNhanPK> {
    //	9. Cho biết mã số của các phi công lái máy báy Boeing
    @Query(value = "SELECT nhanvien.MaNV FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where  Loai like '%Boeing%' "
            + "group by nhanvien.MaNV", nativeQuery = true)
    public List<String> cau9();
}
