package com.calculatron;

import javax.swing.*;

public class ReglaDeTres {
    // Creamos las variables privadas para la Clase
    private double valorA;
    private double valorB;
    private double valorC;
    private String resultado;

    // Calculamos
    public String calcular(JTextField valorA, JTextField valorB, JTextField valorC) {
        // Chequeamos el imput para ver que sean doubles parseables
        try {
            this.valorA = Double.parseDouble(valorA.getText());
            this.valorB = Double.parseDouble(valorB.getText());
            this.valorC = Double.parseDouble(valorC.getText());
            // Fórmula
            this.resultado = String.format("%.2f", ((this.valorB * this.valorC) / this.valorA));
        } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
                null,
                "Completá los campos con números enteros o decimales separados por puntos.");
        }
        return resultado;
    }
}
