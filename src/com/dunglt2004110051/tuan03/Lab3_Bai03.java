package com.dunglt2004110051.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn mảng bao nhiêu số: ");
        int sltp = scanner.nextInt();

        int[] mangSoNguyen = new int[sltp];
        
        nhapXuatMang(scanner, mangSoNguyen);
        soNhoNhat(mangSoNguyen);
        tbCong(mangSoNguyen);
    }

    // Nhập xuất mảng
    static void nhapXuatMang(Scanner scanner, int[] mangSoNguyen) {
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.printf("\nNhập số thứ %d: ", (i + 1));
            mangSoNguyen[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập: " + Arrays.toString(mangSoNguyen));
        for (int i : mangSoNguyen) {
            System.out.println(i);
        }

        Arrays.sort(mangSoNguyen);
        System.out.println("Mảng từ bé đến lớn: " + Arrays.toString(mangSoNguyen));
        for (int i : mangSoNguyen) {
            System.out.println(i);
        }
    }

    // Tìm số nhỏ nhất
    static void soNhoNhat(int[] numArr) {
        int min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            min = Math.min(min, numArr[i]);
        }
        System.out.println("Số nhỏ nhất: " + min);
    }

    // Trung bình cộng
    static void tbCong(int[] numArr) {
        int tong = 0, count = 0;
        float tbCong = 0f;
        for (int item : numArr) {
            if (item % 3 == 0) {
                tong += item;
                count++;
            }
        }
        tbCong = tong / count;
        System.out.printf("\nTrung bình cộng số chia hết cho 3: %.2f", tbCong);
    }
}