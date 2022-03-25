
package metodoslle;

import java.util.Scanner;


public class MetodosLLE {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Se crean las banderas, opciones y listas que se van a usar
        int opcion = 1;
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
            nodo.anterior = recorredor;
            nodo.siguiente = null; //Asignamos al apuntador del nuevo nodo a null
            recorredor.siguiente = nodo; //el nodo que recorrera la lista se mueve a el nuevo nodo
            recorredor = recorredor.siguiente; //el nodo que recorrera la lista ahora apunta al apuntador del nodo
            System.out.println("Desea crear otro Nodo? 1.Si 0.No");
            opcion = sc.nextInt(); //Si la respuesta es 1 repetira el ciclo, si es 0 lo detendra
        }
        
        lista1.imprimirLista();
        System.out.println("La cantidad de nodos es igual a:" + lista1.cantidadNodos());
        System.out.println("La cantidad de nodos con informacion par es igual a: " + lista1.cantidadPares() );
        System.out.println("La suma de la informacion del primer y ultimo nodo es igual a : " + lista1.SumaPrimeroUltimo() );
        
    }
    
    
        public static class Lista {

        Nodo primero;

        public void imprimirLista() {
            Nodo recorredor = new Nodo();
            recorredor = primero;
            while (recorredor.siguiente != null) {
                System.out.println("El Nodo es " + recorredor.info);
                recorredor = recorredor.siguiente;
            }
            System.out.println("El nodo es " + recorredor.info);
        }

        
        public int cantidadNodos(){
            int contador = 0;
            Nodo recorredor = new Nodo();
            recorredor = primero;
            while(recorredor!= null){
                ++contador;
                recorredor = recorredor.siguiente;
            }
            return contador;
        }
        
        public int cantidadPares(){
            int contador = 0;
            Nodo recorredor = new Nodo();
            recorredor = primero;
            while(recorredor!= null){
                if(recorredor.info % 2 == 0){
                    ++contador;
                }
                recorredor = recorredor.siguiente;
            }
            return contador;
        }
        
        public int sumaPrimos(){
            Nodo recorredor = new Nodo();
            int suma  = 0;
            recorredor = primero;
            while(recorredor != null){
                if(recorredor.esPrimo()){
                    suma += recorredor.info;
                }
                recorredor = recorredor.siguiente;
            }
            return suma;
        }
        
        private int Ultimo(){
            Nodo recorredor = new Nodo();
            recorredor = primero;
            while(recorredor.siguiente != null){
                recorredor = recorredor.siguiente;
            }
            return recorredor.info;
        }
        
        public int SumaPrimeroUltimo(){
            int contador = 0;
            contador = primero.info + Ultimo();
            return contador;
        }
        
        
    }

    private static class Nodo {

        static int info;
        Nodo siguiente;
        Nodo anterior;

        public Nodo() {
        }
        
        
        public static boolean esPrimo(){
            boolean contador = true;
            int i =1, contadorDivisible = 0;
            while(i <= info){
                if(info % i == 0){
                    ++contadorDivisible;
                }
                ++i;
            }
            if(contadorDivisible <=2){
        return contador;
            }
        else
        return false;
        }

    }
    }
    
