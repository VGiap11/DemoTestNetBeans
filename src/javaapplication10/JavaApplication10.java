/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        //std.Nhap();
//        System.out.println("Nhap Ho ten:");
//        String HoTen = sc.nextLine();
//        System.out.println("Nhap MaSV:");
//        String MaSV = sc.nextLine();
//        System.out.println("Nhap MaMonHoc:");
//        String MaMonHoc = sc.nextLine();
//        System.out.println("Nhap Lop:");
//        String Lop = sc.nextLine();
//        Student std = new Student(HoTen,MaSV,MaMonHoc,Lop);
        //std.Xuat();
        // ArrayList<TModel> arr = new ArrayList<TModel>();
        ArrayList<Student> arr = new ArrayList<Student>();
        System.out.println("Nhap do dai cho mang:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Student std = new Student();
            System.out.printf("Nhap ho ten %d",i);
            sc.nextLine();
            std.setHoTen(sc.nextLine());
            System.out.printf("Nhap MaSV %d",i);
            std.setMaSV(sc.nextLine());
            System.out.printf("Nhap MaMonHoc %d",i);
            std.setMaMonHoc(sc.nextLine());
            System.out.printf("Nhap Lop %d",i);
            std.setLop(sc.nextLine());
            arr.add(std);
        }
        for (var item : arr) {
            System.out.println("In mang:" + item.getHoTen() + item.getMaSV() + item.getMaMonHoc() + item.getLop());
        }
    }

}
