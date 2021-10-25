package com.dunglt2004110051.kiemtragiuaky;

public class AppleLinkedList {
    // Chứa 2 node head và tail
    Node head = null, tail = null;

    public AppleLinkedList(){

    }

    void themVaoCuoiDanhSach(Apple a) {
        Node newApple = new Node(a);
        if (head == null) {
            head = newApple;
            tail = newApple;
        }
        else {
            tail.next = newApple;
            tail = newApple;
        }
    }

    void themVaoDauDanhSach(Apple a) {
        Node newApple = new Node(a);
        if (head == null) {
            head = newApple;
            tail = newApple;
        }
        else {
            newApple.next = head;
            head = newApple;
        }
    }

    void inDanhSach() {
        Node current = head;

        if (head == null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Danh sách táo: ");
        while (current != null) {
            current.apple.inThongTin();
            current = current.next;
        }
    }

}
