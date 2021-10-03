package com.dunglt2004110051.tuan03;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        // Hàm tạo mặc định
        computer = new Computer();
        computer.nhaSanXuat = "ACER";
        computer.namSanXuat = 2021;
        computer.heDieuHanh = "Windows 10 Home";
        computer.Ram = "8GB DDR4 3200MHz";
        computer.CPU = "Intel Core i5-11300H";
        computer.gia = 1050;
        computer.namBaoHanh = 2;
        computer.InThongTin();
        // Hàm tạo 7 tham số
        computer = new Computer("HP", 2021, "Windows 10 Home", "8GB (2x4GB) DDR4 3200Mhz", "AMD Ryzen 5 5600H", 1100, 1);
        computer.InThongTin();
    }
}
