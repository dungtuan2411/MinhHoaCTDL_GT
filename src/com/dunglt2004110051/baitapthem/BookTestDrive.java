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
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("==============");
        System.out.print("Số lượng sách: ");

        int slpt = scanner.nextInt();

        Book[] listBook = new Book[slpt];
        menu(listBook, scanner);
    }

    // Menu
    static void menu(Book[] listBook, Scanner scanner) {
        int luaChon;
        do {
            System.out.println("\n===== Menu chương trình =====");
            System.out.println("1: Nhập mảng sách");
            System.out.println("2: Xuất mảng sách");
            System.out.println("3: Thêm sách vào mảng");
            System.out.println("4: Xóa sách khỏi mảng");
            System.out.println("0: Kết thúc");
            System.out.println("=============================");
            System.err.print("\nBạn chọn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    nhapDanhSach(listBook, scanner);
                    break;
                case 2:
                    xuatDanhSach(listBook);
                    break;
                case 3:
                    listBook = themPhanTu(listBook, scanner);
                    break;
                case 4:
                    scanner.nextLine();
                    listBook = xoaPhanTu(listBook, scanner);
                    break;
                case 0:
                    System.out.println("Kết thúc!");
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại!");
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

    static void nhapDanhSach(Book[] listBook, Scanner scanner) {
        // Kiểm tra, nếu vượt quá slpt sẽ không thể nhập tiếp
        boolean isNotExist = false;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] != null) {
                isNotExist = true;
                break;
            }
        }

        if (isNotExist) {
            System.out.println("Không thể nhập tiếp do vượt quá số lượng sách!");
            System.out.println("Nếu muốn thêm sách vui lòng chọn 3!");
            return;
        }
        // Nếu slpt = 0 (bị xóa hết), cần thêm
        if (listBook.length == 0) {
            arrayBooks();
        }
        // Nhập thông tin sách
        for (int i = 0; i < listBook.length; i++) {
            System.out.println("\nSách thứ " + (i + 1));
            listBook[i] = nhap(scanner);
        }
    }

    // Xuất danh sách
    static void xuatDanhSach(Book[] listBook) {
        // Kiểm tra mảng đã có sách chưa (ít nhất 1 phần tử khác null)
        boolean nullify = false;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }
        // Chỉ in được khi có ít nhất 1 phần tử khác null hoặc length > 0
        if (nullify || listBook.length == 0) {
            System.out.println("Chưa có sách! Vui lòng chọn 1 để nhập trước");
            return;
        }

        System.out.println("===== Danh sách hiện tại =====");
        for (int i = 0; i < listBook.length; i++) {
            System.out.printf("\nSách thứ %d\n", (i + 1));
            listBook[i].InThongTin();
        }
        System.out.println("==============================");
    }

    // Thêm phần tử mới vào cuối mảng
    static Book[] themPhanTu(Book[] listBooks, Scanner scanner) {
        boolean nullify = false;
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }

        if (nullify || listBooks.length == 0) {
            System.out.println("Chưa có sách! Vui lòng chọn 1 để nhập trước");
            return listBooks;
        }

        System.out.println("\n===== Nhập thông tin sách muốn thêm =====");
        Book newBook = nhap(scanner);
        int arrLength = listBooks.length;
        Book[] newListBook = new Book[arrLength + 1];

        for (int i = 0; i < arrLength; i++) {
            newListBook[i] = listBooks[i];
        }
        // Gán sách vừa nhập cho newListBook
        newListBook[arrLength] = newBook;

        System.out.println("\n===== Danh sách sau khi thêm =====");
        for (Book book : newListBook) {
            book.InThongTin();
        }
        System.out.println("\n================================");
        return newListBook;
    }

    // Tìm vị trí sách
    static int timSachTheoNxb(Book[] listBooks, Scanner scanner) {
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNXB = scanner.nextLine();
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i].nhaXuatBan.equals(tenNXB)) {
                return i;
            }
        }
        return -1;
    }

    // Xóa phần tử theo nhà xuất bản
    static Book[] xoaPhanTu(Book[] listBooks, Scanner scanner) {
        boolean nullify = false;
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i] == null)
                nullify = true;
            else {
                nullify = false;
                break;
            }
        }

        if (nullify || listBooks.length == 0) {
            System.out.println("Chưa có sách! Vui lòng chọn 1 để nhập trước");
            return listBooks;
        }

        int i, j, slpt = listBooks.length;
        Book[] deletedList = new Book[slpt - 1];
        int viTri = timSachTheoNxb(listBooks, scanner);
        // Nếu vị trí = -1, nhập lại
        while (viTri == -1) {
            System.out.println("Không tìm thấy! Nhập lại");
            viTri = timSachTheoNxb(listBooks, scanner);
        }
        // nếu viTri != i, gán listBooks[i] cho deletedList[j], j++
        // Nếu viTri == i, bỏ qua => j giữ nguyên
        for (i = j = 0; i < slpt; i++) {
            if (viTri != i) {
                // j++ lúc đầu sẽ là 0, chạy xong câu lệnh sẽ +1
                deletedList[j++] = listBooks[i];
            }
        }
        System.out.println("\n===== Danh sách sau khi xóa =====");
        if (deletedList.length == 0)
            System.out.println("Đã xóa hết!");

        for (Book book : deletedList) {
            book.InThongTin();
        }
        System.out.println("\n===============================");
        return deletedList;
    }
}