package com.dunglt2004110051.tuan09;

import java.util.Scanner;

import com.dunglt2004110051.kiemtragiuaky.Apple;
import com.dunglt2004110051.kiemtragiuaky.AppleLinkedList;

public class baitaptuan09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppleLinkedList myLinkedList = new AppleLinkedList();

        Apple apple = new Apple(1, 5.3, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple);

        Apple apple2 = new Apple(2, 4.6, "Red");
        myLinkedList.themVaoCuoiDanhSach(apple2);

        Apple apple3 = new Apple(3, 20.8, "Yellow");
        myLinkedList.themVaoCuoiDanhSach(apple3);

        Apple apple4 = new Apple(4, 6.9, "Green");
        myLinkedList.themVaoCuoiDanhSach(apple4);

        Apple apple5 = new Apple(5, 198.2, "Green");
        myLinkedList.themVaoCuoiDanhSach(apple5);

        Apple apple6 = new Apple(6, 50.7, "Red");
        myLinkedList.themVaoCuoiDanhSach(apple6);

        menu(myLinkedList, scanner);
    }

    static void menu(AppleLinkedList linkedList, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMenu chương trình");
            System.out.println("1. Sắp xếp tăng dần bubble sort");
            System.out.println("2. Sắp xếp giảm dần bubble sort");
            System.out.println("3. Sắp xếp tăng dần selection sort");
            System.out.println("4. Sắp xếp giảm dần selection sort");
            System.out.println("5. Sắp xếp tăng dần insertion sort");
            System.out.println("6. Sắp xếp giảm dần insertion sort");
            System.out.println("7. Tìm kiếm tuyến tính");
            System.out.println("8. Tìm kiếm nhị phân");
            System.out.println("9. In danh sách");
            System.out.println("0. Kết thúc!");
            System.out.print("Bạn chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1: {
                linkedList.bubleSortAscending();
                break;
            }
            case 2: {
                linkedList.bubleSortDescending();
                break;
            }
            case 3: {
                linkedList.selectionSortAscending();
                break;
            }
            case 4: {
                linkedList.selectionSortDescending();
                break;
            }
            case 5: {
                linkedList.insertionSortAscending();
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                break;
            }
            case 9: {
                linkedList.inDanhSach();
                break;
            }
            case 0: {
                System.out.println("Kết thúc!");
                break;
            }
            default:
                break;
            }
        } while (choice != 0);
    }
}
