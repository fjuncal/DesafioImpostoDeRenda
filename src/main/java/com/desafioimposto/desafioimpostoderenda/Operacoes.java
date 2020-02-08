package com.desafioimposto.desafioimpostoderenda;
public class Operacoes {
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
      public float salarioDescontadoInss(float salario, float descontoInss){
        float novoSalario;
        
        novoSalario = salario - descontoInss;
        return novoSalario;
    }
      public float descontoDependente (int numDependente, float salarioInss){
         float valorDependente;
         float salarioDescontadoDep;
         
         valorDependente = numDependente * 189.59f;
         salarioDescontadoDep = salarioInss - valorDependente;
         
         return salarioDescontadoDep;        
    }
}
