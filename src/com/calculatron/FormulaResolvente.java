package com.calculatron;

import javax.swing.*;

public class FormulaResolvente {
    // Creamos las variables privadas para la Clase
    private double valorA;
    private double valorB;
    private double valorC;
    private String[] resultado = new String[2];

    public String[] calcular(JTextField a, JTextField b, JTextField c) {
        // Chequeamos el imput para ver que sean doubles parseables
        try {
            this.valorA = Double.parseDouble(a.getText());
            this.valorB = Double.parseDouble(b.getText());
            this.valorC = Double.parseDouble(c.getText());
            // Calculamos resolvente
            double resPositivo = (-valorB + Math.sqrt(Math.pow(valorB, 2) - (4 * valorA * valorC))) / (2 * valorA);
            double resNegativo = (-valorB - Math.sqrt(Math.pow(valorB, 2) - (4 * valorA * valorC))) / (2 * valorA);
            // Chequeamos que el conjunto corresponda
            // Son dos items, no es necesario iterar
            if (Double.isNaN(resPositivo) || Double.isNaN(resNegativo)) {
                resultado[0] = "Conjunto vacío (∅)";
                resultado[1] = "Conjunto vacío (∅)";
            } else {
                resultado[0] = String.format("%.2f", resPositivo);
                resultado[1] = String.format("%.2f", resNegativo);
            }
            } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Completá los campos con números enteros o decimales separados por puntos.");
            }
        return resultado;
    }
}
