public class Conta {
	private double saldo; //= 100; //Ao abrir uma conta o saldo já é 100. PRIVADO, não pode ser lido nem modificado a não ser dentro da própria classe.
	private int agencia;
	private int numero;
	private Cliente titular; //Composição associar uma classe a outra.	// = new Cliente(); // Se quiser, toda vez que der um new conta abre um novo cliente, ou seja, ao abrir uma conta cria um novo cliente. Desta forma não precisa iniciá-la posteeiormente.
	private static int total = 0;	//Poderia ter inicializado com"total = 0'. Total com o static pertence a classe e não mais aos objetos
	
	public Conta(int agencia, int numero) {//construtor não retorna NADA! É responsável pela criação de atributos. | Neste caso se a conta criada nasce com o número e morre com o mesmo número, não é necessário o setNumero e setAgencia (atributo imutável).
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);			
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	
	public void deposita(double valor) { //void após deposita não é devolvido nada!CRIAÇÃO DE MÉTODO.
		this.saldo += + valor; //this se refere a esta conta(que chamou e método), o this é opcional.
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
	
	public void setNumero(int numero){ //int numero variável temporária, variável do argumento, diferente do this.numero
		if(numero <= 0) {
			System.out.println("Não pode valor <= 0.");
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return this.agencia; //Usá-se o "this" pois se refere ao retorno do valor do objeto criado, difetente do método static por se tratar de uma classe e não objeto.
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return; //como o método é void, não precisa colocar nada depois do return (O RETURN FAZ COM QUE A LINHA DE BAIXO NÃO SEJA EXECUTADA).
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { //Método public que retorna int e que pede o Total.
		return Conta.total;
	}
	
	
}