package com.calculatron;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public JPanel MainPanel;
    private JTabbedPane tabbedPane1;
    // Resolvente
    private JTextField valorAReglaDeTres;
    private JTextField valorBReglaDeTres;
    private JTextField valorCReglaDeTres;
    private JTextField valorDReglaDeTres;
    private JButton calcularReglaDeTresButton;
    // Variación porcentual
    private JTextField valorInicialVP;
    private JTextField valorFinalVP;
    private JTextField varPorcentualVP;
    private JButton calcularVP;
    // Regla de 3 simple
    private JTextField valorAResolvente;
    private JTextField valorBResolvente;
    private JTextField valorCResolvente;
    private JTextField equisUnoResolvente;
    private JTextField equisDosResolvente;
    private JButton calcularResolvente;

    public GUI() {
        // Creamos los objetos
        var resolvente = new FormulaResolvente();
        var variacionPorcentual = new VariacionPorcentual();
        var reglaDeTresSimple = new ReglaDeTres();

        calcularResolvente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] resultadosResolvente = resolvente.calcular(valorAResolvente, valorBResolvente, valorCResolvente);
                equisUnoResolvente.setText(resultadosResolvente[0]);
                equisDosResolvente.setText(resultadosResolvente[1]);
            }
        });
        calcularReglaDeTresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultadoRT = reglaDeTresSimple.calcular(valorAReglaDeTres, valorBReglaDeTres, valorCReglaDeTres);
                valorDReglaDeTres.setText(resultadoRT);
            }
        });
        calcularVP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultadoVP = variacionPorcentual.calcular(valorInicialVP, valorFinalVP);
                varPorcentualVP.setText(resultadoVP);
            }
        });
    }

}
