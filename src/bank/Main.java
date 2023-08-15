package bank;

public class Main {
	public static void main(String[] args) {
// Invocando métodos e setando atributos
		Conta conta = new Conta(45288,1512);
		Cliente gabriel = new Cliente("Gabriel Araujo", "123412345");
		conta.setTitular(gabriel);
		conta.deposita(400);
		
		
		Conta contaFulano = new Conta(45288,1512);
		Cliente clienteFulano = new Cliente("Fulano ", "123412345");
		conta.setTitular(clienteFulano);

		
		conta.transfere(200, contaFulano);
		gabriel.setProfissao("Programador");
		clienteFulano.setProfissao("Professor");
		
		System.out.println("Nome: " + gabriel.getNome() + 
				", Profissão: " +  gabriel.getProfissao() + ", Saldo: " + conta.getSaldo());
		System.out.println("Nome: " + clienteFulano.getNome() +
				", Profissão: " + clienteFulano.getProfissao() +
				", Saldo: " + contaFulano.getSaldo()) ;
		
		System.out.println("O total de contas cadastradas: " + Conta.getTotalContas());

	}
}
