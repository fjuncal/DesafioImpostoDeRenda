
package desafioAnb.test;

import junit.framework.TestCase;
import com.desafioimposto.desafioimpostoderenda.Operacoes;


public class OperacoesTest extends TestCase {
    Operacoes op = new Operacoes();
    
    public void testCasoDeTeste1() {

	float salario = 1000f; 
	int numeroDependentes = 0;
	
	float inss = op.calculaInss(salario);
	float salarioDescontadoInss = salario - inss;
        float descontoDependente = op.descontoDependente(numeroDependentes, salarioDescontadoInss);
	float irpf = op.impostoIrpf(salarioDescontadoInss, descontoDependente);
	float descontoTotal = op.descontoTotal(irpf, inss);
	float salarioComDescontos = op.salarioFinal(salario, descontoTotal);
	
	assertEquals(80.00f, inss);
	assertEquals(0.00f, irpf);
	assertEquals(80.00f, descontoTotal);
	assertEquals(920.00f, salarioComDescontos);	
}
    
//    public void testCalculaInss(){
//        float salario;
//        
//        salario = op.calculaInss(3000f);
//        assertEquals(salario, 330.00f);
//        
//    }
//    
//    public void testSalarioDescontadoInss(){
//        float novoSalario;
//        
//        novoSalario = op.salarioDescontadoInss(3000f, 330f);
//        assertEquals(novoSalario, 2670.00f);
//        
//    }
//    
//    public void testDescontoDependente(){
//        float salarioDescontoDep;
//        
//        salarioDescontoDep = op.descontoDependente(2, 2670f);
//        assertEquals(salarioDescontoDep, 2290.82f);
//          
//     }
//     
//    public void testImpostoIrpf(){
//        float calculaIrpf;
//         
//        calculaIrpf = op.impostoIrpf(2670.0f, 2290.82f);
//        assertEquals(calculaIrpf, 29.011505f);
//        
//        
//     }
//     
//    public void testDescontoTotal(){
//         float descontoTotal;
//         
//         descontoTotal = op.descontoTotal(29.01f, 330f);
//         assertEquals(descontoTotal, 359.01f);
//     }
//     
//    public void testSalarioFinal(){
//         float salarioFinal;
//         
//         salarioFinal = op.salarioFinal(3000, 359.01f);
//         assertEquals(salarioFinal, 2640.99f);
//     }
    

}
