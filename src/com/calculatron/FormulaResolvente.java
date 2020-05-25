package com.calculatron;

import javax.swing.*;

public class FormulaResolvente {

    private double valorA;
    private double valorB;
    private double valorC;
    private String[] resultado = new String[2];

    public String[] calcular(JTextField a, JTextField b, JTextField c) {

        this.valorA = Double.parseDouble(a.getText());
        this.valorB = Double.parseDouble(b.getText());
        this.valorC = Double.parseDouble(c.getText());

        double resPositivo = (-valorB + Math.sqrt(Math.pow(valorB, 2) - (4 * valorA * valorC))) / (2 * valorA);
        double resNegativo = (-valorB - Math.sqrt(Math.pow(valorB, 2) - (4 * valorA * valorC))) / (2 * valorA);

        resultado[0] = String.format("%.2f", resPositivo);
        resultado[1] = String.format("%.2f", resNegativo);

        return resultado;
    }
}
