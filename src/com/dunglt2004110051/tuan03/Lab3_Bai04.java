package com.dunglt2004110051.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Bạn muốn nhập bao nhiêu sinh viên: ");
        int slsv = scanner.nextInt();
        scanner.nextLine();
        // Mảng tên
        String[] nameSV = new String[slsv];
        // Mảng điểm
        float[] diemSV = new float[slsv];

        nhapThongTin(scanner, nameSV, diemSV, slsv);
        sapXepTangDanTheoDiem(nameSV, diemSV);
        xepHangSinhVien(nameSV, diemSV);
    }

    static void nhapThongTin(Scanner scanner, String[] nameSV, float[] diemSV, int slsv) {
        for (int i = 0; i < slsv; i++) {
            System.out.print("\nNhập tên sinh viên " + (i + 1) + ": ");
            nameSV[i] = scanner.nextLine();
            System.out.print("Nhập điểm sinh viên: ");
            diemSV[i] = scanner.nextFloat();
            scanner.nextLine();
        }
    }

    static void sapXepTangDanTheoDiem(String[] nameSV, float[] diemSV) {
        float temp = 0;
        String tempName = "";
        for (int i = 0; i < diemSV.length - 1; i++) {
            for (int j = i + 1; j < diemSV.length; j++) {
                if (diemSV[i] > diemSV[j]) {
                    temp = diemSV[i];
                    tempName = nameSV[i];

                    diemSV[i] = diemSV[j];
                    nameSV[i] = nameSV[j];

                    diemSV[j] = temp;
                    nameSV[j] = tempName;
                }
            }
        }

        System.out.println("Mảng tên sinh viên: " + Arrays.toString(nameSV));
        System.out.println("Mảng điểm sinh viên: " + Arrays.toString(diemSV));
    }

    static void xepHangSinhVien(String[] nameSV, float[] diemSV) {
        String xepHang;

        System.out.println("\nDanh sách sinh viên tăng dần theo điểm: ");
        for (int i = 0; i < diemSV.length; i++) {
            float diem = diemSV[i];
            if (diem >= 9) {
                xepHang = "Xuất sắc";
                System.out.println("Tên: " + nameSV[i] + " - Điểm: " + diemSV[i] + " - " + xepHang);
                continue;
            } else if (diem < 9 && diem >= 7.5) {
                xepHang = "Giỏi";
                System.out.println("Tên: " + nameSV[i] + " - Điểm: " + diemSV[i] + " - " + xepHang);
                continue;
            } else if (diem < 7.5 && diem >= 6.5) {
                xepHang = "Khá";
                System.out.println("Tên: " + nameSV[i] + " - Điểm: " + diemSV[i] + " - " + xepHang);
                continue;
            } else if (diem < 6.5 && diem >= 5) {
                xepHang = "Trung bình";
                System.out.println("Tên: " + nameSV[i] + " - Điểm: " + diemSV[i] + " - " + xepHang);
                continue;
            } else {
                xepHang = "Yếu";
                System.out.println("Tên: " + nameSV[i] + " - Điểm: " + diemSV[i] + " - " + xepHang);
                continue;
            }
        }
    }
}
