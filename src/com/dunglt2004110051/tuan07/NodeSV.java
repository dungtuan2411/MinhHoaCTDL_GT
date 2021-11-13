package com.dunglt2004110051.tuan07;

import com.dunglt2004110051.tuan05.SVDV;

public class NodeSV {
    // Properties: Chứa data và tham chiếu
    SVDV sv;
    NodeSV next;
    // Constructor
    NodeSV() {
        sv = null;
        next = null;
    }

    NodeSV(SVDV sinhvien) {
        sv = sinhvien;
        next = null;
    }
    // Method
    void printSV() {
        sv.inThongTin();
    }
}
