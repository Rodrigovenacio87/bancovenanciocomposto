
public class TestaBanco {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.nome = "Rodrigo Venancio da Silva";
		rodrigo.cpf = "666.666.666.66";
		rodrigo.profissao = "Desenvolvedor Java";
		
		Conta contadoRodrigo = new Conta();
		contadoRodrigo.deposito(100);
		
		contadoRodrigo.Titular = rodrigo;
		System.out.println(contadoRodrigo.Titular.nome);
	}
}
