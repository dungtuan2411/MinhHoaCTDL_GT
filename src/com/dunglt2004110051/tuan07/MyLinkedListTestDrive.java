package com.dunglt2004110051.tuan07;

import java.util.Scanner;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList linkedList = new MyLinkedList();

        menu(linkedList, scanner);
    }

    static void menu(MyLinkedList linkedList, Scanner scanner) {
        int choice;
        do {
            System.err.println("\n||===== Int numbers LinkedList =====||");
            System.out.println("||1: Thêm vào đầu danh sách       ||");
            System.out.println("||2: Thêm vào cuối danh sách      ||");
            System.out.println("||3: Thêm vào trước 1 phần tử     ||");
            System.out.println("||4: Xóa phần tử đầu danh sách    ||");
            System.out.println("||5: Xóa phần tử cuối danh sách   ||");
            System.out.println("||6: Xóa phần tử bất kì           ||");
            System.out.println("||7: Sửa thông tin phần tử bất kì ||");
            System.out.println("||8: In danh sách                 ||");
            System.out.println("||9: Kết thúc                     ||");
            System.out.println("||================================||");
            System.out.print("Bạn chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1: {
                System.out.print("Nhập số muốn thêm vào đầu: ");
                int num = scanner.nextInt();
                linkedList.addFirst(num);
                break;
            }
            case 2: {
                System.out.print("Nhập số muốn thêm vào cuối: ");
                int num = scanner.nextInt();
                linkedList.addLast(num);
                break;
            }
            case 3: {
                if (linkedList.isEmpty()) {
                    System.out.print("Giá trị muốn thêm: ");
                    int num = scanner.nextInt();
                    linkedList.addFirst(num);
                    break;
                }
                System.out.print("Thêm vào trước số: ");
                int num = scanner.nextInt();
                System.out.print("Giá trị muốn thêm: ");
                int newData = scanner.nextInt();
                linkedList.addMiddle(num, newData);
                break;
            }
            case 4: {
                linkedList.deleteFirst();
                break;
            }
            case 5: {
                linkedList.deleteLast();
                break;
            }
            case 6: {
                if (linkedList.isEmpty()) {
                    System.out.println("Danh sách rỗng");
                    break;
                }
                System.out.print("Phần tử muốn xóa: ");
                int num = scanner.nextInt();
                linkedList.deleteMid(num);
                break;
            }
            case 7: {
                if (linkedList.isEmpty()) {
                    System.out.println("Danh sách rỗng");
                    break;
                }
                System.out.print("Phần tử muốn sửa: ");
                int num = scanner.nextInt();
                System.out.print("Giá trị sửa: ");
                int fixedNum = scanner.nextInt();
                linkedList.update(num, fixedNum);
                break;
            }
            case 8: {
                linkedList.printList();
                break;
            }
            case 9: {
                System.out.print("Kết thúc!");
                break;
            }
            default:
                System.out.println("Nhập sai, nhập lại!");
                break;
            }
        } while (choice != 9);
    }
}
