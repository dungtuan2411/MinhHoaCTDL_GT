package com.dunglt2004110051.kiemtragiuaky;

public class Node {
    // data
    Apple apple;
    // pointer
    Node next;

    // Hàm tạo
    Node(){}

    Node(Apple a) {
        apple = a;
    }
    Node(Apple a, Node n) {
        apple = a;
        next = n;
    }
}
