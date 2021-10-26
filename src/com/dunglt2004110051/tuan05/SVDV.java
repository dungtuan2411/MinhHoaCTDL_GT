package com.dunglt2004110051.tuan05;

import java.util.List;

public class SVDV {
    String hoTen;
    float diem;

    SVDV() {
    }

    SVDV(String name, float grade) {
        hoTen = name;
        diem = grade;
    }

    void inThongTin() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Điểm trung bình: " + diem);
    }

    static void xoaSinhVien(List<SVDV> dssv, SVDV sv) {
        dssv.remove(sv);
        System.out.println("\n======== Danh sách sau khi xóa: ");
        for (SVDV svdv : dssv) {
            svdv.inThongTin();
        }
    }
}
