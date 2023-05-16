import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nome: João André Beza Pires\n" +
                "Instituição: ULBRA-Torres \n" +
                "AP02 Estrutura de Dados \n" +
                "Professor: Ramon Lumertz \n" +
                "Data:16/05/2023\n");

        Lista <Integer> numeros = new Lista<>();

        System.out.println("Insere os valores em ordem desejada => ");
        numeros.inserirInicio(2);
        numeros.inserirInicio(3);
        numeros.inserirInicio(8);
        numeros.inserirInicio(5);
        numeros.getLista();

        System.out.println("Insere o valor no fim da lista => ");
        numeros.inserirFim(7);

        System.out.println("Remove o primeiro elemento => ");
        numeros.removerComeco();
        numeros.getLista();

        System.out.println("Pega o elemento do index => "+ numeros.getPosicao(2));

        System.out.println("Remove o último elemento => ");
        numeros.removerFim();
        numeros.getLista();



        /*jeito simples de fazer uma lista através da LinkedList
        LinkedList <Integer> numeros = new LinkedList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(2);
        System.out.println("Insere os valores => "+numeros);

        numeros.addLast(7);
        System.out.println("Insere o valor 7 no fim da lista => "+numeros);

        for (Integer valor : numeros){
            System.out.print("["+valor+"]");
        }
        System.out.println(" São os valores imprimidos. ");

        numeros.removeFirst();
        System.out.println("\nRemove o primeiro => "+numeros);

        numeros.removeLast();
        System.out.println("Remove o último elemento => "+ numeros);

        System.out.println("Mostra o elemento da posição 2 => "+numeros.get(2));

        for (Integer valor : numeros){
            System.out.print("["+valor+"]");
        }
        System.out.println(" Foram os números que sobraram após as remoções.");
        */

    }
}