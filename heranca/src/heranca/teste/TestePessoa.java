package heranca.teste;

import java.time.LocalDate;

import heranca.model.Funcionario;
import heranca.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Ana Cl�udia");
		pessoa1.setIdade(18);
		pessoa1.setTelefone("4545-5454");		
		System.out.println(pessoa1.getNome() + " fala-te: " + pessoa1.falarBomdia());
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Gabriel");
		funcionario1.setIdade(20);
		funcionario1.setTelefone("90342-0932");
		System.out.println(funcionario1.falarBomdia());
		funcionario1.setSalario(1550.90);
		funcionario1.setDataAdmissao(LocalDate.of(2000, 4, 24));
		System.out.println(funcionario1.getIdade());
	}

}
