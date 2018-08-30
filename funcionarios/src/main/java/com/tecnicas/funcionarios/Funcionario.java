package com.tecnicas.funcionarios;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private int nroDependentes;
	private boolean insalubridade;
	
	public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {
		this.matricula=matricula;
		this.nome=nome;
		this.salarioBase=salarioBase;
		this.nroDependentes=nroDependentes;
		this.insalubridade=insalubridade;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNroDependentes() {
		return nroDependentes;
	}

	public boolean getInsalubridade() {
		return insalubridade;
	}

	public double getSalarioBruto() {
		double salario = getSalarioBase();
		if (getInsalubridade()) {
			salario = salario * 1.1;
		}
		salario = salario * (1 + (getNroDependentes() / 100));
		return salario;
	}

	public double getSalarioLiquido() {
		double salario = getSalarioBruto();
		double inss = salario * 0.045;
		double imp = 0;
		if (inss > 5000) {
			inss = 5000;
		}
		if (salario > 2000 && salario < 5000) {
			imp = salario * 0.12;
		} else if (salario > 5000) {
			imp = salario * 0.275;
		}
		return salario - inss - imp;
	}
}
