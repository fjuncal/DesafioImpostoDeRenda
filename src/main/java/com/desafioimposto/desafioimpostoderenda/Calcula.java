
package com.desafioimposto.desafioimpostoderenda;

import javax.swing.JOptionPane;


public class Calcula {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        float salario;
        int numContribuinte;
       
        
        salario = leSalario();
        numContribuinte = leNumDependente();
        menu(op, salario, numContribuinte);
        
        
    }
    public static float leSalario(){
        float salario;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu salário: "));
        return salario;
    }
    
    public static int leNumDependente(){
        int numContribuinte;
        numContribuinte = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependente(s): "));
        return numContribuinte;
    }
    public static void menu(Operacoes op, float salario, int numDependente){
        JOptionPane.showMessageDialog(null, "Salário: " + salario +
                "\n" + "Número de dependentes: " + numDependente + 
                "\n" + "-----------------------------------------" +
                "\n" + "imposto_inss: " + op.calculaInss(salario) + 
                "\n" + "imposto_irpf: " + op.impostoIrpf(op.salarioDescontadoInss(salario, op.calculaInss(salario)), op.descontoDependente(numDependente, op.salarioDescontadoInss(salario, op.calculaInss(salario)))) +
                "\n" + "desconto_total: " + op.descontoTotal(op.impostoIrpf(op.salarioDescontadoInss(salario, op.calculaInss(salario)), op.descontoDependente(numDependente, op.salarioDescontadoInss(salario, op.calculaInss(salario)))), op.calculaInss(salario)) +
                "\n" + "salário_final: " + op.salarioFinal(salario, op.descontoTotal(op.impostoIrpf(op.salarioDescontadoInss(salario, op.calculaInss(salario)), op.descontoDependente(numDependente, op.salarioDescontadoInss(salario, op.calculaInss(salario)))), op.calculaInss(salario))));
    }
}
