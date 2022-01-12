
public class TestaValores {
	
	public static void main(String[] args) {		
		Conta conta = new Conta(1337, 24226);// o problema que a conta j� nasce com valor inicial = 0.| O "new Conta()" � a parte que executa o construtor, � executado apenas uma vez na constru��o do objeto
		
		////conta est� inconsistente, isso se resolve atrav�s do construtor
		//conta.setAgencia(-50); //Para evitar numeros negativo feito um if no m�todo
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());// aqui o valor vai ser 0 pois � o valor padr�o, mas pela regra do banco n�o pode ter agencia com 0.
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());//"Conta.getTotal" n�o funciona pois os m�todos feitos at� agora s�o m�todos da inst�ncia e n�o da classe. Para o m�todo ser da classe e n�o da inst�ncia � preciso coloc�-lo como static l� no get.
		
	}

}
