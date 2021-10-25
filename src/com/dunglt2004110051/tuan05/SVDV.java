package com.dunglt2004110051.tuan05;

public class SVDV {
    String hoTen;
    float diem;

    SVDV(String name, float grade) {
        hoTen = name;
        diem = grade;
    }

    void inThongTin() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Điểm trung bình: " + diem);
    }
}
