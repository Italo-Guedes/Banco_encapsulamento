
public class TestaValores {
	
	public static void main(String[] args) {		
		Conta conta = new Conta(1337, 24226);// o problema que a conta já nasce com valor inicial = 0.| O "new Conta()" é a parte que executa o construtor, é executado apenas uma vez na construção do objeto
		
		////conta está inconsistente, isso se resolve através do construtor
		//conta.setAgencia(-50); //Para evitar numeros negativo feito um if no método
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());// aqui o valor vai ser 0 pois é o valor padrão, mas pela regra do banco não pode ter agencia com 0.
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());//"Conta.getTotal" não funciona pois os métodos feitos até agora são métodos da instância e não da classe. Para o método ser da classe e não da instância é preciso colocá-lo como static lá no get.
		
	}

}
