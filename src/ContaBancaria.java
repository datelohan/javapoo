public class ContaBancaria {
    public static void main(String[] args) {
        Banco c1 = new Banco();
        c1.abrirConta("Lohan",2201,0,"Corrente");
        c1.depositar(1000);
        c1.setTipo("cp");
        c1.fecharConta();
        c1.pagarMensal();
        c1.sacar(500);
        System.out.println(c1.getSaldo());


    }
}
