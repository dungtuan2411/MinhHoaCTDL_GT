package com.dunglt2004110051.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab4_Bai02 {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<String>();
        nhapHoTen(listName);
        xuatHoTen(listName);
        xuatHoTenNgauNhien(listName);
        sapXepGiamDan(listName);
    }
    // Nhập
    static void nhapHoTen(ArrayList<String> dsHoTen) {
        System.out.println("===== Nhập danh sách họ tên: =====");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Họ tên: ");
            String name = scanner.nextLine();
            dsHoTen.add(name);

            System.out.print("Nhập thêm (Y/N)? ");
            String xacNhan = scanner.nextLine();
            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }
        }
        scanner.close();
    }
    // Xuất
    static void xuatHoTen(ArrayList<String> dsHoTen) {
        System.out.println("===== Danh sách họ tên: =====");
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
    }
    // Xuất ngẫu nhiên
    static void xuatHoTenNgauNhien(ArrayList<String> dsHoTen) {
        System.out.println("===== Sắp xếp ngẫu nhiên: =====");
        Collections.shuffle(dsHoTen);
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
    }
    // Sắp xếp giảm dần
    static void sapXepGiamDan(ArrayList<String> dsHoTen) {
        System.out.println("===== Sắp xếp giảm dần theo thứ tự alphabet: =====");
        Collections.sort(dsHoTen);
        Collections.reverse(dsHoTen);
        for (String hoTen : dsHoTen) {
            System.out.println(hoTen);
        }
    }
    // Xóa phần tử
    static void xoaPhanTu(ArrayList<String> dsHoTen) {
        
    }
}
