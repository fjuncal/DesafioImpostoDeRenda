package com.desafioimposto.desafioimpostoderenda;
public class Operacoes {

    public Operacoes() {
    }
    
    //Este método calcula o desconto total do Inss.
    public float calculaInss(float salario){
        float desconto = 0;
        if (salario <= 1751.81f){
            desconto = salario * 0.08f;
            return desconto;
         } else if ((salario >= 1751.82f) && (salario <= 2919.72f)){
             desconto = salario * 0.09f;
             return desconto;  
         } else if ((salario >= 2919.73f) && (salario <= 5839.45f)){
             desconto = salario * 0.11f;
             return desconto;    
         } else if (salario > 5839.45f){
             desconto = 642.34f;
             return desconto;
         }
        return desconto;
    }
    //Este método calcula o novo salário subtraindo o valor do Inss.
    public float salarioDescontadoInss(float salario, float descontoInss){
        float novoSalario;
        
        novoSalario = salario - descontoInss;
        return novoSalario;
    }
    //Este método calcula o desconto de acordo com quantos dependentes a pessoa possui (valor por dependente 189.59,
    // e depois subtrai o desconto dependente do salário do Inss (já descontado).
    public float descontoDependente (int numDependente, float salarioInss){
         float valorDependente;
         float salarioDescontadoDep;
         
         valorDependente = numDependente * 189.59f;
         salarioDescontadoDep = salarioInss - valorDependente;
         
         return salarioDescontadoDep;        
    }
    //este método calcula o ImpostoIrpf, de acordo com o desconto na tabela, dps multiplicando o salário já descontado dos dependentes com o juros da Alíquota(Irpf),
    //subtraindo o Irpf do desconto da tabela, gerando um novo valor Irpf.
    public float impostoIrpf(float salarioInss, float salarioDescontadoDep){
        float irpf;
        float desconto;
        float resultadoIrpf = 0;
        if (salarioInss <= 1903.98){
            return 0.0f;
        
        } else if (salarioInss <= 2826.65){
            desconto = 142.80f;
            irpf = salarioDescontadoDep * 0.075f;
            resultadoIrpf = irpf - desconto;
            return resultadoIrpf;
            
            } else if ((salarioInss >= 2826.66f) && (salarioInss <= 3751.05f)){
                desconto = 354.80f;
                irpf = salarioDescontadoDep * 0.15f;
                resultadoIrpf = irpf - desconto;
                return resultadoIrpf;
            } else if((salarioInss >= 3751.06f) && (salarioInss <= 4664.68f)){
                desconto = 636.13f;
                irpf = salarioDescontadoDep * 0.225f;
                resultadoIrpf = irpf - desconto;
                return resultadoIrpf;
                
            } else if (salarioInss > 4664.68f){
                desconto = 869.36f;
                irpf = salarioDescontadoDep * 0.275f;
                resultadoIrpf = irpf - desconto;
                return resultadoIrpf;
            }
        return resultadoIrpf;
        
    }
    //Este método calcula o desconto total do salário, somando o valor do Irpf + o valor do desconto do Inss, gerando o desconto total.
    public float descontoTotal (float resultadoIrpf, float descontoInss){
        return resultadoIrpf + descontoInss;
    }
    //Este método calcula o valor final do salário, subtraindo o salário pelo desconto total (Irpf e Inss), gerando o salário final.
    public float salarioFinal (float salario, float descontoTotal){
       return salario - descontoTotal;
       
   }
      
}
