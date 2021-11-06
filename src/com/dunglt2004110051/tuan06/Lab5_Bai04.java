package com.dunglt2004110051.tuan06;

import java.util.Scanner;

import com.dunglt2004110051.tuan04.Sanpham;

public class Lab5_Bai04 {
    public static void main(String[] args) {
        int slpt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn bao nhiêu sản phẩm: ");

        slpt = scanner.nextInt();

        Sanpham[] arraySanPham = new Sanpham[slpt];

        menu(arraySanPham, scanner);
    }

    static void menu(Sanpham[] dsSanPham, Scanner scanner) {
        int luaChon;
        do {
            System.out.println("\n===== Menu chương trình =====");
            System.out.println("1: Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2: Sắp xếp giảm dần theo giá và xuất ra màn hình ");
            System.out.println("3: Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4: Xuất giá trung bình của các sản phẩm");
            System.out.println("5: Thêm 1 sản phẩm vào mảng ở 1 vị trí bất kỳ");
            System.out.println("6: Kết thúc chương trình");
            System.out.println("=============================");
            System.out.print("Bạn chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    scanner.nextLine();
                    nhapMangSanPham(dsSanPham, scanner);
                    break;
                case 2:
                    sapXepGiamDanTheoGia(dsSanPham);
                    break;
                case 3:
                    scanner.nextLine();
                    dsSanPham = xoaSanPhamTheoTen(dsSanPham, scanner);
                    break;
                case 4:
                    xuatGiaTrungBinh(dsSanPham);
                    break;
                // case 5:
                //     scanner.nextLine();
                //     dsSanPham = themPhanTu(dsSanPham, scanner);
                //     break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Nhập sai, nhập lại!");
                    break;
            }
        } while (luaChon != 6);
    }

    static Sanpham nhapThongTin(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm: ");
        String tenSP = scanner.nextLine();
        System.err.print("Nhập giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Sanpham sp = new Sanpham(tenSP, price);
        return sp;
    }

    static void nhapMangSanPham(Sanpham[] arrSanpham, Scanner scanner) {
        for (int i = 0; i < arrSanpham.length; i++) {          
            arrSanpham[i] = nhapThongTin(scanner);
        }
    }

    static void sapXepGiamDanTheoGia(Sanpham[] arrSanpham) {
        // Kiểm tra mảng đã có sản phẩm chưa (ít nhất 1 phần tử khác null)
        boolean nullify = false;
        for (int i = 0; i < arrSanpham.length; i++) {
            if (arrSanpham[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }
        // Chỉ in được khi có ít nhất 1 phần tử khác null hoặc length > 0
        if (nullify || arrSanpham.length == 0) {
            System.out.println("Chưa có sản phẩm! Vui lòng chọn 1 để nhập trước");
            return;
        }

        for (int i = 0; i < arrSanpham.length - 1; i++) {
            for (int j = i + 1; j < arrSanpham.length; j++) {
                if (arrSanpham[i].gia < arrSanpham[j].gia) {
                    Sanpham temp = arrSanpham[i];
                    arrSanpham[i] = arrSanpham[j];
                    arrSanpham[j] = temp;
                }
            }
        }
        System.out.println("========== Sắp xếp giảm dần theo giá ============");
        for (Sanpham sanpham : arrSanpham) {
            sanpham.inThongTin();
        }
    }

    // Tìm sản phẩm
    static Sanpham timSanPham(Sanpham[] arrSanpham, Scanner scanner) {
        Sanpham result = null;
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String nameSP = scanner.nextLine();
        for (Sanpham sanpham : arrSanpham) {
            if (sanpham.tenSanPham.equals(nameSP)) {
                result = sanpham;
                break;
            }
        }
        return result;
    }

    static Sanpham[] xoaSanPhamTheoTen(Sanpham[] arrSanpham, Scanner scanner) {
        // Kiểm tra mảng đã có sản phẩm chưa (ít nhất 1 phần tử khác null)
        boolean nullify = false;
        for (int i = 0; i < arrSanpham.length; i++) {
            if (arrSanpham[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }
        // Chỉ in được khi có ít nhất 1 phần tử khác null hoặc length > 0
        if (nullify || arrSanpham.length == 0) {
            System.out.println("Chưa có sản phẩm! Vui lòng chọn 1 để nhập trước");
            return arrSanpham;
        }
        // Xóa
        int i, j;
        Sanpham spTimThay = timSanPham(arrSanpham, scanner);
        Sanpham[] spDeleted = new Sanpham[arrSanpham.length - 1];

        while (spTimThay == null) {
            System.out.println("Không tìm thấy, nhập lại: ");
            spTimThay = timSanPham(arrSanpham, scanner);
        }

        for (i = j = 0; i < arrSanpham.length; i++) {
            if (arrSanpham[i] != spTimThay) {
                spDeleted[j++] = arrSanpham[i];
            }
        }
        System.out.println("=========== Mảng sau khi xóa ==============");
        if (spDeleted.length == 0)
            System.out.println("Đã xóa hết!");
        for (Sanpham sanpham : spDeleted) {
            sanpham.inThongTin();
        }
        return spDeleted;
    }

    static void xuatGiaTrungBinh(Sanpham[] arrSanpham) {
        // Kiểm tra mảng đã có sản phẩm chưa (ít nhất 1 phần tử khác null)
        boolean nullify = false;
        for (int i = 0; i < arrSanpham.length; i++) {
            if (arrSanpham[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }
        // Chỉ in được khi có ít nhất 1 phần tử khác null hoặc length > 0
        if (nullify || arrSanpham.length == 0) {
            System.out.println("Chưa có sản phẩm! Vui lòng chọn 1 để nhập trước");
            return;
        }

        double giaTrungBinh, tongTien = 0;
        for (Sanpham sanpham : arrSanpham) {
            tongTien += sanpham.gia;
        }
        giaTrungBinh = tongTien / arrSanpham.length;
        System.out.printf("Giá trung bình của sản phẩm: %.1f\n", giaTrungBinh);
    }

    static Sanpham[] themPhanTu(Sanpham[] arrSanpham, Scanner scanner) {
        Sanpham spMoi = null;
        int n = arrSanpham.length;
        Sanpham[] mangMoiThem = new Sanpham[n + 1];
        // Kiểm tra mảng đã có sản phẩm chưa (ít nhất 1 phần tử khác null)
        boolean nullify = false;
        for (int i = 0; i < arrSanpham.length; i++) {
            if (arrSanpham[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }
        // Chỉ in được khi có ít nhất 1 phần tử khác null hoặc length > 0
        if (nullify || n == 0) {
            System.out.println("Chưa có sản phẩm! Vui lòng chọn 1 để nhập trước");
            return arrSanpham;
        }

        System.out.print("Nhập vị trí: ");
        int viTri = scanner.nextInt();
        scanner.nextLine();
        spMoi = nhapThongTin(scanner);
        // Coppy
        for (int i = 0; i < n + 1; i++) {
            if(i < viTri)
                mangMoiThem[i] = arrSanpham[i];
            else if(i == viTri) 
                mangMoiThem[i] = spMoi;
            else
                mangMoiThem[i] = arrSanpham[i - 1];
        } 
        System.out.println("======== Mảng sau khi thêm ===========");
        for (Sanpham sanpham : mangMoiThem) {
            sanpham.inThongTin();   
        }
        return mangMoiThem;
    }
}
