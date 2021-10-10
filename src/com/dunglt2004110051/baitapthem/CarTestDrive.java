package com.dunglt2004110051.baitapthem;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car;
        // Hàm tạo mặc định
        car = new Car();
        car.tenChuXe = "Tèo";
        car.hangSanXuat = "Ford";
        car.dong = "Everest";
        car.giayPhep = true;
        car.dungTichXang = 6.5f;
        car.InThongTin();
        // Hàm tạo 5 tham số
        car = new Car("Tí", "Toyota", "Camry", false, 10f);
        car.InThongTin();
    }
}
