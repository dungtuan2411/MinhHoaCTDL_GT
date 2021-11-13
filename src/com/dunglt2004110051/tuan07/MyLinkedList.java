package com.dunglt2004110051.tuan07;

public class MyLinkedList {
    // danh sách chứa 2 node head và tail
    Node head, tail;

    MyLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null) ? true : false;
    }

    // Thêm vào cuối ds
    void addLast(int d) {
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

    // Thêm vào đầu ds
    void addFirst(int d) {
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

    // Thêm trước 1 phần tử
    void addMiddle(int d, int newNodeData) {
        // Tìm 1 phần tử và thêm vào trước phần tử đó
        /**
         * cho current bắt đầu từ head current.next = d thì prev = current prev.next =
         * newNode
         */
        Node newNode = new Node(newNodeData);
        Node curNode = head;
        Node prev = null;

        // Nếu ds rỗng
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        // Nếu phần tử người dùng chọn là head
        if (head.data == d) {
            addFirst(newNodeData);
            return;
        }

        while (curNode != null && curNode.data != d) {
            // Mỗi lần duyệt sẽ gán lại prev và current
            prev = curNode;
            curNode = curNode.next;
        }
        // Nếu tìm thấy 1 node thì node đó phải khác null
        if (curNode != null) {
            newNode.next = curNode;
            prev.next = newNode;
            return;
        }
        // Nếu không tìm thấy thì node sẽ bằng null sau khi duyệt while
        else {
            System.out.printf("Số %d không có trong danh sách!", d);
        }
    }

    void deleteFirst() {
        Node current = head;
        // Không cần duyệt
        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }

        head = current.next;
        System.out.println("Phần tử đầu bị xóa: " + current.data);
        current = null;
    }

    void deleteLast() {
        Node current = head;
        Node nxtNode = null;

        if (head == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        // Xác định phần tử nằm trước tail
        // tail = current
        // tail.next = null
        while (current != null) {
            nxtNode = current.next;
            if (nxtNode.next == null) {
                // Nếu nxtNode.next = null thì đây là tail
                // Trỏ next của prev đến null
                tail = current;
                System.out.println("Phần tử cuối bị xóa: " + nxtNode.data);
                tail.next = null;
                return;
            }

            current = current.next;
        }
    }

    void deleteMid(int d) {
        Node prev = null; // node trước phần tử bị xóa
        Node current = head;

        // Nếu phần tử người dùng chọn là head => xóa pt đầu
        if (head.data == d) {
            deleteFirst();
            return;
        }

        // vòng lặp sẽ chạy khi pt hiện tại != null và data != d
        while (current != null && current.data != d) {
            prev = current;
            current = current.next;
        }

        // Tìm thấy: dừng vòng lặp, current.data == d
        if (current != null) {
            System.out.println("Phần tử bị xóa: " + current.data);
            // prev.next trỏ đến current.next => current không ai trỏ đến => bị xóa
            prev.next = current.next;
            return;
        }

        // Không tìm thấy
        else {
            System.out.printf("Số %d không có trong danh sách!", d);
        }
    }

    // Sửa 1 phần tử
    void update(int d, int fixedData) {
        Node current = head;

        if (isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }

        while (current != null && current.data != d) {
            current = current.next;
        }

        if (current != null) {
            // Tiến hành sửa data
            current.data = fixedData;
            return;
        } else {
            System.out.printf("Số %d không có trong danh sách!", d);
        }
    }

    void printList() {
        Node current = head;
        if (isEmpty()) {
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
