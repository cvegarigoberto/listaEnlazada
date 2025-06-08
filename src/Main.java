public class Main {
    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();
        System.out.println("Agregar numeros del 1 al 7 con el metodo de agregar en el primero");
        customLinkedList.insert(1);
        customLinkedList.insert(2);
        customLinkedList.insert(3);
        customLinkedList.insert(4);
        customLinkedList.insert(5);
        customLinkedList.insert(6);
        customLinkedList.insert(7);

        customLinkedList.printList();
        System.out.println(" ");
        System.out.println("Agregar el 0 en la posicion 3");
        customLinkedList.insert(0, 3);

        customLinkedList.printList();
        System.out.println(" ");
        System.out.println("borrar el primer elemento usando el metodo de borrar primero");
        customLinkedList.delete();
        customLinkedList.printList();

        System.out.println(" ");
        System.out.println("Busca la posicion del primer nodo con dato 5");
        System.out.print(customLinkedList.searchFirstInstance(65));

        System.out.println(" ");
        System.out.println("Tamaño de la lista");
        System.out.print(customLinkedList.size());

        System.out.println(" ");
        System.out.println("Regresa el nodo de la posision 2");
        System.out.println(customLinkedList.get(2));
    }

}