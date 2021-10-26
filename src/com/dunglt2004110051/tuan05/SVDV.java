package com.dunglt2004110051.tuan05;

import java.util.Scanner;

public class SVDV {
    String hoTen;
    float diem;

    SVDV() {
    }

    SVDV(String name, float grade) {
        hoTen = name;
        diem = grade;
    }

    void nhapThongTin(Scanner scanner) {
        System.out.print("\nNhập tên sinh viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình sinh viên: ");
        diem = scanner.nextFloat();
    }

    void inThongTin() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Điểm trung bình: " + diem);
    }
}
