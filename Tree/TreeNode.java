public class TreeNode{
//miembros de acceso
    TreeNode nodoIzquierdo;
    int datos;
    TreeNode nodoDerecho;
    TreeNode nodoCentral;

//iniciar dato y hacer de este nodo un nodo hoja
    public TreeNode(int datosNodo) {
        datos = datosNodo;
        nodoIzquierdo = nodoDerecho = nodoCentral = null; //el nodo no tiene hijos
    }

//buscar punto de insercion  e insertar nodo nuevo
    public synchronized void insertar(int valorInsertar) {
//insertar en subarbol izquierdo
        if (valorInsertar < datos) {

            //inserta nuevo nodoarbol
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new TreeNode(valorInsertar);
            } else //continua recorriendo subarbol izquierdo
            {
                nodoIzquierdo.insertar(valorInsertar);
            }
        } //insertar nodo derecho
        else if (valorInsertar > datos) {

            //insertar nuevo nodoarbol
            if (nodoDerecho == null) {
                nodoDerecho = new TreeNode(valorInsertar);
            } else //continua recorriendo subarbol derecho
            {
                nodoDerecho.insertar(valorInsertar);
            }
        } else {
            if (nodoCentral == null) {
                nodoCentral = new TreeNode(valorInsertar);
            } else //continua recorriendo subarbol derecho
            {
                nodoCentral.insertar(valorInsertar);
            }
        }
    } //fin del metodo insertar

} //fin clase nodoarbol
