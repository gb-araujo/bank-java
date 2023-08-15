package bank;

public class Conta {
	
	// instancias
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int totalContas = 0; // static - instancia da CLASSE e não do objeto.
	

	// Construtor
	
	public Conta(int numero, int agencia) {
		System.out.println("Criando uma nova conta!");
		totalContas++; // contagem do número de contas criadas com o static
		this.agencia = agencia;
		this.numero = numero;
	}
	
	
	// metodos
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
			}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
			} else {
				return false;
				}}
	
	// getters and setters
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
} 
