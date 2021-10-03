package com.dunglt2004110051.tuan03;

public class NhanVien {
    // Thuộc tính
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    NhanVien() {}
    // Hàm tạo
    NhanVien(String ten, double salary, String address, String department, String bday){
        tenNhanVien = ten;
        luong = salary;
        diaChi = address;
        boPhanLamViec = department;
        ngaySinh = bday;
    }
    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin nhân viên =====");
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.printf("Lương: %.1f đ", luong);
        System.out.println("\nĐịa chỉ: " + diaChi);
        System.out.println("Bộ phận làm việc: " + boPhanLamViec);
        System.out.println("Ngày sinh: " + ngaySinh);
    }
}
