package com.calculatron;

import javax.swing.*;

public class VariacionPorcentual {

    private double valorInicial;
    private double valorFinal;
    private double variacionCalculada;
    private String resultado;

    public String calcular(JTextField valorInicial, JTextField valorFinal) {
        this.valorInicial = Double.parseDouble(valorInicial.getText());
        this.valorFinal = Double.parseDouble(valorFinal.getText());

        variacionCalculada = ((this.valorFinal - this.valorInicial) / this.valorInicial) *100;

        this.resultado = String.format("%.2f", variacionCalculada);

        return resultado;
    }

}
