package com.dunglt2004110051.tuan04;

public class Sanpham {
    public String tenSanPham;
    public double gia;

    public Sanpham() {
    }

    public Sanpham(String name, double price) {
        tenSanPham = name;
        gia = price;
    }

    public void inThongTin() {
        System.out.println("==== Thông tin sản phẩm ====");
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá: " + gia);
    }
}
