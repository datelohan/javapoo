public class Caneta {
    public String modelo;
    public  String cor;
    private  float ponta;
    protected  float carga;
    private  boolean tampada;


    public  Caneta(String modelo,String cor,float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.destampar();

    }
    public  void status(){
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Ponta :" + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Tampada : " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO ! não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected  void destampar(){
        this.tampada = false;
    }
    public  void setPonta( float p){
        this.ponta = p;

    }
    public float getPonta(){
        return ponta;
    }
}
