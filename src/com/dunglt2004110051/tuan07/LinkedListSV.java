package com.dunglt2004110051.tuan07;

import com.dunglt2004110051.tuan05.SVDV;

public class LinkedListSV {
    // Chứa 2 node head và tail
    NodeSV head;
    NodeSV tail;

    // constructor
    LinkedListSV() {
        head = tail = null;
    }

    // Methods
    void add(SVDV svdv) {
        NodeSV newSVNode = new NodeSV(svdv);

        if (head == null) {
            head = newSVNode;
            tail = newSVNode;
        } else {
            tail.next = newSVNode;
            tail = newSVNode;
        }
    }

    void printSV() {
        int count = 0;
        NodeSV current = head;
        if (head == null) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("===== Danh sách sinh viên =====");
        while (current != null) {
            count++;
            System.out.printf("\n=== Sinh viên thứ %d: \n", count);
            current.printSV();
            current = current.next;
        }
    }
}
