package com.calculatron;

import javax.swing.*;

public class VariacionPorcentual {
    // Creamos las variables privadas para la Clase
    private double valorInicial;
    private double valorFinal;
    private double variacionCalculada;
    private String resultado;

    public String calcular(JTextField valorInicial, JTextField valorFinal) {
        // Chequeamos el imput para ver que sean doubles parseables
        try {
            this.valorInicial = Double.parseDouble(valorInicial.getText());
            this.valorFinal = Double.parseDouble(valorFinal.getText());
            // Formula
            variacionCalculada = ((this.valorFinal - this.valorInicial) / this.valorInicial) *100;

            this.resultado = String.format("%.2f", variacionCalculada);
        } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
                null,
                "Completá los campos con números enteros o decimales separados por puntos.");
        }
        return resultado;
    }

}
