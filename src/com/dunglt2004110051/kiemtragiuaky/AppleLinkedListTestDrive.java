package com.dunglt2004110051.kiemtragiuaky;

import java.util.Scanner;

/**
 * 2. Cài đặt Linked List để quản lý táo
a) Thêm táo vào danh sách
thêm đầu, cuối
b) Tìm kiếm 1 Apple theo mã
c) In Danh sách táo
d) Thêm 1 trái táo vào trước 1 táo tìm được (dùng chức năng tìm của câu b)
e) Xóa 1 trái táo ở cuối Danh sách
f) Viết chương trình có hàm main()
để kiểm chứng vào chạy code đã viết
 */
public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleLinkedList linkedListApple = new AppleLinkedList();
        nhapDanhSachTao(linkedListApple, scanner);
        inDanhSachTao(linkedListApple);
    }

    static void nhapDanhSachTao(AppleLinkedList linkedListApple, Scanner scanner) {
        String xacNhan = "y";
        do {
            if (xacNhan.toUpperCase().equals("Y")) {
                Apple appleNhap = Apple.nhapThongTin(scanner);
                linkedListApple.themVaoCuoiDanhSach(appleNhap);
            } else
                System.out.println("Sai cú pháp! Chọn y hoặc n");

            System.out.print("Nhập thêm (Y/N) ?");
            xacNhan = scanner.nextLine(); 
            
        } while (!xacNhan.toUpperCase().equals("N"));
    }
    
    static void inDanhSachTao(AppleLinkedList linkedListApple) {
        System.out.println("====== Danh sách táo ==========");
        linkedListApple.inDanhSach();
    }
}
