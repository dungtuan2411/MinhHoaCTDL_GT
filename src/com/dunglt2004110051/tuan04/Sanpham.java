package com.dunglt2004110051.tuan04;

public class Sanpham {
    String tenSanPham;
    double gia;

    Sanpham(String name, double price) {
        tenSanPham = name;
        gia = price;
    }

    void inThongTin() {
        System.out.println("==== Thông tin sản phẩm ====");
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá: " + gia);
    }
}
