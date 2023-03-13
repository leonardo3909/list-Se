package co.edu.umanizales.tads.service;

import co.edu.umanizales.tads.controller.dto.ResponseDTO;
import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {
        kids = new ListSE();
        kids.add(new Kid("123","Carlos","boy",(byte)4));
        kids.add(new Kid("256","Mariana","girl",(byte)3));
        kids.add(new Kid("789","Daniel","boy",(byte)5));

        kids.addToStart(new Kid("968","Estefania","girl",(byte)6));
        kids.addToStart(new Kid("969","Leonardo","boy",(byte)9));
        kids.addToStart(new Kid("989","Maria Jose ","girl",(byte)8));
        //kids.deleteKids("123"); => De forma manual eliminar por identificador
        //kids.addByPos(new Kid("456", "Esteban", (byte)7, 2); => De forma manual añadir por identificador
        //kids.addToStart(new Kid("967","Estefania",(byte)6));
    }

    public Node getKids()
    {
        return kids.getHead();
    }

    //Añadir niños
    //public void addKids(Kid kid){ this.kids.add(kid); }

    public String getKidIdentification(String identification){
        while(kids.getHead().getData().getIdentification() != identification){
            kids.getHead().getNext();

            if(kids.getHead().equals(identification)){
                return identification;
            }
        }
        return null;
    }
}
