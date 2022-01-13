

//atributos(variaveis Casracteristicas de um objeto)


public class Conta {
	
	private double Saldo;
	int Agencia;
	int Numero;
	Cliente Titular;

	public void deposito(double valor) {
		this.Saldo = this.Saldo + valor;
		// ou poderia declar assim
		// this.Saldo +=valor;
	}

	public boolean saca(double valor) {
		if (this.Saldo >= valor) {
			this.Saldo = this.Saldo - valor;
			// ou poderia declar assim
			// this.Saldo -=valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferencia(double valor, Conta destino) {
		if (this.Saldo >= valor) {
			this.Saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
}
