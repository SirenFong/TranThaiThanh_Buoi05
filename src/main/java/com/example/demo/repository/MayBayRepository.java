package com.example.demo.repository;

import com.example.demo.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MayBayRepository extends CrudRepository<MayBay, String> {
    //	2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
    @Query(value = "select loai from [dbo].[maybay] where [TamBay]>10000", nativeQuery = true)
    public List<String> cau2();

    //	7. Có bao nhiêu loại máy báy Boeing.
    @Query(value = "select count(*) from [dbo].[maybay] where [Loai] like '%Boeing%'", nativeQuery = true)
    public int cau7();

    //	11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
    @Query(value = "SELECT maybay.MaMB FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where [dbo].[nhanvien].Ten like '%Nguyen%' "
            + "group by maybay.MaMB", nativeQuery = true)
    public List<String> cau11();

    //	13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
    @Query(value = "select Loai from maybay where TamBay < (select DoDai from chuyenbay where MaCB = 'VN280')", nativeQuery = true)
    public List<String> cau13();

    //	16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
    @Query(value = "SELECT maybay.MaMB, maybay.Loai, maybay.tambay, COUNT(distinct nhanvien.MaNV) AS SoLuongPhiCong FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN "
            + "nhanvien ON chungnhan.MaNV = nhanvien.MaNV group by maybay.MaMB, maybay.Loai,maybay.tambay", nativeQuery = true)
    public List<Object[]> cau16();

}
