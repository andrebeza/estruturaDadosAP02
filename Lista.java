public class Lista<J> {
    private No<J> head;
    private No<J> tail;
    private int size;

    private static class No<J>{
        private final J info;
        private No<J> noAnterior;
        private No<J> proximoNo;

        public No(J info){
            this.info = info;
        }
    }

    public void inserirInicio(J info){
        No<J> criarNo = new No<>(info);
        if (head == null){
            head = criarNo;
            tail = criarNo;
        }else {
            criarNo.proximoNo = head;
            head.noAnterior = criarNo;
            head = criarNo;
        }
        size++;
    }

    public void inserirFim(J info){
        No<J> criarNo = new No<>(info);
        if (head == null){
            head = criarNo;
        }else {
            tail.proximoNo = criarNo;
            criarNo.noAnterior = tail;
        }
        tail= criarNo;
        size++;
    }

    public void removerComeco(){
        if (head == null){
            throw new IllegalStateException("A lista está vazia!");
        }
        head = head.proximoNo;
        if ((head == null) && (tail == null)){
            head.noAnterior = null;
        }
        size--;
    }

    public void removerFim(){
        if (tail == null){
            throw new IllegalStateException("Não foi encontrado nenhum elemento na lista");
        }
        tail = tail.noAnterior;
        if (tail == null){
            head = null;
        }else {
            tail.proximoNo = null;
        }
        size--;
    }

    public J getPosicao(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index inválido");
        }
        No<J> atual = head;
        for (int x = 0; x < index; x++){
            atual = atual.proximoNo;
        }
        return atual.info;
    }

    public void getLista(){
        No<J> atual = head;
        while (atual != null){
            System.out.println(atual.info);
            atual = atual.proximoNo;
        }
        System.out.println();
    }
}




























