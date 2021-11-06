package com.dunglt2004110051.tuan07;

public class MyLinkedList {
    // danh sách chứa 2 node head và tail
    Node head, tail;

    MyLinkedList() {
        head = tail = null;
    }

    void themVaoCuoiDS(int d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void themVaoDauDS(int d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
    }

    void xoaPhanTuDau() {
        
    }

    void xoaPhanTuBatKi(int d) {
        Node prev = null; // node trước phần tử bị xóa
        Node nxtNode = null; // node sau phần tử bị xóa
        Node current = head;

        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }

        while (current != null) {
            if (current.next == null) {
                System.out.println("Thực hiện xóa phần tử cuối");
            }
            // Tìm prev
            if (current.next.data == d) {
                // Tìm thấy prev, gán cho node prev
                prev = current;
            }
            // Tìm nxtNode
            if (current.data == d && prev != null) {
                nxtNode = current.next;
                // prev.next trỏ đến nxtNode => current không ai trỏ đến =>bị xóa
                prev.next = nxtNode;
                return;
            }
            current = current.next;
        }
    }

    void inDanhSach() {
        Node current = head;
        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.println("Các node trong danh sách: ");
        while (current != null) {
            current.inData();
            current = current.next;
        }
    }
}
