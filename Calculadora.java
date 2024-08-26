package Synchronized;

public class Calculadora {
    //Atributos
    private int soma;

    //Método
    public synchronized int somaArray(int[] array) { //"synchronized" garante que esse método seja feito do inicio ao fim por uma Thread de cada vez
        soma = 0;
        for(int i = 0; i<array.length; i++) {
            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName() + 
            " somando o valor " + array[i] + " com total de " + soma); //O método "currentThread()" pega uma das Threads atuais para imprimir na tela

            try {
                Thread.sleep(100); //Faz a Thread atual dormir 100 milessegundos
            } catch (InterruptedException erro) {
                erro.printStackTrace();
            }
        }

        return soma;
    }
}
