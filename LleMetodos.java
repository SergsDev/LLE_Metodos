import java.util.Scanner;

public class LleMetodos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Se crean las banderas, opciones y listas que se van a usar
    int opcion = 1, opcion_2 = 1;
    int contador = 1, cualNodo = 0;
    Lista lista1 = new Lista();
    lista1.primero = null;
    // Se crean los Nodos que se van a usar
    Nodo nodo = new Nodo(); //Creamos un Nodo
    Nodo recorredor = new Nodo(); //Este Nodo recorrera la lista pasando entre nodos
    Nodo aux = new Nodo(); //Creamos un Nodo auxiliar para guardar direcciones en caso de ser necesario


    // Creacion del primer Nodo de la lista
    System.out.println("Digite el valor del primer Nodo");
    nodo.info = sc.nextInt(); //Recibimos el valor del primer nodo
    nodo.siguiente = null; //Declaramos como nulo el apuntador del primer nodo
    lista1.primero = nodo; //asignamos al primer espacio de la lista el nodo
    recorredor = lista1.primero; //el nodo que recorrera la lista apunta a el primer nodo de la lista



    //Metodo para agregar Nodos a la lista
    while (opcion != 0) {
        nodo = new Nodo();
        System.out.println("Digite el valor del nodo");
        nodo.info = sc.nextInt(); //Recibimos el valor del Nodo
        nodo.siguiente = null; //Asignamos al apuntador del nuevo nodo a null
        recorredor.siguiente = nodo; //el nodo que recorrera la lista se mueve a el nuevo nodo
        recorredor = recorredor.siguiente; //el nodo que recorrera la lista ahora apunta al apuntador del nodo
        System.out.println("Desea crear otro Nodo? 1.Si 0.No");
        opcion = sc.nextInt(); //Si la respuesta es 1 repetira el ciclo, si es 0 lo detendra
    }
    lista1.imprimirLista();


    //Metodo para eliminar cualquier Nodo
    aux = recorredor = lista1.primero;
    System.out.println("Cual Nodo desea Eliminar?");
    cualNodo = sc.nextInt();

    while (recorredor.siguiente!=null) {
        ++contador;
        aux = recorredor;
        recorredor = recorredor.siguiente;
        if (cualNodo == 1) {
            lista1.primero = recorredor;
            break;
        } 
        else{
            if (cualNodo == contador) {
                aux.siguiente = recorredor.siguiente;     
            }
        }
    }
    lista1.imprimirLista();



    //Metodo para sumar el primer nodo con el ultimo nodo
    int suma = 0;
    recorredor = lista1.primero;
    suma+=lista1.primero.info;
    while (recorredor.siguiente!=null) {
        recorredor = recorredor.siguiente;
    }
    suma+=recorredor.info;
    System.out.println("La suma del primer y ultimo nodo es: " + suma);
    


    // Metodo para sumar el primer numero par y el ultimo impar
    int primerPar, UltimoPar;
    primerPar = UltimoPar = 0;
    int bandera_1 = 0, suma_1 = 0;
    recorredor = lista1.primero;
    while (recorredor!=null) {
        if (recorredor.info % 2 == 0 && bandera_1 == 0) {
            primerPar = recorredor.info;
            bandera_1 = 1;
        } else{
            if (recorredor.info % 2 == 0) {
                UltimoPar = recorredor.info;
            }
        }
        recorredor = recorredor.siguiente;
    }
    suma_1 = primerPar + UltimoPar;
    System.out.println("La suma es: " + suma);

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


