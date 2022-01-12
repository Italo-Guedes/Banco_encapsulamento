
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta =new Conta(1337, 24226);//criação da conta
		////conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();//Após criar a conta, foi criado o cliente, atribuido o nome ao cliente "paulo silveira" e associado o cliente paulo a conta criada (conta.setTitular(paulo);). 
		//conta.titular = paulo;
		paulo.setNome("paulo silveira"); 
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador"); // == paulo.setProfissao("Programador");
		//Agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		paulo.setProfissao("Dev Senior");
		System.out.println(paulo.getProfissao());
		System.out.println(conta.getTitular().getProfissao());
		
		
	
	
		
	}

}
