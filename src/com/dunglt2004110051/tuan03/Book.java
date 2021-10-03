package com.dunglt2004110051.tuan03;

public class Book {
    // Thuộc tính
    double gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;
    // Hàm tạo mặc định
    Book() {}
    // Hàm tạo 1 tham số
    Book(double g) {
        gia = g;
    }
    // Hàm tạo 3 tham số
    Book(double g, String nxb, int nam) {
        gia = g;
        nhaXuatBan = nxb;
        namXuatBan = nam;
    }
    // Hàm tạo 6 tham số
    Book(double g, String nxb, int nam, double gb, int sl, String category) {
        gia = g;
        nhaXuatBan = nxb;
        namXuatBan = nam;
        giaBan = gb;
        soLuong = sl;
        loai = category;
    }
    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin sách =====");
        System.out.println("Giá: " + gia + "đ");
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá bán: " + giaBan + "đ");
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Loại: " + loai);
    }
}
