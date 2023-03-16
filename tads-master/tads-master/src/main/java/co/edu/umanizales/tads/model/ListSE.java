package co.edu.umanizales.tads.model;

import ch.qos.logback.core.joran.spi.ElementSelector;
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

    public void invert(){
        if(this.head !=null){
            ListSE listCp = new ListSE();
            Node temp = this.head;
            while(temp != null){
                listCp.addToStart(temp.getData());
                temp = temp.getNext();
            }
            this.head = listCp.getHead();
        }
    }

    public void orderBoysToStart(){
        if(this.head !=null){
            ListSE listCp = new ListSE();
            Node temp = this.head;
            while(temp != null){
                if(temp.getData().getGender()=='M')
                {
                    listCp.addToStart(temp.getData());
                }
                else{
                    listCp.add(temp.getData());
                }

                temp = temp.getNext();
            }
            this.head = listCp.getHead();
        }
    }

    public ListSE insertByKids(){
        ListSE boys = new ListSE();
        Node temp = head;
        if (temp.getData().equals("boy")){
            boys.add(temp.getData());
        }
        else {
            while (temp.getNext() != null){
                if (temp.getNext().getData().equals("boy")){
                    boys.add(temp.getData());
                }
                temp = temp.getNext();
            }
        }
        return boys;
    }

    public ListSE insert(){
        ListSE girls = new ListSE();
        Node temp2 = head;
        if (temp2.getData().equals("girl")){
            girls.add(temp2.getData());
        }
        else {
            while (temp2.getNext() != null){
                if (temp2.getNext().getData().equals("girl")){
                    girls.add(temp2.getData());
                }
                temp2 = temp2.getNext();
            }
        }
        return girls;
    }

    public ListSE insertTotal(){
        if(head !=null){
            ListSE listCp = new ListSE();
            Node temp3 = this.head;
            while(temp3 != null){
                listCp.addToStart(temp3.getData());
                temp3 = temp3.getNext();
            }
            this.head = listCp.getHead();
        }
        return insert().insertByKids();
    }



}
