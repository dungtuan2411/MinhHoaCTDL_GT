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

        arrayBooks();
    }

    // Bổ sung mảng
    static void arrayBooks() {
        System.out.println("==============");
        System.out.print("Số lượng sách: ");
        Scanner scanner = new Scanner(System.in);

        int slpt = scanner.nextInt();

        Book[] listBook = new Book[slpt];
        menu(listBook, scanner, slpt);
    }

    // Menu
    static void menu(Book[] listBook, Scanner scanner, int slpt) {
        int luaChon;
        System.out.println("\n===== Menu chương trình =====");
        System.out.println("1: Nhập danh sách");
        System.out.println("2: Xuất danh sách");
        System.out.println("3: Thêm");
        System.out.println("4: Xóa");
        System.out.println("0: Kết thúc");
        System.out.println("===============================");
        do {
            System.err.print("\nBạn chọn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    nhapDanhSach(listBook, scanner, slpt);
                    break;
                case 2:
                    xuatDanhSach(listBook);
                    break;
                case 3:
                    themPhanTu(listBook, scanner);
                    break;
                case 0:
                    System.out.println("Kết thúc!");
                    ;
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }

    // Nhập danh sách
    static Book nhap(Scanner scanner) {
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

    static void nhapDanhSach(Book[] listBook, Scanner scanner, int slpt) {
        for (int i = 0; i < slpt; i++) {
            System.out.println("\nSách thứ " + (i + 1));
            listBook[i] = nhap(scanner);
        }
    }

    // Xuất danh sách
    static void xuatDanhSach(Book[] listBook) {
        if (listBook.length == 0) {
            System.out.println("Chưa có sách");
            return;
        }
        System.out.println("===== Danh sách hiện tại =====");
        for (int i = 0; i < listBook.length; i++) {
            System.out.printf("\nSách thứ %d\n", (i + 1));
            listBook[i].InThongTin();
        }
    }

    // Thêm phần tử mới vào cuối mảng
    static void themPhanTu(Book[] listBooks, Scanner scanner) {
        System.out.println("\n===== Nhập thông tin sách muốn thêm =====");

        Book newBook = nhap(scanner);

        int arrLength = listBooks.length;

        Book[] newListBook = new Book[arrLength + 1];

        for (int i = 0; i < arrLength; i++) {
            newListBook[i] = listBooks[i];
        }

        newListBook[arrLength] = newBook;

        System.out.println("\n===== Danh sách sau khi thêm =====");
        for (Book book : newListBook) {
            book.InThongTin();
        }
    }
    // Xóa phần tử
    static void xoaPhanTu(Book[] listBooks, Scanner scanner, int slpt) {
        
    }
}