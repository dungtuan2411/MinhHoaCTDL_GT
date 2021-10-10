package com.dunglt2004110051.baitapthem;

public class TaiKhoan {
    // Thuộc tính
    String tenChuTaiKhoan;
	String soTaiKhoan;
	double soDu;
    // Hàm tạo
    TaiKhoan() {

    }
    TaiKhoan(String ten, String stk, double sd) {
        tenChuTaiKhoan = ten;
        soTaiKhoan = stk;
        soDu = sd;
    }
    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin tài khoản =====");
        System.out.println("Tên chủ tài khoản: " + tenChuTaiKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.printf("Số dư: %.1f đ\n", soDu);
    }
}
