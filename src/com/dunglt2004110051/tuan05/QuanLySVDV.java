package com.dunglt2004110051.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLySVDV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SVDV> dsSinhVien = new ArrayList<>();
        menu(dsSinhVien, scanner);
    }

    // Menu
    static void menu(List<SVDV> dssv, Scanner scanner) {
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
                nhapDanhSachSinhVien(dssv, scanner);
                break;
            case 2:
                xuatDanhSachSinhVien(dssv);
                break;
            case 3:
                xuatDanhSachSinhVienTheoDiem(dssv);
                break;
            case 4:
                scanner.nextLine();
                timSinhVienTheoTen(dssv, scanner);
                break;
            case 5:
                scanner.nextLine();
                suaSinhVienTheoTen(dssv, scanner);
                break;
            case 6:
                scanner.nextLine();
                xoaSinhVienTheoTen(dssv, scanner);
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

    // Nhập danh sách sinh viên
    static void nhapDanhSachSinhVien(List<SVDV> dssv, Scanner scanner) {
        String xacNhan = "y";
        do {
            if (!xacNhan.toUpperCase().equals("Y")) {
                System.out.println("Nhập lại! Chỉ chọn Y hoặc N");
            } else {
                System.out.print("\nNhập tên sinh viên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập điểm trung bình sinh viên: ");
                float dtb = scanner.nextFloat();

                dssv.add(new SVDV(name, dtb));

                scanner.nextLine();
            }
            System.out.print("Nhập thêm sinh viên (Y/N)?");
            xacNhan = scanner.nextLine();
        } while (!xacNhan.toUpperCase().equals("N"));
    }

    static void xuatDanhSachSinhVien(List<SVDV> dssv) {
        if (dssv.isEmpty()) {
            System.out.println("Chưa có sinh viên");
            return;
        }
        System.out.println("2. Thông tin sinh viên");
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println("===== Sinh viên thứ: " + (i + 1) + " =====");
            dssv.get(i).inThongTin();
        }
    }

    static void xuatDanhSachSinhVienTheoDiem(List<SVDV> dssv) {
        if (dssv.isEmpty()) {
            System.out.println("Chưa có sinh viên");
            return;
        }
        System.out.println("3. Thông tin sinh viên theo điểm");

        Comparator<SVDV> comp = new Comparator<SVDV>() {
            @Override
            public int compare(SVDV sv1, SVDV sv2) {
                return Double.compare(sv1.diem, sv2.diem);
            }
        };
        Collections.sort(dssv, comp);
        System.out.println("Điểm tăng dần");
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println("===== Sinh viên thứ: " + (i + 1) + " =====");
            dssv.get(i).inThongTin();
        }
    }

    static SVDV timSinhVien(List<SVDV> dssv, String hoTenCanTim) {
        SVDV svCanTim = null;
        for (SVDV svdv : dssv) {
            if (svdv.hoTen.equals(hoTenCanTim)) {
                svCanTim = svdv;
                return svCanTim;
            }
        }
        return svCanTim;
    }

    static void timSinhVienTheoTen(List<SVDV> dssv, Scanner scanner) {
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(dssv, findName);
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(dssv, findName);
        }
        System.out.println("\nThông tin sinh viên tìm thấy: ");
        svTim.inThongTin();
    }

    static void suaSinhVienTheoTen(List<SVDV> dssv, Scanner scanner) {
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(dssv, findName);
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(dssv, findName);
        }

        int luaChonSua;

        System.out.println("1. Sửa tên");
        System.out.println("2. Sửa điểm");
        System.out.print("Bạn chọn: ");
        luaChonSua = scanner.nextInt();

        switch (luaChonSua) {
        case 1:
            scanner.nextLine();
            System.out.print("Nhập tên cần sửa: ");
            svTim.hoTen = scanner.nextLine();
            break;
        case 2:
            System.out.print("Nhập điểm cần sửa: ");
            svTim.diem = scanner.nextFloat();
            break;
        default:
            break;
        }
    }

    static void xoaSinhVienTheoTen(List<SVDV> dssv, Scanner scanner) {
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(dssv, findName);
        
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(dssv, findName);
        }
        SVDV.xoaSinhVien(dssv, svTim);
    }
}
