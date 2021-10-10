package com.dunglt2004110051.baitapthem;

public class Cow {
    // Thuộc tính
    double weight;
    String breed;
    String color;

    // Hàm khởi tạo mặc định
    Cow() {
    }

    // Hàm tạo 1 tham số
    Cow(double w) {
        weight = w;
    }

    // Hàm tạo 2 tham số
    Cow(double w, String br) {
        weight = w;
        breed = br;
    }

    // Hàm tạo 3 tham số
    Cow(double w, String br, String cl) {
        weight = w;
        breed = br;
        color = cl;
    }

    // Phương thức
    void inThongTin() {
        System.out.println("===== Thông tin cow =====");
        System.out.println("weight: " + weight + "kg" + " Breed: " + breed + " Color: " + color);
    }
}
