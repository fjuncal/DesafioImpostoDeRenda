
package desafioAnb.test;

import junit.framework.TestCase;
import com.desafioimposto.desafioimpostoderenda.Operacoes;


public class OperacoesTest extends TestCase {
    Operacoes op = new Operacoes();
    
    public void testCalculaInss(){
        float salario;
        float desconto;
        salario = op.calculaInss(3000f);
        desconto = 330.00f;
        
        assertEquals(desconto, salario);
        
    }
    
      public void testSalarioDescontadoInss(){
        float novoSalario;
        float salario = 3000f;
        float desconto = 330f;
        novoSalario = op.salarioDescontadoInss(salario, desconto);
        
       
          assertEquals(novoSalario, novoSalario);
        
    }
    
     public void testDescontoDependente(){
        float salarioInss = 2670f;
        float valorDependente = 379.18f;
        float salarioDescontoDep;
        
        
        salarioDescontoDep = op.descontoDependente(2, salarioInss);
        
       
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
    
//    public OperacoesTest(String testName) {
//        super(testName);
//    }
//    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

   
}
