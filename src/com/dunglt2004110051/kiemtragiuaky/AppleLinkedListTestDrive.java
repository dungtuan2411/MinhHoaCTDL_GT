package com.dunglt2004110051.kiemtragiuaky;

import java.util.Scanner;

public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleLinkedList linkedListApple = new AppleLinkedList();
        themVaoCuoiDanhSach(linkedListApple, scanner);
        inDanhSachTao(linkedListApple);
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
    
    static void inDanhSachTao(AppleLinkedList linkedListApple) {
        System.out.println("====== Danh sách táo ==========");
        linkedListApple.inDanhSach();
    }


}
