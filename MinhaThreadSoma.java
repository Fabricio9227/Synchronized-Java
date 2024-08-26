package Synchronized;

public class MinhaThreadSoma implements Runnable{
    //Atributos
    private String nome;
    private int[] nums;

    //Instância estática da calculadora
    private static Calculadora calc = new Calculadora();

    //Construtor
    public MinhaThreadSoma(String nome, int[] nums){
        this.nome=nome;
        this.nums=nums;
        new Thread(this, nome).start();
    }



    @Override
    public void run() {

        System.out.println(this.nome + " começou");

        int soma = calc.somaArray(this.nums);

        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);

        System.out.println(this.nome + " terminou");

    }
    
}
