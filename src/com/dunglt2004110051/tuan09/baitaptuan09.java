package com.dunglt2004110051.tuan09;

import com.dunglt2004110051.kiemtragiuaky.Apple;
import com.dunglt2004110051.kiemtragiuaky.AppleLinkedList;

public class baitaptuan09 {
    public static void main(String[] args) {
        AppleLinkedList myLinkedList = new AppleLinkedList();

        Apple apple = new Apple(7, 5.3f, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple);

        Apple apple2 = new Apple(7, 4.6f, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple2);

        Apple apple3 = new Apple(7, 20.8f, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple3);

        Apple apple4 = new Apple(7, 6.9f, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple4);

        myLinkedList.bubleSortAscending();
        myLinkedList.inDanhSach();
    }
}
