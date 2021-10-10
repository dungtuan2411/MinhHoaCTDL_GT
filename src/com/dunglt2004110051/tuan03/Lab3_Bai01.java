package com.dunglt2004110051.tuan03;

import java.util.Scanner;

public class Lab3_Bai01 {
    public static void main(String[] args) {
        boolean isSNT = false;
        System.out.print("Nhập 1 số: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isSNT = false;
                break;
            }
            isSNT = true;
        }
        if (isSNT) {
            System.out.println("Là số nguyên tố");
            scanner.close();
            return;
        }
        System.out.println("Không phải số nguyên tố");
        scanner.close();
        return;
    }
}
