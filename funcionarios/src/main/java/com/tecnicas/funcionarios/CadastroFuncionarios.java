package com.tecnicas.funcionarios;
import java.util.*;

public class CadastroFuncionarios {
	public CadastroFuncionarios() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		Random rand=new Random();
		int matricula=1000;
		String nome="func";
		//double salarioBase;
		//int nroDependentes;
		//boolean insalubridade;
		for(int i=0;i<rand.nextInt(100)+10;i++) {
			Funcionario us= new Funcionario(matricula+i,nome+i,rand.nextInt(10000)+1000,rand.nextInt(10),rand.nextBoolean());
			lista.add(us);
		}
	}

}
