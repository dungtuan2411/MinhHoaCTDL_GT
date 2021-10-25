package com.dunglt2004110051.kiemtragiuaky;

import java.util.Scanner;

public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleLinkedList linkedListApple = new AppleLinkedList();
        menu(linkedListApple, scanner);
    }

    static void menu(AppleLinkedList linkedListApple, Scanner scanner) {
        int luaChon;
        do {
            System.out.println("\n||== Quản lý kho táo bằng ArrayList ==||");
            System.out.println("||1: Thêm táo vào cuối kho            ||");
            System.out.println("||2: Thêm táo theo đầu kho            ||");
            System.out.println("||3: In danh sách táo                 ||");
            System.out.println("||0: Kết thúc                         ||");
            System.out.println("||====================================||");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                scanner.nextLine();
                themVaoCuoiDanhSach(linkedListApple, scanner);
                    break;
                case 2:
                    scanner.nextLine();
                    themVaoDauDanhSach(linkedListApple, scanner);
                    break;
                case 3:
                    inDanhSachTao(linkedListApple);
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

    static void themVaoCuoiDanhSach(AppleLinkedList linkedListApple, Scanner scanner) {
        String xacNhan = "y";
        do {
            if (xacNhan.toUpperCase().equals("Y")) {
                Apple appleNhap = Apple.nhapThongTin(scanner);
                linkedListApple.themVaoCuoiDanhSach(appleNhap);
            } else
                System.out.println("Sai cú pháp! Chọn y hoặc n");

            System.out.print("Nhập thêm (Y/N) ?");
            xacNhan = scanner.nextLine(); 
            
        } while (!xacNhan.toUpperCase().equals("N"));
    }

    static void themVaoDauDanhSach(AppleLinkedList linkedListApple, Scanner scanner) {
        System.out.println("Thêm táo mới vào đầu danh sách: ");
        String xacNhan = "y";
        do {
            if (xacNhan.toUpperCase().equals("Y")) {
                Apple appleNhap = Apple.nhapThongTin(scanner);
                linkedListApple.themVaoDauDanhSach(appleNhap);
            } else
                System.out.println("Sai cú pháp! Chọn y hoặc n");

            System.out.print("Nhập thêm (Y/N) ?");
            xacNhan = scanner.nextLine(); 
            
        } while (!xacNhan.toUpperCase().equals("N"));
    }
    
    static void inDanhSachTao(AppleLinkedList linkedListApple) {
        System.out.println("====== Danh sách táo ==========");
        linkedListApple.inDanhSach();
    }
}
