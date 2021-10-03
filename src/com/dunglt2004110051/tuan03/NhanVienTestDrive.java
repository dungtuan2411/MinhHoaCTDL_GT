package com.dunglt2004110051.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nv;
        // Hàm tạo mặc định
        nv = new NhanVien();
        nv.tenNhanVien = "Tèo";
        nv.luong = 2000000;
        nv.diaChi = "tp.hcm";
        nv.boPhanLamViec = "thiết kế";
        nv.ngaySinh = "25/10";
        nv.InThongTin();
        // Hàm tạo
        nv = new NhanVien("Tí", 50000000, "Tân Bình hẻm 68 Bùi Thị Xuân", "lao công", "12/02");
        nv.InThongTin();
    }
}
