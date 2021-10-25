package com.dunglt2004110051.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleArrayListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Apple> listApple = new ArrayList<Apple>();
        menu(listApple, scanner);
    }

    static void menu(List<Apple> listApple, Scanner scanner) {
        int luaChon;
        do {
            System.out.println("||== Quản lý kho táo bằng ArrayList ==||");
            System.out.println("||1: Thêm táo vào kho                 ||");
            System.out.println("||2: Tìm táo theo màu                 ||");
            System.out.println("||3: In danh sách táo                 ||");
            System.out.println("||====================================||");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    themTaoVaoKho(listApple, scanner);
                    break;
                case 2:
                    scanner.nextLine();
                    timTaoTheoMau(listApple, scanner);
                    break;
                case 3:
                    inDanhSachTao(listApple);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Nhập sai, nhập lại");
                    break;
            }

        } while (luaChon != 0);
    }

    static void themTaoVaoKho(List<Apple> listApple, Scanner scanner) {
        String xacNhan = "y";
        do {
            if (xacNhan.toUpperCase().equals("Y")) {
                System.out.println("Nhập thông tin táo: ");
                System.out.print("Mã id: ");
                int id = scanner.nextInt();

                System.out.print("Khối lượng: ");
                float weight = scanner.nextFloat();

                scanner.nextLine();
                System.out.print("Màu: ");
                String color = scanner.nextLine();

                listApple.add(new Apple(id, weight, color));
            } else
                System.out.println("Sai cú pháp! Chọn y hoặc n");

            System.out.print("Bạn muốn nhập thêm (Y/N)? ");
            xacNhan = scanner.nextLine();
        } while (!xacNhan.toUpperCase().equals("N"));
    }

    static Apple timTao(List<Apple> listApple, String color) {
        Apple foundApple = null;
        for (Apple apple : listApple) {
            if (apple.color.equals(color)) {
                foundApple = apple;
                return foundApple;
            }
        }
        return foundApple;
    }

    static void timTaoTheoMau(List<Apple> listApple, Scanner scanner) {
        System.out.print("Nhập màu cần tìm: ");
        String findColor = scanner.nextLine();

        Apple foundApple = timTao(listApple, findColor);

        while (!listApple.contains(foundApple)) {
            System.out.println("Không có táo màu này!");
            System.out.print("Nhập lại: ");
            findColor = scanner.nextLine();
            foundApple = timTao(listApple, findColor);
        }
        System.out.println("\n=======Táo đã tìm thấy: ");
        foundApple.inThongTin();
    }

    static void inDanhSachTao(List<Apple> listApple) {
        System.out.println("\n======= Danh sách táo =========");
        for (int i = 0; i < listApple.size(); i++) {
            System.out.println("======== Táo thứ " + (i + 1));
            listApple.get(i).inThongTin();
        }
    }
}