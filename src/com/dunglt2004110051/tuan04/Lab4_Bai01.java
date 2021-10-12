package com.dunglt2004110051.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Bai01 {
    public static void main(String[] args) {
        ArrayList<Double> mangSoThuc = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        String xacNhan;
        double tong = 0;
        System.err.println("==== Nhập danh sách số ====");
        do {
            System.out.print("Nhập số: ");
            double num = scanner.nextDouble();
            mangSoThuc.add(num);

            scanner.nextLine();

            System.out.print("Nhập thêm không (Y/N)?");
            xacNhan = scanner.nextLine();
            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }
        } while (xacNhan.toUpperCase().equals("Y"));

        System.out.println("==== Danh sách vừa nhập ====");
        for (Double soThuc : mangSoThuc) {
            tong += soThuc;
            System.out.println(soThuc);
        }

        System.out.println("Tổng các số vừa nhập: " + tong);
        scanner.close();
    }
}
