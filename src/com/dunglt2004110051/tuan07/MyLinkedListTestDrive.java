package com.dunglt2004110051.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.themVaoCuoiDS(6);
        linkedList.themVaoCuoiDS(1);
        linkedList.themVaoCuoiDS(9);

        linkedList.themVaoDauDS(3);
        linkedList.themVaoDauDS(5);
        linkedList.themVaoDauDS(7);

        linkedList.xoaPhanTuBatKi(5);

        linkedList.inDanhSach();
    }
    
}
