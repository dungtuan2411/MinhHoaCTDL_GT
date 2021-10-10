package com.dunglt2004110051.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Bai01 {
    public static void main(String[] args) {
        ArrayList<Double> mangSoThuc = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        double tong = 0;
        while (true) {
            System.out.print("Nhập số tiếp theo: ");
            double num = scanner.nextDouble();
            mangSoThuc.add(num);

            scanner.nextLine();

            System.out.print("Nhập thêm không (Y/N)?");
            String xacNhan = scanner.nextLine();
            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }
        }

        for (Double soThuc : mangSoThuc) {
            tong += soThuc;
            System.out.println(soThuc);
        }

        System.out.println("Tổng các số vừa nhập: " + tong);
        scanner.close();
    }
}
