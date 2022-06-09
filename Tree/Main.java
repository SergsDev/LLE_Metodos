public class Main {

    public static void main(String[] args) {
    Tree arbol = new Tree();
    int valor;

    System.out.println( "Insertando los siguientes valores: ");

    //insertando 10 numeros aleatorios del 0 al 99 en el arbol
    for (int i = 1; i<=10 ; i++)
    {
        valor = (int) (Math.random() * 100);
        System.out.print(valor + " ");
        arbol.insertarNodo(valor);
    }

    System.out.println("\n\nRecorrido preorden");
    arbol.recorridoPreorden();

    System.out.println("\n\nRecorrido inorden");
    arbol.recorridoInorden();

    System.out.println("\n\nRecorrido posorden");
    arbol.recorridoPosorden();
}
}
    

