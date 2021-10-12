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
            System.out.println("===== Menu chương trình =====");
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
            System.out.print("Nhập thêm (Y/N)? ");
            xacNhan = scanner.nextLine();

            if (xacNhan.toUpperCase().equals("N")) {
                break;
            }

        } while (xacNhan.toUpperCase().equals("Y"));
    }

    static void sapXepGiamDanTheoGia(ArrayList<Sanpham> listSP) {
        Comparator<Sanpham> comp = new Comparator<Sanpham>() {
            public int compare(Sanpham o1, Sanpham o2) {
                return Double.compare(o1.gia, o2.gia);
            }
        };
        Collections.sort(listSP, comp);
        Collections.reverse(listSP);
        System.out.println("==== Giá tiền giảm dần: ====");

        for (Sanpham sanpham : listSP) {
            sanpham.inThongTin();
            System.out.println("\n");
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
        Sanpham sanPhamTimThay = timSanPham(listSP, scanner);

        if (sanPhamTimThay != null) {
            listSP.remove(sanPhamTimThay);
            System.out.println("Danh sách sau khi xóa: ");
            for (Sanpham sanpham : listSP) {
                sanpham.inThongTin();
            }
        }
        else {
            System.out.println("Không có sản phẩm này");
        }
    }
    // Xuất giá trung bình
    static void xuatGiaTrungBinh() {
        
    }
}
