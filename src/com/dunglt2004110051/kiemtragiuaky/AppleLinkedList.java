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

    public void insertionSortAscending() {
        // Tạo 1 node null nằm trước head
        Node start = new Node();
        // trỏ start.next -> head
        start.next = head;
        Node current = head, prev = start, nextNode = null, tempNode = null;

        while (current != null) {
            // Bắt đầu duyệt từ nextNode do mặc định insertion xem phần tử đầu tiên là đã
            // sắp xếp
            nextNode = current.next;
            // khoiLuong của nextNode < current thì cần sắp xếp
            if (nextNode != null && nextNode.apple.khoiLuong < current.apple.khoiLuong) {
                // tìm đúng vị trí cần chèn
                /**
                 * lúc này prev nằm ở trước head, sẽ duyệt từ node đến current (phần được xem là
                 * đã sắp xếp, prev = prev.next)
                 */
                // khoiLuong của next > prev => tiếp tục duyệt, tăng prev lên 1
                while (prev.next != null && prev.next.apple.khoiLuong < nextNode.apple.khoiLuong) {
                    prev = prev.next;
                }
                // Khi đã tìm ra node prev.next có khoiLuong > nextNode, tiến hành hoán vị
                /**Trình tự hoán vị:
                 * prev luôn là node nằm đầu tiên sẽ trỏ đến node bị hoán vị
                 * node bị hoán vị luôn nằm TRƯỚC curr do từ prev đến curr được xem là đã sắp
                 * xếp.
                 * curr lúc này sẽ trỏ đến next của node bị hoán vị đó để list được liền mạch.
                 * cuối cùng chèn node đó vào vị trí đã tìm.
                 */
                tempNode = prev.next;
                prev.next = nextNode;
                // Tăng current lên 1 lúc này next của current sẽ trỏ đến node tiếp theo của
                // next. Như vậy từ Node current trở về trước là đã sắp xếp
                current.next = nextNode.next;
                prev.next.next = tempNode;
                // reset prev cho những lần hoán vị về sau
                prev = start;
            } else {
                // khi current đã duyệt xong và là null thì dừng
                current = current.next;
            }
        }
    }

    public void inDanhSach() {
        Node current = head;

        if (head == null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("==== Danh sách táo: ====");
        while (current != null) {
            current.apple.inThongTin();
            current = current.next;
        }
    }

}
