
package com.desafioimposto.desafioimpostoderenda;

import javax.swing.JOptionPane;


public class Calcula {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        float salario;
        int numContribuinte;
        float imposto_inss;
        float imposto_irpf;
        float desconto_total;
        float salario_final;
        
        salario = leSalario();
        numContribuinte = leNumDependente();
        menu(op, salario, numContribuinte);
        
        
        
        
       
//        System.out.println(op.calculaInss(3000));
//        System.out.println(op.salarioDescontadoInss(3000f, 330f));
//        System.out.println(op.descontoDependente(2, 2670f));
//        System.out.println(op.impostoIrpf(2670f, 2290.82f));
//        System.out.println(op.descontoTotal(29.01f, 330f));
//        System.out.println(op.salarioFinal(3000, 359.01f));
        
        
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
                "\n" + "desconto_total: " + op.descontoTotal(op.impostoIrpf(op.salarioDescontadoInss(salario, op.calculaInss(salario)), op.descontoDependente(numDependente, op.salarioDescontadoInss(salario, op.calculaInss(salario)))), op.calculaInss(salario)));
    }
}
