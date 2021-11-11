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

    // Kiểm tra phần tử có trong ds
    boolean isNull(int d) {
        Node current = head;
        while (current != null) {
            if (current.data == d){
                return true;
            }
            current = current.next;
        }
        return false;
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
         * cho current bắt đầu từ head
         * current.next = d thì prev = current
         * prev.next = newNode
         */
        Node newNode = new Node(newNodeData);
        Node curNode = head;
        Node prev;

        // Nếu ds rỗng
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        if (!isNull(d)) {
            System.out.printf("Phần tử %d không tồn tại", d);
            return;
        }

        // Nếu phần tử người dùng chọn là head
        if (head.data == d) {
            addFirst(newNodeData);
            return;
        }
        
        while (curNode != null) {
            // Nếu phần tử người dùng chọn là tail
            if (curNode.next == null && curNode.data == d) {
                addLast(newNodeData);
                return;
            }
            if (curNode.next.data == d) {
                prev = curNode;
                newNode.next = curNode.next;
                prev.next = newNode;
                return;
            }
            curNode = curNode.next;
        }
    }

    void deleteFirst() {
        Node current = head;
        // Không cần duyệt
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
        Node nxtNode = null; // node sau phần tử bị xóa
        Node current = head;

        if (!isNull(d)) {
            System.out.printf("Phần tử %d không tồn tại", d);
            return;
        }

        // Nếu phần tử người dùng chọn là head => xóa pt đầu
        if (head.data == d) {
            deleteFirst();
            return;
        }

        while (current != null) {
            // Nếu phần tử người dùng chọn là head => xóa pt cuối
            if (current.next == null && current.data == d) {
                deleteLast();
                return;
            }
            // Tìm prev
            if (current.next.data == d) {
                // Tìm thấy prev, gán cho node prev
                prev = current;
            }
            // Tìm nxtNode
            if (current.data == d && prev != null) {
                System.out.println("Phần tử bị xóa: " + current.data);
                nxtNode = current.next;
                // prev.next trỏ đến nxtNode => current không ai trỏ đến => bị xóa
                prev.next = nxtNode;
                return;
            }
            current = current.next;
        }
    }

    // Sửa 1 phần tử
    void update(int d, int fixedData) {
        Node current = head;

        if (!isNull(d)) {
            System.out.printf("Phần tử %d không tồn tại", d);
            return;
        }

        while (current != null) {
            if (current.data == d) {
                // Tiến hành sửa data
                current.data = fixedData;
                break;
            }
            current = current.next;
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
