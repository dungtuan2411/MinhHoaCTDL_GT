package com.dunglt2004110051.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab4_Bai03 {
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm
        menu();
    }

    static void menu() {
        ArrayList<Sanpham> dsSanPham = new ArrayList<Sanpham>();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("\n===== Menu chương trình =====");
            System.out.println("1: Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2: Sắp xếp giảm dần theo giá và xuất ra màn hình ");
            System.out.println("3: Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4: Xuất giá trung bình của các sản phẩm");
            System.out.println("5: Kết thúc chương trình");
            System.out.println("=============================");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    scanner.nextLine();
                    nhapDanhSachSanPham(dsSanPham, scanner);
                    break;
                case 2:
                    sapXepGiamDanTheoGia(dsSanPham);
                    break;
                case 3:
                    scanner.nextLine();
                    xoaSanPhamTheoTen(dsSanPham, scanner);
                    break;
                case 4:
                    xuatGiaTrungBinh(dsSanPham);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Nhập sai, nhập lại!");
                    break;
            }
        } while (luaChon != 5);
    }

    static void nhapDanhSachSanPham(ArrayList<Sanpham> listSP, Scanner scanner) {
        String xacNhan;
        do {
            System.out.print("Nhập tên sản phẩm: ");
            String tenSP = scanner.nextLine();
            System.err.print("Nhập giá: ");
            double price = scanner.nextDouble();

            listSP.add(new Sanpham(tenSP, price));

            scanner.nextLine();
            System.out.println("=====");
            System.out.print("Nhập thêm (Y/N)? ");
            xacNhan = scanner.nextLine();
            System.out.println("=====");

            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }

        } while (xacNhan.toUpperCase().equals("Y"));
    }

    static void sapXepGiamDanTheoGia(ArrayList<Sanpham> listSP) {
        if (listSP.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        Comparator<Sanpham> comp = new Comparator<Sanpham>() {
            public int compare(Sanpham sp1, Sanpham sp2) {
                return Double.compare(sp1.gia, sp2.gia);
            }
        };
        Collections.sort(listSP, comp);
        Collections.reverse(listSP);
        System.out.println("\n==== Giá tiền giảm dần: ====\n");

        for (Sanpham sanpham : listSP) {
            sanpham.inThongTin();
        }
    }

    // Tìm sản phẩm
    static Sanpham timSanPham(ArrayList<Sanpham> listSP, Scanner scanner) {
        Sanpham result = null;
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String nameSP = scanner.nextLine();
        for (Sanpham sanpham : listSP) {
            if (sanpham.tenSanPham.equals(nameSP)) {
                result = sanpham;
                break;
            }
        }
        return result;
    }

    // Xóa sản phẩm
    static void xoaSanPhamTheoTen(ArrayList<Sanpham> listSP, Scanner scanner) {
        if (listSP.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        Sanpham sanPhamTimThay = timSanPham(listSP, scanner);

        if (sanPhamTimThay != null) {
            listSP.remove(sanPhamTimThay);
            System.out.println("\n==== Danh sách sau khi xóa: ====\n");
            for (Sanpham sanpham : listSP) {
                sanpham.inThongTin();
            }
        }
        else {
            System.out.println("Không có sản phẩm này");
        }
    }
    // Xuất giá trung bình
    static void xuatGiaTrungBinh(ArrayList<Sanpham> listSP) {
        if (listSP.isEmpty()) {
            System.out.println("Danh sách này chưa có phần tử");
            return;
        }
        double giaTrungBinh, tongTien = 0;
        for (Sanpham sanpham : listSP) {
            tongTien += sanpham.gia;
        }
        giaTrungBinh = tongTien / listSP.size();
        System.out.printf("Giá trung bình của sản phẩm: %.1f\n", giaTrungBinh);
    }
}
