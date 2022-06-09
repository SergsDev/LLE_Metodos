class Tree {

    private TreeNode raiz;

//contruir un arbol vacio
    public Tree() {
        raiz = null;
    }

//insertar un nuevo nodo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int valorInsertar) {
        if (raiz == null) {
            raiz = new TreeNode(valorInsertar); //crea nodo raiz
        } else {
            raiz.insertar(valorInsertar); // llama al metodo insertar
        }
    }

//--------------- EMPESAR EL RECORRIDO EN PREORDEN-----------------------
    public synchronized void recorridoPreorden() {
        ayudantePreorden(raiz);
    }
//metodo recursivo para recorrido en preorden

    private void ayudantePreorden(TreeNode nodo) {
        if (nodo == null) {
            return;
        }

        System.out.print(nodo.datos + " "); // mostrar datos del nodo
        ayudantePreorden(nodo.nodoIzquierdo); //recorre subarbol izquierdo
        ayudantePreorden(nodo.nodoCentral); //recorre subarbol central
        ayudantePreorden(nodo.nodoDerecho); //recorre subarbol derecho
    }
    //--------------EMPEZAR RECORRIDO INORDEN-----------------------------------

    public synchronized void recorridoInorden() {
        ayudanteInorden(raiz);
    }

// metodo recursivo para recorrido inorden
    private void ayudanteInorden(TreeNode nodo) {
        if (nodo == null) {
            return;
        }

        ayudanteInorden(nodo.nodoIzquierdo);
        System.out.print(nodo.datos + " ");
        ayudanteInorden(nodo.nodoDerecho);
    }

//-----------------------------EMPEZAR RECORRIDO POSORDEN---------------------------------
    public synchronized void recorridoPosorden() {
        ayudantePosorden(raiz);
    }

//metodo recursivo para recorrido posorden
    private void ayudantePosorden(TreeNode nodo) {
        if (nodo == null) {
            return;
        }

        ayudantePosorden(nodo.nodoIzquierdo);
        ayudantePosorden(nodo.nodoCentral);
        ayudantePosorden(nodo.nodoDerecho);
        System.out.print(nodo.datos + " ");
    }

}//fin clase arbol




/////////////////////////////////////////////////////////////////////////
