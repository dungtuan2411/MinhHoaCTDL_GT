package com.dunglt2004110051.tuan03;

public class Lab3 {
    public static void main(String[] args) {
        bangCuuChuong();
    }

    static void bangCuuChuong() {
        int i, j;
        for (i = 2; i < 10; i++) {
            System.out.println("=== Bảng cửu chương " + i + " ===");
            for (j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
            }
        }
    }
}
