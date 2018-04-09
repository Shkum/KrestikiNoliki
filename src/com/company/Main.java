package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        Scanner txt = new Scanner(System.in);
        System.out.println("Выберите режим игры:");
        System.out.println("1 - Человек против человека");
        System.out.println("2 - Человек против компьютера");
        a = txt.nextInt();
        if (a == 1) {
            System.out.println("Выбран режим Человек против Человека");
            Chelovek();
        } else if (a == 2) {
            System.out.println("Выбран режим Человек против компьютера");
            Komputer();
        } else
            System.out.println("Такого режима нет");
    }


    private static void Chelovek() {
        Scanner txt = new Scanner(System.in);
        int i, j;
        String str;
        Boolean flag = false;
        String mas[][] = new String[3][3];
        String res[] = new String[2];
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                mas[k][l] = "-";
            }
        }
        do {

            do {
                System.out.println("Введите введите позицию крестика через запую (например: 1,1)");
                str = txt.next();
                res = str.split(",", 2);
                if (mas[Integer.parseInt(res[0])][Integer.parseInt(res[1])].equals("-")) {
                    mas[Integer.parseInt(res[0])][Integer.parseInt(res[1])] = "x";
                    flag = true;
                } else {
                    System.out.println("Эта позиция занята, введите другие координаты");
                }
            } while (flag == false);

            flag = false;


            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.print(mas[k][l]);
                }
                System.out.println();
            }


            for (int k = 0; k < 3; k++) {
                if (mas[k][0].equals(mas[k][1]) && mas[k][0].equals( mas[k][2]) && !mas[k][0].equals("-")) {
                    System.out.println("Игра окончена");
                    flag = true;
                    break;
                }
                if (mas[0][k].equals(mas[1][k])  && mas[0][k].equals(mas[2][k]) && !mas[0][k].equals("-") ) {
                    System.out.println("Игра окончена");
                    flag = true;
                    break;
                }
            }
            if (mas[0][0].equals(mas[1][1]) && mas[0][0].equals(mas[2][2]) && !mas[0][0].equals("-")) {
                System.out.println("Игра окончена");
                flag = true;
                break;
            }
            if (mas[2][0].equals(mas[1][1])  && mas[1][1].equals(mas[0][2]) && !mas[2][0].equals("-")) {
                System.out.println("Игра окончена");
                flag = true;
                break;
            }




            do {
                System.out.println("Введите введите позицию нолика через запую (например: 1,1)");
                str = txt.next();
                res = str.split(",", 2);
                if (mas[Integer.parseInt(res[0])][Integer.parseInt(res[1])].equals("-")) {
                    mas[Integer.parseInt(res[0])][Integer.parseInt(res[1])] = "o";
                    flag = true;
                } else {
                    System.out.println("Эта позиция занята, введите другие координаты");
                }
            } while (flag == false);

            flag = false;



            for (int k = 0; k < 3; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.print(mas[k][l]);
                }
                System.out.println();
            }



            for (int k = 0; k < 3; k++) {
                if (mas[k][0].equals(mas[k][1]) && mas[k][0].equals( mas[k][2]) && !mas[k][0].equals("-")) {
                    System.out.println("Игра окончена");
                    flag = true;
                }
                if (mas[0][k].equals(mas[1][k])  && mas[0][k].equals(mas[2][k]) && !mas[0][k].equals("-") ) {
                    System.out.println("Игра окончена");
                    flag = true;
                }
            }
            if (mas[0][0].equals(mas[1][1]) && mas[0][0].equals(mas[2][2]) && !mas[0][0].equals("-")) {
                System.out.println("Игра окончена");
                flag = true;
            }
            if (mas[2][0].equals(mas[1][1])  && mas[1][1].equals(mas[0][2]) && !mas[2][0].equals("-")) {
                System.out.println("Игра окончена");
                flag = true;
            }


    } while(flag ==false);


}


    private static void Komputer() {

    }
}
