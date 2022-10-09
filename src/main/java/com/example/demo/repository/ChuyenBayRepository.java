package com.example.demo.repository;

import com.example.demo.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay , String> {

    //	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
    public List<ChuyenBay> cau1();

    //  4.Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
    @Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
    public List<ChuyenBay> cau4();

    //  5.Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
    @Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
    public List<ChuyenBay> cau5();

    //	6.Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
    @Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
    public int cau6();

    //	14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320
    @Query(value = "SELECT * from chuyenbay where DoDai < ( select TamBay from [dbo].[maybay] where Loai =N'Airbus A320')", nativeQuery = true)
    public List<ChuyenBay> cau14();

    //	17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
    @Query(value = "select * from [dbo].[chuyenbay] where [GaDi] in (select [GaDen] from [dbo].[chuyenbay]) and [GaDen] in (select [GaDi] from [dbo].[chuyenbay])", nativeQuery = true)
    public List<ChuyenBay> cau17();

    //	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
    @Query(value = "select [GaDi], count(*) as SoChuyenBay from [dbo].[chuyenbay] group by GaDi", nativeQuery = true)
    public List<Object[]> cau18();

    //	19. Với mỗi ga có chuyến bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
    @Query(value = "select [GaDi], sum(chiPhi) as Tongchiphi from [dbo].[chuyenbay] group by GaDi", nativeQuery = true)
    public List<Object[]> cau19();

    //	20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
    @Query(value = "select * from chuyenbay where [GioDi]<'12:00:00'", nativeQuery = true)
    public List<ChuyenBay> cau20();

    //	21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
    @Query(value = "select [GaDi], count(*) as soluong from [dbo].[chuyenbay]where [GioDi]<'12:00:00' group by [GaDi]", nativeQuery = true)
    public List<Object[]> cau21();

    //	28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing
    @Query(value = "SELECT MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi FROM chuyenbay "
            + "group by MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi "
            + "having DoDai <= all(select TamBay from [dbo].[maybay] where Loai like '%Boeing%')", nativeQuery = true)
    public List<ChuyenBay> cau28();



}
