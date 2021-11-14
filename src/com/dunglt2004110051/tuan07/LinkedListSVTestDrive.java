package com.dunglt2004110051.tuan07;

import java.util.Scanner;

import com.dunglt2004110051.tuan05.SVDV;

public class LinkedListSVTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tạo danh sách sinh viên
        LinkedListSV dssv = new LinkedListSV();
        menu(dssv, scanner);
    }

    static void menu(LinkedListSV ds, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nChương trình quản lý sinh viên");
            System.out.println("1: Thêm sinh viên");
            System.out.println("2: Thêm vào vị trí");
            System.out.println("3: Xóa tại vị trí");
            System.out.println("4: In danh sách");
            System.out.println("0: Kết thúc!");

            System.out.print("Bạn chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1: {
                scanner.nextLine();
                themVaoDanhSach(ds, scanner);
                break;
            }
            case 2: {
                scanner.nextLine();
                themVaoViTri(ds, scanner);
                break;
            }
            case 3: {
                xoaTaiViTri(ds, scanner);
                break;
            }
            case 4: {
                ds.printSV();
                break;
            }
            case 0: {
                System.out.println("Kết thúc!");
                break;
            }
            default:
                break;
            }
        } while (choice != 0);
    }

    static void themVaoDanhSach(LinkedListSV ds, Scanner scanner) {
        char ch = 'y';
        SVDV newSV;
        do {
            if (Character.toUpperCase(ch) == 'Y') {
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập điểm: ");
                float grade = scanner.nextFloat();
                // tạo sv mới
                newSV = new SVDV(name, grade);
                // thêm sv mới vào ds
                ds.add(newSV);
            } else
                System.out.println("Sai cú pháp. Chỉ nhập Y hoặc N");

            // Kiểm tra người dùng nhập thêm hay không
            System.out.print("Nhập thêm? (Y/N) ");
            ch = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(ch) != 'N');
    }

    static void themVaoViTri(LinkedListSV ds, Scanner scanner) {
        char ch = 'y';
        SVDV newSV;
        do {
            if (Character.toUpperCase(ch) == 'Y') {
                System.out.print("Nhập vị trí(bắt đầu từ 1): ");
                int position = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập điểm: ");
                float grade = scanner.nextFloat();
                // tạo sv mới
                newSV = new SVDV(name, grade);
                // thêm sv mới vào ds
                ds.addAt(position, newSV);
            } else
                System.out.println("Sai cú pháp. Chỉ nhập Y hoặc N");

            // Kiểm tra người dùng nhập thêm hay không
            System.out.print("Nhập thêm? (Y/N) ");
            ch = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(ch) != 'N');
    }

    static void xoaTaiViTri(LinkedListSV ds, Scanner scanner) {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập vị trí(bắt đầu từ 1): ");
        int position = scanner.nextInt();
        NodeSV svDeleted = ds.deleteAt(position);
        System.out.printf("Đã xóa sinh viên thứ %d: %s\n", position, svDeleted.sv.hoTen);
    }
}
