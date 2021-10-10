package com.dunglt2004110051.baitapthem;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan tk;
        // Hàm tạo mặc định
        tk = new TaiKhoan();
        tk.tenChuTaiKhoan = "Mẹo";
        tk.soTaiKhoan = "021412457931517556";
        tk.soDu = 15000;
        tk.InThongTin();
        // Hàm tạo 3 tham số
        tk = new TaiKhoan("Dần", "021432447262175998", 3000);
        tk.InThongTin();
    }
}
