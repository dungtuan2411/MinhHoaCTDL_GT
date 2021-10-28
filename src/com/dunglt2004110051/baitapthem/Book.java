package com.dunglt2004110051.baitapthem;

import java.util.Scanner;

public class Book {
    // Thuộc tính
    double gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;
    // Hàm tạo mặc định
    Book() {}
    // Hàm tạo 1 tham số
    Book(double g) {
        gia = g;
    }
    // Hàm tạo 3 tham số
    Book(double g, String nxb, int nam) {
        gia = g;
        nhaXuatBan = nxb;
        namXuatBan = nam;
    }
    // Hàm tạo 6 tham số
    Book(double g, String nxb, int nam, double gb, int sl, String category) {
        gia = g;
        nhaXuatBan = nxb;
        namXuatBan = nam;
        giaBan = gb;
        soLuong = sl;
        loai = category;
    }
    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin sách =====");
        System.out.println("Giá: " + gia + "đ");
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá bán: " + giaBan + "đ");
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Loại: " + loai);
    }
    // Nhập danh sách
    Book nhapDanhSach(Scanner scanner) {
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

        Book book = new Book(gia, nsx, namSX, giaBan, sl, loai);
        return book;
    }
}
