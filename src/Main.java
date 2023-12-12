import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //váriaveis

        //tipo nome = valor;

        int idade = 22;
        String nome = "Lohan";

        //variavei local somente no  escopo do projeto usar'var'

        var exemplo = "testando exemplo";
        // precisa definir o valor na declaração utilizando o 'var

        //tipos variaveis para inteiro

//           byte=  8 bits = -128 a 127 = 2 elevado a 8 ,short,int,long

//         tipos de variavel booleano
            // true or false

//         tipos de varieveis caracteres ou string

        char letra ='c';
        String caracteres = "abcdefg";

//        tipos de var decimais
        double troco  = 22.35;
        float recebido = 123324.423F; // repare no F no final do valor tem que ser declarado no tipo float

//        condicionais java

            if(idade > 22.60){
                System.out.println("Maior");

            } else if (troco == 22.35) {
                System.out.println("Igual");

            } else {
                System.out.println("Menor");
            }

//    manipulando arrays
        //tipos de declaração de array  nativo método 1 passando já os valores
        int Array [] = {1,2,3,4};
//        Array[4] = 200;
       // System.out.println(Array[4]); // erro porque o ultrapassa o tamanho do array.length que
        //declarado com 4 elementos
            //método 2
        int [] Array2 = new int[10];
        Array2[1] = 200;
        System.out.println(Array2[1]);
        // usando classe util java

        ArrayList <String> nomes = new ArrayList<String>();
        nomes.add("Lohan");
        nomes.add("Ricardo");
        nomes.add("Roger");
        nomes.size();
        // for
        for(var i = 0 ; i < nomes.size();i++){
            System.out.println(nomes.get(i));
        }
        // while
        int i = 0;
       while(i <= idade ){
           if(i == 22) {
               System.out.println("Sua idade é de : " + i +" anos");
           }
           i++;
       }
       // CASTING  CONVERTER TIPOS DE VALORES
            int dado1 = 23;
            double dado2 = dado1;
            //erro abaixo
//            dado1 = dado2;
             dado1 = (int)dado2 ;

             char letra1 = 'b';
             String letras = String.valueOf(letra1);
             System.out.println(letras);

//             String recebendostring = letra1;// erro
                String recebendostring = String.valueOf(dado1);
                dado2 = Integer.parseInt(recebendostring);


    }

}