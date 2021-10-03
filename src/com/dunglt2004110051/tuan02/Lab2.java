package com.dunglt2004110051.tuan02;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        menuChucNang();
    }

    static void ptBac1(Scanner scanner) {
        System.out.println("Giải phương trình bậc 1");
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm: " + (int) (-b / a));
        }
    }

    static void ptBac2(Scanner scanner) {
        System.out.println("Giải phương trình bậc 2");
        System.out.print("Nhập a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhập c: ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
            } else {
                int x1 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
                int x2 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.printf("Phương trình bậc 2 có nghiệm x1 = %d và x2 = %d", x1, x2);
            }
        }
    }

    static void tinhTienDien(Scanner scanner) {
        System.out.println("Tính tiền điện");
        System.out.print("Nhập số tiền điện: ");
        int soDien = scanner.nextInt();
        float tongTien;
        if (soDien > 0 && soDien <= 50) {
            tongTien = (soDien * 1000);
            System.out.println(tongTien);
        } else {
            tongTien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println(tongTien);
        }
    }

    static void menuChucNang() {
        int choose;
        System.out.println("|--------------------------|");
        System.out.println("|1: Giải phương trình bậc 1|");
        System.out.println("|2: Giải phương trình bậc 2|");
        System.out.println("|3: Tính tiền điện         |");
        System.out.println("|4: Kết thúc chương trình  |");
        System.out.println("|--------------------------|");
        do {
            System.out.print("\nBạn chọn: ");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ptBac1(scanner);
                    break;
                case 2:
                    ptBac2(scanner);
                    break;
                case 3:
                    tinhTienDien(scanner);
                    break;
                case 4:
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Nhập sai! Vui lòng nhập lại");
                    break;
            }
        } while (choose != 4);
    }
}
