package com.example.demo.repository;

import com.example.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
    //	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
    @Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
    public List<NhanVien> cau3();

    //	8. Cho biết tổng số lương phải trả cho các nhân viên.
    @Query(value = "select SUM([Luong]) from [dbo].[nhanvien]", nativeQuery = true)
    public int cau8();

    //	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
    @Query(value = "SELECT nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where chungnhan.MaMB=747", nativeQuery = true)
    public List<NhanVien> cau10();

    //	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
    @Query(value = "SELECT nhanvien.MaNV FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where ([Loai] like '%Boeing%' or [Loai] like '%Airbus%') "
            + "group by nhanvien.MaNV", nativeQuery = true)
    public List<String> cau12();

    //	15. Cho biết tên của các phi công lái máy bay Boein
    @Query(value = "SELECT nhanvien.Ten FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "where [Loai] like '%Boeing%' "
            + "group by nhanvien.Ten", nativeQuery = true)
    public List<String> cau15();

    //	22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
    @Query(value = "SELECT nhanvien.MaNV FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "group by  nhanvien.MaNV "
            + "having COUNT(maybay.MaMB)=3", nativeQuery = true)
    public List<String> cau22();

    //	23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
    @Query(value = "SELECT nhanvien.MaNV, MAX(maybay.TamBay) as TamBayLonNhat FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "group by  nhanvien.MaNV "
            + "HAVING COUNT(maybay.MaMB)>3", nativeQuery = true)
    public List<Object[]> cau23();

    //	24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
    @Query(value = "SELECT nhanvien.MaNV, COUNT(maybay.Loai) as TongLoaiSoMayBay FROM chungnhan INNER JOIN maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN nhanvien ON chungnhan.MaNV = nhanvien.MaNV "
            + "group by nhanvien.MaNV", nativeQuery = true)
    public List<Object[]> cau24();

    //	25. Tìm các nhân viên không phải là phi công.
    @Query(value = "select * from [dbo].[nhanvien] where MaNV not in (select MaNV from chungnhan)", nativeQuery = true)
    public List<NhanVien> cau25();

    //	26. Cho biết mã số của các nhân viên có lương cao nhất.
    @Query(value = "select MaNV from [dbo].[nhanvien] where Luong=(select max(Luong) from [dbo].[nhanvien])", nativeQuery = true)
    public List<String> cau26();

    //	27. Cho biết tổng số lương phải trả cho các phi công
    @Query(value = "SELECT sum(luong) as TongSoLuong FROM nhanvien where MaNV in (select MaNV from chungnhan)", nativeQuery = true)
    public int cau27();
}
