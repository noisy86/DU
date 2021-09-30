package com.company;

public class Bankovky2 {
    public static void main(String[] args) {
        int bankovky[] = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1} ;
        int suma = 12371;
        int suma1 = suma;
        String vysledek = "";
        int pocetMince = 0;
        int pocetBankovek = 0;
        while (suma != 0) {
            for (int i = 0; i < bankovky.length; i++){
                if (suma >= bankovky[i]){
                    suma -= bankovky[i];
                    if (i > 5){
                        pocetMince++;
                    }else {
                        pocetBankovek++;
                    }
                    if (suma == 0) {
                        vysledek += bankovky[i]+" = ";
                    }else{
                        vysledek += bankovky[i]+" + ";
                    }
                    break;
                }
            }
        }
        System.out.println(vysledek + suma1);
        System.out.println("Pocet bankovek: " + pocetBankovek);
        System.out.println("Pocet mince: " + pocetMince);

    }
}
