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
            System.out.println("\n||== Quản lý kho táo bằng ArrayList ==||");
            System.out.println("||1: Thêm táo vào kho                 ||");
            System.out.println("||2: Tìm táo theo màu                 ||");
            System.out.println("||3: In danh sách táo                 ||");
            System.out.println("||0: Kết thúc                         ||");
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
        char xacNhan = 'y';
        do {
            if (Character.toUpperCase(xacNhan) == 'Y') {
                Apple newApple = new Apple();
                newApple.nhapThongTin(scanner);
                listApple.add(newApple);
            } else
                System.out.println("Sai cú pháp! Chọn y hoặc n");

            System.out.print("Bạn muốn nhập thêm (Y/N)? ");
            xacNhan = scanner.next().charAt(0);
        } while (Character.toUpperCase(xacNhan) != 'N');
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

        System.out.println("\n===== Danh sách táo tìm thấy =====");
        for (int i = 0; i < listApple.size(); i++) {
            Apple foundedApples = listApple.get(i);
            if (foundedApples.color.equals(findColor)) {
                foundedApples.inThongTin();
            }
        }
    }

    static void inDanhSachTao(List<Apple> listApple) {
        System.out.println("\n======= Danh sách táo =========");
        for (int i = 0; i < listApple.size(); i++) {
            System.out.println("\n======== Táo thứ " + (i + 1));
            listApple.get(i).inThongTin();
        }
    }
}