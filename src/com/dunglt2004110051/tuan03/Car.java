package com.dunglt2004110051.tuan03;

public class Car {
    // Thuộc tính
    String tenChuXe;
    String hangSanXuat;
    String dong;
    boolean giayPhep;
    float dungTichXang;
    // Hàm tạo mặc định
    Car() {}
    // Hàm tạo 5 tham số
    Car(String owner, String hsx, String d, boolean gp, float dtx) {
        tenChuXe = owner;
        hangSanXuat = hsx;
        dong = d;
        giayPhep = gp;
        dungTichXang = dtx;
    }
    // Phương thức
    void InThongTin() {
        System.out.println("===== Thông tin xe =====");
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Dòng: " + dong);
        System.out.println("Giấy phép: " + giayPhep);
        System.out.printf("Dung tích xăng: %.1f lít \n", dungTichXang);
    }
}
