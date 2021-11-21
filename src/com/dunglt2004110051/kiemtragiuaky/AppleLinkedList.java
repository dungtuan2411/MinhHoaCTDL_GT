package com.dunglt2004110051.kiemtragiuaky;

public class AppleLinkedList {
    // Chứa 2 node head và tail
    Node head = null, tail = null;

    public AppleLinkedList() {
    }

    public void themVaoCuoiDanhSach(Apple a) {
        Node newApple = new Node(a);
        if (head == null) {
            head = newApple;
            tail = newApple;
        } else {
            tail.next = newApple;
            tail = newApple;
        }
    }

    public void themVaoDauDanhSach(Apple a) {
        Node newApple = new Node(a);
        if (head == null) {
            head = newApple;
            tail = newApple;
        } else {
            newApple.next = head;
            head = newApple;
        }
    }

    public void bubleSortAscending() {
        Node current = head, nxtNode = null;
        double temp;

        while (current != null) {
            nxtNode = current.next;
            while (nxtNode != null) {
                if (current.apple.khoiLuong > nxtNode.apple.khoiLuong) {
                    temp = current.apple.khoiLuong;
                    current.apple.khoiLuong = nxtNode.apple.khoiLuong;
                    nxtNode.apple.khoiLuong = temp;
                }
                nxtNode = nxtNode.next;
            }
            current = current.next;
        }
    }

    public void bubleSortDescending() {
        Node current = head, nxtNode = null;
        double temp;

        while (current != null) {
            nxtNode = current.next;
            while (nxtNode != null) {
                if (current.apple.khoiLuong < nxtNode.apple.khoiLuong) {
                    temp = current.apple.khoiLuong;
                    current.apple.khoiLuong = nxtNode.apple.khoiLuong;
                    nxtNode.apple.khoiLuong = temp;
                }
                nxtNode = nxtNode.next;
            }
            current = current.next;
        }
    }

    public void selectionSortAscending() {
        Node current = head, minNode = null, nxtNode = null;
        double temp;

        while (current != null) {
            nxtNode = current.next;
            minNode = current;
            while (nxtNode != null) {
                if (nxtNode.apple.khoiLuong < minNode.apple.khoiLuong) {
                    minNode = nxtNode;
                }
                nxtNode = nxtNode.next;
            }
            // sau khi tìm ra node có khối lượng nhỏ nhất, tiến hành hoán vị
            temp = minNode.apple.khoiLuong;
            minNode.apple.khoiLuong = current.apple.khoiLuong;
            current.apple.khoiLuong = temp;
            // tăng current lên trước 1 đơn vị
            current = current.next;
        }
    }

    public void selectionSortDescending() {
        Node current = head, maxNode = null, nxtNode = null;
        double temp;

        while (current != null) {
            nxtNode = current.next;
            maxNode = current;
            while (nxtNode != null) {
                if (nxtNode.apple.khoiLuong > maxNode.apple.khoiLuong) {
                    maxNode = nxtNode;
                }
                nxtNode = nxtNode.next;
            }
            // sau khi tìm ra node có khối lượng lớn nhất, tiến hành hoán vị
            temp = maxNode.apple.khoiLuong;
            maxNode.apple.khoiLuong = current.apple.khoiLuong;
            current.apple.khoiLuong = temp;
            // tăng current lên trước 1 đơn vị
            current = current.next;
        }
    }

    public void inDanhSach() {
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
