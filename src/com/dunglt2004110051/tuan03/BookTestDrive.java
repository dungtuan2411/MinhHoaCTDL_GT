package com.dunglt2004110051.tuan03;

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
    }
}
