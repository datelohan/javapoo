public class Banco {

    public int numConta;
    private String cliente;
    protected String tipo;
    private float saldo;
    private String status;

    private int cc = 12;
    private int cp =20;

    public void abrirConta(String cliente, int numConta, float saldo, String tipo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;


        status = "aberta";
    }

    public void fecharConta() {
        this.status = "fechada";
//        this.saldo = 0;

    }

    public void depositar(float saldo) {
        this.saldo += saldo;

    }

    public float getSaldo() {
        return this.saldo;
    }

    public void sacar(float valor) {

        if (this.saldo >= valor && status == "aberta") {
            saldo -= valor;
        } else {
            System.out.println("ERRO ! voce não tem dinheiro suficiente");
        }

    }

    public void pagarMensal() {

        if (saldo >= cp && saldo >cc) {
            if(this.tipo =="cp") {
                this.saldo -= cp;
                System.out.println("Seu Saldo Atual após pagar a mensalidade é de " + getSaldo());
            }else {
                this.saldo -= cc;
            }
        } else {
            System.out.println("Voce não dinheiro suficiente para pagar sua mensalidade, contate seu banco");

        }
    }

    public void setTipo(String tipo) {
        if(tipo == "cp" || tipo == "cc"){
            this.tipo = tipo;
        }else{
            System.out.println("Tipo de conta inválido por favor digite cp || cc");
        }
    }
    public String getTipo(){
        return this.tipo;
    }
}
