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
    boolean isEmpty() {
        return (head == null) ? true : false;
    }

    // Thêm
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

    // Thêm tại vị trí
    void addAt(int pos, SVDV svdv) {
        int index = pos - 1;
        int count = 0;
        // duyệt node
        NodeSV newSVNode = new NodeSV(svdv);
        NodeSV current = head;
        NodeSV prev = null;
        // Thêm vào danh sách rỗng
        if (head == null) {
            head = newSVNode;
            tail = newSVNode;
            System.out.println("Danh sách rỗng! Sinh viên này đã được thêm vào vị trí 1");
            return;
        }
        // Nếu index = 0, thêm vào đầu danh sách
        if (index == 0 && current != null) {
            newSVNode.next = head;
            head = newSVNode;
            return;
        }

        while (current != null) {
            /**
             * Mỗi lần lắp sẽ cộng count lên tương ứng với stt của node. Nếu count = index
             * thì node đó nằm ở vị trí người dùng chọn. Lúc này node mới sẽ được chèn vào
             * vị trí đó.
             */
            if (count == index) {
                newSVNode.next = current;
                prev.next = newSVNode;
                break;
            } else {
                prev = current;
                current = current.next;
                count++;
            }
        }
        /**
         * Nếu đã duyệt hết danh sách, current = null mà vẫn không tìm thấy => pos của
         * người dùng nằm ngoài phạm vi của danh sách
         */
        if (current == null) {
            System.out.printf("Vị trí thứ %d\n vượt quá số lượng sinh viên", pos);
        }
    }

    // Xóa tại vị trí
    NodeSV deleteAt(int pos) {
        int index = pos - 1;
        int count = 0;

        NodeSV current = head;
        NodeSV prev = null;
        NodeSV temp = null;
        // Thêm vào danh sách rỗng
        if (head == null) {
            System.out.println("Danh sách rỗng!");
            return null;
        }
        // Nếu index = 0, xóa sinh viên đầu danh sách
        if (index == 0 && current != null) {
            temp = current;
            head = current.next;
            return temp;
        }

        while (current != null) {
            if (count == index) {
                temp = current;
                prev.next = current.next;
                return temp;
            } else {
                prev = current;
                current = current.next;
                count++;
            }
        }

        if (current == null) {
            System.out.printf("Không tìm thấy sinh viên nào ở vị trí thứ %d\n", pos);
        }
        return temp;
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
