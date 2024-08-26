/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Student {
//DAC DIEM
    private String HoTen;
    private String MaSV;
    private String MaMonHoc;
    private String Lop;
//

    public Student() {
    }

    public Student(String HoTen, String MaSV) {
        this.HoTen = HoTen;
        this.MaSV = MaSV;
    }

    public Student(String HoTen, String MaSV, String MaMonHoc, String Lop) {
        this.HoTen = HoTen;
        this.MaSV = MaSV;
        this.MaMonHoc = MaMonHoc;
        this.Lop = Lop;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    //hANH dONG
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho ten:");
        HoTen = sc.nextLine();
        System.out.println("Nhap MaSV:");
        MaSV = sc.nextLine();
        System.out.println("Nhap MaMonHoc:");
        MaMonHoc = sc.nextLine();
        System.out.println("Nhap Lop:");
        Lop = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ho Ten:" + HoTen + "MaSV:" + MaSV + "MaMonHoc:"+MaMonHoc+"Lop:"+Lop);
    }
}
