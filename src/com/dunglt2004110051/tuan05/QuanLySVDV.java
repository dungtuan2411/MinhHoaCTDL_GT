package com.dunglt2004110051.tuan05;

import java.util.Scanner;

public class QuanLySVDV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List<SVDV> dsSinhVien = new ArrayList<>();

        SVDVArrayList dsSinhVien = new SVDVArrayList();
        menu(dsSinhVien, scanner);
    }

    // Menu
    static void menu(SVDVArrayList dssv, Scanner scanner) {
        int luaChon;
        do {
            System.out.println("\n============ Menu chương trình ==================||");
            System.out.println("|| 1: Nhập danh sách sinh viên​                   ||");
            System.out.println("|| 2: Xuất danh sách sinh viên đã nhập​           ||");
            System.out.println("|| 3: Xuất danh sách sinh viên theo khoảng điểm  ||​");
            System.out.println("|| 4: Tìm sinh viên theo họ tên                  ||");
            System.out.println("|| 5: Tìm và sửa sinh viên theo họ tên​           ||");
            System.out.println("|| 6: Tìm và xóa theo họ tên​                     ||");
            System.out.println("|| 7: Kết thúc                                   ||");
            System.out.println("|| ==============================================||");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
            case 1:
                scanner.nextLine();
                dssv.nhapDanhSachSinhVien(scanner);;
                break;
            case 2:
                dssv.xuatDanhSachSinhVien();
                break;
            case 3:
                dssv.xuatDanhSachSinhVienTheoDiem();
                break;
            case 4:
                scanner.nextLine();
                dssv.timSinhVienTheoTen(scanner);
                break;
            case 5:
                scanner.nextLine();
                dssv.suaSinhVienTheoTen(scanner);
                break;
            case 6:
                scanner.nextLine();
                dssv.xoaSinhVienTheoTen(scanner);
                break;
            case 7:
                System.out.println("Kết thúc");
                break;
            default:
                System.out.println("Nhập sai, nhập lại!");
                break;
            }

        } while (luaChon != 7);
    }
}
