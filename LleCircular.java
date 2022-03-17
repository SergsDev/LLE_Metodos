import java.util.Scanner;

public class LleCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bandera = 0, bandera1 = 0;
        int opcion = 1, opcion1= 1;
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        lista1.primero = null;
        lista2.primero = null;

        // Creacion de los nodos
        Nodo recorredor = new Nodo();
        Nodo recorredor2 = new Nodo();
        Nodo nodo = new Nodo();
        // Creacion de nodos y de la primera lista
        while (opcion!= 0) {
            if (bandera1 == 0) {
                nodo = new Nodo();
                System.out.println("Digite el valor del primer Nodo");
                nodo.info = sc.nextInt();
                bandera = 1; //Se cierra la bandera y el ciclo
                lista1.primero = nodo; //Se define nodo como el primero de la lista
                recorredor = lista1.primero; //recorredor apunta al primer nodo de la lista
                nodo.siguiente = lista1.primero; //el apuntador del primer nodo apunta al primer nodo de la lista, que es el mismo
            } else{
                nodo = new Nodo();
                System.out.println("Digite el valor del Nodo");
                nodo.info = sc.nextInt(); //guarda el valor del nodo
                nodo.siguiente = lista1.primero; //el nodo apunta al primer nodo de la lista
                recorredor.siguiente = nodo; //el recorredor apunta al nodo
                recorredor = recorredor.siguiente; //el recorredor apunta al siguiente nodo del recorredor
            }
            System.out.println("Desea crear otro Nodo? 1.Si 0.No");
            opcion = sc.nextInt();
        }
        lista1.imprimirLista();

        //Creacion de la segunda lista
        while (opcion1 != 0) {
            if (bandera1 == 0) {
                nodo = new Nodo();
                System.out.println("Digite el valor del primer Nodo");
                nodo.info = sc.nextInt();
                bandera1 =1;
                lista2.primero = nodo;
                recorredor2 = lista2.primero;
                nodo.siguiente = lista2.primero;
            } else{
                nodo = new Nodo();
                System.out.println("Digite el valor del nodo");
                nodo.info = sc.nextInt();
                nodo.siguiente = lista2.primero;
                recorredor2.siguiente = nodo;
                recorredor2 = recorredor2.siguiente;
            }
            System.out.println("Desea crear otro Nodo? 1.Si 0.No");
            opcion1 = sc.nextInt();
        }
        lista2.imprimirLista();




        // Concatenacion de las listas

        recorredor = lista1.primero;
        while (recorredor != lista1.primero) {
            recorredor = recorredor.siguiente;
        }
        recorredor.siguiente = lista2.primero;
        recorredor = recorredor.siguiente;
        while (recorredor.siguiente != lista2.primero) {
            recorredor = recorredor.siguiente;
        }
        lista1.imprimirLista();
        lista2.imprimirLista();
    }

    public static class Lista{
        Nodo primero;

        public void imprimirLista(){
            Nodo recorredor = new Nodo();
            recorredor = primero;
            while (recorredor.siguiente!=null) {
                System.out.println("El Nodo es " + recorredor.info);
                recorredor = recorredor.siguiente;
            }
            System.out.println("El nodo es " + recorredor.info);
        }
    }

    private static class Nodo{
        int info;
        Nodo siguiente;
        public Nodo(){
        }
    }
}
