package com.company;

public class Bankovky1 {
    public static void main(String[] args) {
        int suma = 10123;
        int suma1 = suma;
        int pocetBankovek = 0;
        String vysledek = "" ;
        while (suma!=0){
            if (suma >= 5000){
                suma -= 5000;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "5000 = ";
                }else{
                    vysledek += "5000 + ";
                }
            }else if(suma >= 2000 && suma < 5000){
                suma -= 2000;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "2000 = ";
                }else{
                    vysledek += "2000 + ";
                }

            }else if(suma >= 1000 && suma < 2000){
                suma -= 1000;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "1000 = ";
                }else{
                    vysledek += "1000 + ";
                }

            }else if (suma >= 500 && suma < 1000){
                suma -= 500;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "500 = ";
                }else{
                    vysledek += "500 + ";
                }

            }else if (suma >= 200 && suma < 500){
                suma -= 200;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "200 = ";
                }else{
                    vysledek += "200 + ";
                }

            }else if (suma >=100 && suma < 200){
                suma -= 100;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "100 = ";
                }else{
                    vysledek += "100 + ";
                }

            }else if (suma >=50 && suma < 100){
                suma -= 50;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "50 = ";
                }else{
                    vysledek += "50 + ";
                }

            }else if (suma >= 20 && suma < 50){
                suma -= 20;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "20 = ";
                }else{
                    vysledek += "20 + ";
                }

            }else if (suma >= 10 && suma < 20){
                suma -= 10;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "10 = ";
                }else{
                    vysledek += "10 + ";
                }

            }else if (suma >= 5 && suma < 10){
                suma -= 5;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "5 = ";
                }else{
                    vysledek += "5 + ";
                }

            }else if (suma >= 2 && suma < 5){
                suma -= 2;
                pocetBankovek++;
                if (suma == 0) {
                    vysledek += "2 = ";
                }else{
                    vysledek += "2 + ";
                }
            }else {
                suma -= 1;
                pocetBankovek++;
                vysledek += "1 = ";
            }
        }

        System.out.println(vysledek + suma1 + " celkove " + pocetBankovek) ;
    }
}
