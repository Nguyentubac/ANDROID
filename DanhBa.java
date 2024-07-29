package com.example.myapplication333;

import androidx.annotation.NonNull;

public class DanhBa {
    String Ten;
    String SDT;

    public DanhBa(String ten, String SDT) {
        Ten = ten;
        this.SDT = SDT;
    }

    public DanhBa() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
