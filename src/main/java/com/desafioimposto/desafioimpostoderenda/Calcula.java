
package com.desafioimposto.desafioimpostoderenda;

import java.text.DecimalFormat;
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
        
        DecimalFormat df = new DecimalFormat("0.00");
        String salarioFormatado = df.format(salario);
        String descontoInssFormatado = df.format(descontoInss);
        String impostoIrpfFormatado = df.format(impostoIrpf);
        String descontoTotalFormatado = df.format(descontoTotal);
        String salarioFinalFormatado = df.format(salarioFinal);
        
        JOptionPane.showMessageDialog(null, "Salário: " + "R$ " + salarioFormatado +
                "\n" + "Número de dependentes: " + numDependente + 
                "\n" + "-----------------------------------------" +
                "\n" + "imposto_inss: " +  "R$ " + descontoInssFormatado + 
                "\n" + "imposto_irpf: " + "R$ " + impostoIrpfFormatado +
                "\n" + "desconto_total: " + "R$ " + descontoTotalFormatado +
                "\n" + "salário_final: " + "R$ " + salarioFinalFormatado);
    }
}
