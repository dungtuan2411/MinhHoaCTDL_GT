package com.dunglt2004110051.tuan07;

public class Node {
    // nội dung
    int data;
    // tham chiếu pt tiếp theo
    Node next;

    // Hàm tạo
    Node() {

    }

    Node(int d) {
        data = d;
        next = null;
    }

    void inData() {
        System.out.print(data + " ");
    }
}
