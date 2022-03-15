package ru.vsu.cs.korolevae;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        perevod r= new perevod();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        String c = sc.nextLine();
        System.out.println("Введите исходную систему исчисления");
        int a = sc.nextInt();
        System.out.println("В какую систему счисления перевести?");
        int b = sc.nextInt();
        System.out.println(r.perevvod(c,a,b));
    }
}
