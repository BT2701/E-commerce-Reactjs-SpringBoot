package com.example.demo.Repository;

import com.example.demo.Model.KhachHang;
import com.example.demo.Model.SanPham;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang, Integer> {
    @Query("select max (kh.makh) from khachhang kh")
    public Integer findMaxId();
    @Query("select kh from taikhoan tk inner join khachhang kh on kh.makh=tk.khachhang.makh where kh.makh=:makh")
    public Object getById(@Param("makh") int makh);
    @Modifying
    @Transactional
    @Query("update khachhang kh set kh.avt=:avt where kh.makh=:makh")
    public void updateAvt(@Param("avt")String avt, @Param("makh")int makh);
}
