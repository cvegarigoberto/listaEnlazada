public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(){
        this.head = null;
    }

    public void insert(int data){
        //metodo para insertar un nuevo nodo al inicio
        if(head == null){
            this.head = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.setNext(this.head);
        this.head = temp;
    }

    public void delete(){
        //metodo para borrar el primer nodo
        this.head = this.head.getNext();
    }

    public void insert(int data, int position){
        //metodo para insertar un nuevo nodo en la posicion dada
        if(position == 1){
            insert(data);
            return;
        }if(position == 2){
            addToNode(this.head, data);
            return;
        }
        Node actual = this.head;
        for(int i=0; i<position - 2; i++){
            actual = actual.getNext();
        }
        addToNode(actual, data);
    }

    private void addToNode(Node actual, int data){
        Node newNode = new Node(data);
        newNode.setNext(actual.getNext());
        actual.setNext(newNode);
    }

    public void printList(){
        //metodo para imprimir la lista
        Node actual = this.head;
        while(actual.getNext() != null){
            System.out.print(actual.getData() + " - ");
            actual = actual.getNext();
        }
        System.out.print(actual.getData());
    }

    public int searchFirstInstance(int data){
        //metodo regresa la posicion de la primera instacia que concuerde con el node.data
        Node actual = this.head;
        int position = 1;
        while(actual != null){
            if(actual.getData() == data){
                return position;
            }
            position = position + 1;
            actual = actual.getNext();
        }
        return 0;
    }

    public int size(){
        //metodo para devolver el tamaño de la lista
        Node actual = this.head;
        int position = 0;
        while(actual != null){
            position = position + 1;
            actual = actual.getNext();
        }
        return position;
    }

    public Node get(int position){
        //metodo para devolver el elemento de la posision deseada
        Node actual = this.head;
        int count = 1;
        while(actual != null){
            if(count == position){
                return actual;
            }
            count = count + 1;
            actual = actual.getNext();
        }
        return null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}
