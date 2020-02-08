
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
        float descontoInss = op.calculaInss(salario);
        float salarioComDescontoInss = op.salarioDescontadoInss(salario, descontoInss);
        float descontoDependente = op.descontoDependente(numDependente, salarioComDescontoInss);
        float impostoIrpf = op.impostoIrpf(salarioComDescontoInss, descontoDependente);
        float descontoTotal = op.descontoTotal(impostoIrpf, descontoInss);
        float salarioFinal = op.salarioFinal(salario, descontoTotal);
        
        JOptionPane.showMessageDialog(null, "Salário: " + salario +
                "\n" + "Número de dependentes: " + numDependente + 
                "\n" + "-----------------------------------------" +
                "\n" + "imposto_inss: " + descontoInss + 
                "\n" + "imposto_irpf: " + impostoIrpf +
                "\n" + "desconto_total: " + descontoTotal +
                "\n" + "salário_final: " + salarioFinal);
    }
}
