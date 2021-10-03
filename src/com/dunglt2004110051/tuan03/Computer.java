package com.dunglt2004110051.tuan03;

public class Computer {
    // Thuộc tính
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String Ram;
    String CPU;
    double gia;
    int namBaoHanh;

    // Hàm tạo
    Computer() {
    }

    Computer(String nsx, int namsx, String hdh, String ram, String cpu, double g, int nbh) {
        nhaSanXuat = nsx;
        namSanXuat = namsx;
        heDieuHanh = hdh;
        Ram = ram;
        CPU = cpu;
        gia = g;
        namBaoHanh = nbh;
    }

    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin máy tính =====");
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("Ram: " + Ram);
        System.out.println("CPU: " + CPU);
        System.out.printf("Giá: %.1f $ \n", gia);
        System.out.println("Năm bảo hành: " + namBaoHanh);
    }
}
