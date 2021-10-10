package com.dunglt2004110051.baitapthem;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        // Hàm tạo 1 tham số
        cow = new Cow(15);
        cow.inThongTin();
        // Hàm tạo 2 tham số
        cow = new Cow(10, "bò sữa");
        cow.inThongTin();
        // Hàm tạo 3 tham số
        cow = new Cow(25.5, "Tây Ban Nha", "Đen");
        cow.inThongTin();
    }
}
