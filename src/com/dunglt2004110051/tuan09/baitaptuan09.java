package com.dunglt2004110051.tuan09;

import com.dunglt2004110051.kiemtragiuaky.Apple;
import com.dunglt2004110051.kiemtragiuaky.AppleLinkedList;

public class baitaptuan09 {
    public static void main(String[] args) {
        AppleLinkedList myLinkedList = new AppleLinkedList();

        Apple apple = new Apple(7, 5.3, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple);

        Apple apple2 = new Apple(7, 4.6, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple2);

        Apple apple3 = new Apple(7, 20.8, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple3);

        Apple apple4 = new Apple(7, 6.9, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple4);

        myLinkedList.bubleSortAscending();
        System.out.println("\nBuble Sort sắp xếp tăng dần =====");
        myLinkedList.inDanhSach();
        
        myLinkedList.bubleSortDescending();
        System.out.println("\nBuble Sort sắp xếp giảm dần =====");
        myLinkedList.inDanhSach();
        
        myLinkedList.selectionSortAscending();
        System.out.println("\nSelection Sort sắp xếp tăng dần ======");
        myLinkedList.inDanhSach();

        myLinkedList.selectionSortDescending();
        System.out.println("\nSelection Sort sắp xếp giảm dần ======");
        myLinkedList.inDanhSach();
    }
}
