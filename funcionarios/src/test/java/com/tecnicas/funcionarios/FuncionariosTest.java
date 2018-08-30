package com.tecnicas.funcionarios;

import org.junit.Test;

public class FuncionariosTest {
	private Funcionario funcionario;

	public FuncionariosTest(Funcionario funcionario) {
		super();
		this.funcionario = funcionario;
	}
	
	@Test
	public void testAssetSalarioBruto() {
		this.funcionario.getMatricula();
	}
	
}
