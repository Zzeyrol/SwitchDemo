package com.company;

public class Main {

    public static void main(String[] args) {
            for (int x = 1; x <= 13; x++) {
                switch (x) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println(x + ": зима");
                        break;
                    case 4:
                    case 5:
                    case 6:
                        System.out.println(x + ": весна");
                        break;
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(x + ": лето");
                        break;
                    case 10:
                    case 11:
                    case 12:
                        System.out.println(x + ": осень");
                        break;
                    default:
                        System.out.println(x + ": нет такого месяца");
                }
            }
    }
}
