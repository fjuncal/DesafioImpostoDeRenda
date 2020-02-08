
package desafioAnb.test;

import junit.framework.TestCase;
import com.desafioimposto.desafioimpostoderenda.Operacoes;


public class OperacoesTest extends TestCase {
    Operacoes op = new Operacoes();
    
    public void testCalculaInss(){
        float salario;
        
        salario = op.calculaInss(3000f);
        assertEquals(salario, 330.00f);
        
    }
    
    public void testSalarioDescontadoInss(){
        float novoSalario;
        
        novoSalario = op.salarioDescontadoInss(3000f, 330f);
        assertEquals(novoSalario, 2670.00f);
        
    }
    
    public void testDescontoDependente(){
        float salarioDescontoDep;
        
        salarioDescontoDep = op.descontoDependente(2, 2670f);
        assertEquals(salarioDescontoDep, 2290.82f);
          
     }
     
    public void testImpostoIrpf(){
        float calculaIrpf;
         
        calculaIrpf = op.impostoIrpf(2670.0f, 2290.82f);
        assertEquals(calculaIrpf, 29.011505f);
        
        
     }
     
    public void testDescontoTotal(){
         float descontoTotal;
         
         descontoTotal = op.descontoTotal(29.01f, 330f);
         assertEquals(descontoTotal, 359.01f);
     }
     
    public void testSalarioFinal(){
         float salarioFinal;
         
         salarioFinal = op.salarioFinal(3000, 359.01f);
         assertEquals(salarioFinal, 2640.99f);
     }
    

}
