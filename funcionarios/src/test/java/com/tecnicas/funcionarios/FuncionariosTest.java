package com.tecnicas.funcionarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FuncionariosTest {
	private Funcionario funcionario = new Funcionario(12345,"Douglas", 1000, 10, true);
	
	@Test
	public void testAssetSalarioBruto() {
		assertEquals(1100, this.funcionario.getSalarioBase());
	}
	
}
