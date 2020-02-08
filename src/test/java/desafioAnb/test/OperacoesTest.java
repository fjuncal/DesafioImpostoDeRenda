
package desafioAnb.test;

import junit.framework.TestCase;
import com.desafioimposto.desafioimpostoderenda.Operacoes;


public class OperacoesTest extends TestCase {
    Operacoes op = new Operacoes();
    
    public void testCasoDeTeste1() {

	float salario = 1000f; 
	int numeroDependentes = 0;
	
	float inss = op.calculaInss(salario);
	float salarioDescontadoInss = op.salarioDescontadoInss(salario, inss);
        float descontoDependente = op.descontoDependente(numeroDependentes, salarioDescontadoInss);
	float irpf = op.impostoIrpf(salarioDescontadoInss, descontoDependente);
	float descontoTotal = op.descontoTotal(irpf, inss);
	float salarioComDescontos = op.salarioFinal(salario, descontoTotal);
	
	assertEquals(80.00f, inss);
	assertEquals(0.00f, irpf);
	assertEquals(80.00f, descontoTotal);
	assertEquals(920.00f, salarioComDescontos);	
}
    
    public void testCasoDeTeste2(){
        float salario = 3000f;
        int numeroDependentes = 2;
        
        float inss = op.calculaInss(salario);
	float salarioDescontadoInss = op.salarioDescontadoInss(salario, inss);
        float descontoDependente = op.descontoDependente(numeroDependentes, salarioDescontadoInss);
	float irpf = op.impostoIrpf(salarioDescontadoInss, descontoDependente);
	float descontoTotal = op.descontoTotal(irpf, inss);
	float salarioComDescontos = op.salarioFinal(salario, descontoTotal);
        
        assertEquals(330.00f, inss);
	assertEquals(29.011505f, irpf);
	assertEquals(359.0115f, descontoTotal);
	assertEquals(2640.9885f, salarioComDescontos);
        
    }
    
    public void testCasoDeTeste3(){
        float salario = 6000f;
        int numeroDependentes = 0;
        
        float inss = op.calculaInss(salario);
	float salarioDescontadoInss = op.salarioDescontadoInss(salario, inss);
        float descontoDependente = op.descontoDependente(numeroDependentes, salarioDescontadoInss);
	float irpf = op.impostoIrpf(salarioDescontadoInss, descontoDependente);
	float descontoTotal = op.descontoTotal(irpf, inss);
	float salarioComDescontos = op.salarioFinal(salario, descontoTotal);
        
        assertEquals(642.34f, inss);
	assertEquals(603.9966f, irpf);
	assertEquals(1246.3367f, descontoTotal);
	assertEquals(4753.663f, salarioComDescontos);
    }

}
