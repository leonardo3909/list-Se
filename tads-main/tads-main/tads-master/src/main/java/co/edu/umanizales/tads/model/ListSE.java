package co.edu.umanizales.tads.model;

import lombok.Data;

@Data
public class ListSE {
    private Node head;
    /*
    Algoritmo de adicionar al final
    Entrada
        un niño
    si hay datos
    si
        llamo a un ayudante y le digo que se posicione en la cabeza
        mientras en el brazo exista algo
            pasese al siguiente
        va estar ubicado en el ùltimo

        meto al niño en un costal (nuevo costal)
        y le digo al ultimo que tome el nuevo costal
    no
        metemos el niño en el costal y ese costal es la cabeza
     */
    public void add(Kid kid){
        if(head != null){
            Node temp = head;
            while(temp.getNext() !=null)
            {
                temp = temp.getNext();
            }
            /// Parado en el último
            Node newNode = new Node(kid);
            temp.setNext(newNode);
        }
        else {
            head = new Node(kid);
        }
    }

    /* Adicionar al inicio
    si hay datos
    si
        meto al niño en un costal (nuevocostal)
        le digo a nuevo costal que tome con su brazo a la cabeza
        cabeza es igual a nuevo costal
    no
        meto el niño en un costal y lo asigno a la cabez
     */
    public void addToStart(Kid kid){
        if(head !=null)
        {
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        }
        else {
            head = new Node(kid);
        }
    }

    //Eliminar por posición
    public void deleteKids(String identification){
        Node temp = head;
        Node prev = null;
        while(temp.getNext()!= null && !temp.getData().equals(identification)){
            prev = temp;
            head = temp.getNext();
        }
        if(temp != null){
            if(prev == null){
                head = temp.getNext();
            } else{
                prev.setNext(head);
            }
        }
    }

    //Adición por posición
    /*public void addByPos(int position, Kid kid)
    {
        if(position == 1)
        {
            addToStart(kid);
        }
        else
        {
            int posTemp=1;
            Node temp = head;
            {
                temp = temp.getNext();
                posTemp++;
            }
            Node newNode = new Node(kid);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }
    */
}
