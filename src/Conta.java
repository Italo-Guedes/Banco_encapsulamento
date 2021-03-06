public class Conta {
	private double saldo; //= 100; //Ao abrir uma conta o saldo j? ? 100. PRIVADO, n?o pode ser lido nem modificado a n?o ser dentro da pr?pria classe.
	private int agencia;
	private int numero;
	private Cliente titular; //Composi??o associar uma classe a outra.	// = new Cliente(); // Se quiser, toda vez que der um new conta abre um novo cliente, ou seja, ao abrir uma conta cria um novo cliente. Desta forma n?o precisa inici?-la posteeiormente.
	private static int total = 0;	//Poderia ter inicializado com"total = 0'. Total com o static pertence a classe e n?o mais aos objetos
	
	public Conta(int agencia, int numero) {//construtor n?o retorna NADA! ? respons?vel pela cria??o de atributos. | Neste caso se a conta criada nasce com o n?mero e morre com o mesmo n?mero, n?o ? necess?rio o setNumero e setAgencia (atributo imut?vel).
		Conta.total++;
		System.out.println("O total de contas ?: " + Conta.total);			
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	
	public void deposita(double valor) { //void ap?s deposita n?o ? devolvido nada!CRIA??O DE M?TODO.
		this.saldo += + valor; //this se refere a esta conta(que chamou e m?todo), o this ? opcional.
	}
	
	public boolean saca(double valor) {//retorna um valor booleano.
		if(this.saldo >= valor) { //&& valor != 0) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);//ou destino.saldo += valor;
			return true;
		}
		return false;
		
	}
	
	public double getsaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){ //int numero vari?vel tempor?ria, vari?vel do argumento, diferente do this.numero
		if(numero <= 0) {
			System.out.println("N?o pode valor <= 0.");
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return this.agencia; //Us?-se o "this" pois se refere ao retorno do valor do objeto criado, difetente do m?todo static por se tratar de uma classe e n?o objeto.
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N?o pode valor menor ou igual a 0");
			return; //como o m?todo ? void, n?o precisa colocar nada depois do return (O RETURN FAZ COM QUE A LINHA DE BAIXO N?O SEJA EXECUTADA).
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { //M?todo public que retorna int e que pede o Total.
		return Conta.total;
	}
	
	
}