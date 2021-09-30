package com.company;

import java.text.NumberFormat;

public class kurzy {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);

        String str = "USA|dolar|1|USD|22,020";
        String dollar = str.replace(',','.');
        String[] out = dollar.split("\\|");
        double kurz = Double.parseDouble(out[4]);
        System.out.println( nf.format(1/kurz)+ " " + out[1] + " = 1 CZK");
        System.out.println("30 CZK = " + nf.format(1/kurz*30) + " " + out[3]);
    }
}
