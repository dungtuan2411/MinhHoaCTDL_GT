package com.dunglt2004110051.baitapthem;

import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        // Hàm tạo mặc định
        book = new Book();
        book.gia = 15000;
        book.nhaXuatBan = "Kim Đồng";
        book.namXuatBan = 2003;
        book.giaBan = 20000;
        book.soLuong = 26;
        book.loai = "Sách thiếu nhi";
        book.InThongTin();
        // 1 tham số
        book = new Book(15500.0);
        book.nhaXuatBan = "Đồng Nai";
        book.InThongTin();
        // 3 tham số
        book = new Book(17000.0, "Trẻ", 1998);
        book.InThongTin();
        // 6 tham số
        book = new Book(23000.0, "Kim Đồng", 2003, 24000.0, 1, "Kinh dị");
        book.InThongTin();

        // Mảng
        System.out.println("====");
        System.out.print("Số lượng sách: ");
        Scanner scanner = new Scanner(System.in);

        int slpt = scanner.nextInt();

        Book[] listBook = new Book[slpt];

        for (int i = 0; i < listBook.length; i++) {
            System.out.println("Sách thứ " + (i + 1) + ":");
            System.out.print("Giá: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhà xuất bản: ");
            String nsx = scanner.nextLine();

            System.out.print("Năm xuất bản: ");
            int namSX = scanner.nextInt();

            System.out.print("Giá bán: ");
            double giaBan = scanner.nextDouble();

            System.out.print("Số lượng: ");
            int sl = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Loại: ");
            String loai = scanner.nextLine();
            listBook[i] = new Book(gia, nsx, namSX, giaBan, sl, loai);
        }

        for (int i = 0; i < listBook.length; i++) {
            System.out.printf("==== Sách thứ %d: =====", (i + 1));
            listBook[i].InThongTin();
        }

        scanner.close();
    }
}
