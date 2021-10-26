package com.dunglt2004110051.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SVDVArrayList {
    // Thuộc tính
    List<SVDV> dssv;

    // Hàm tạo
    SVDVArrayList() {
        dssv = new ArrayList<SVDV>();
    }

    // Nhập danh sách sinh viên
    void nhapDanhSachSinhVien(Scanner scanner) {
        String xacNhan = "y";
        SVDV sv;
        do {
            if (!xacNhan.toUpperCase().equals("Y")) {
                System.out.println("Nhập lại! Chỉ chọn Y hoặc N");
            } else {
                sv = new SVDV();
                sv.nhapThongTin(scanner);
                // Thêm sinh viên vào danh sách
                dssv.add(sv);

                scanner.nextLine();
            }
            System.out.print("Nhập thêm sinh viên (Y/N)?");
            xacNhan = scanner.nextLine();
        } while (!xacNhan.toUpperCase().equals("N"));
    }

    // Xuất danh sách sinh viên
    void xuatDanhSachSinhVien() {
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

    void xuatDanhSachSinhVienTheoDiem() {
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
        // Sắp xếp tăng dần
        Collections.sort(dssv, comp);

        System.out.println("Điểm tăng dần");
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println("===== Sinh viên thứ: " + (i + 1) + " =====");
            dssv.get(i).inThongTin();
        }
    }

    SVDV timSinhVien(String hoTenCanTim) {
        SVDV svCanTim = null;
        for (SVDV svdv : dssv) {
            if (svdv.hoTen.equals(hoTenCanTim)) {
                svCanTim = svdv;
                return svCanTim;
            }
        }
        return svCanTim;
    }

    void timSinhVienTheoTen(Scanner scanner) {
        if (dssv.isEmpty()) {
            System.out.println("Chưa có sinh viên");
            return;
        }
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(findName);
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(findName);
        }
        System.out.println("\nThông tin sinh viên tìm thấy: ");
        svTim.inThongTin();
    }

    void suaSinhVienTheoTen(Scanner scanner) {
        if (dssv.isEmpty()) {
            System.out.println("Chưa có sinh viên");
            return;
        }
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(findName);
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(findName);
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

    void xoaSinhVienTheoTen(Scanner scanner) {
        if (dssv.isEmpty()) {
            System.out.println("Chưa có sinh viên");
            return;
        }
        System.out.print("Nhập họ tên cần tìm: ");
        String findName = scanner.nextLine();

        SVDV svTim = timSinhVien(findName);
        
        while (!dssv.contains(svTim)) {
            System.out.print("Tên không tồn tại, nhập lại: ");
            findName = scanner.nextLine();
            svTim = timSinhVien(findName);
        }
        dssv.remove(svTim);
        System.out.println("\n======== Danh sách sau khi xóa: ");
        for (SVDV svdv : dssv) {
            svdv.inThongTin();
        }
    }
}
