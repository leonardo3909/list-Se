package co.edu.umanizales.tads.service;

import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {
        kids = new ListSE();
        kids.add(new Kid("123","Carlos",(byte)4,'M'));
        kids.add(new Kid("256","Mariana",(byte)3,'F'));
        kids.add(new Kid("789","Daniel",(byte)5,'M'));
        kids.add(new Kid("967","Estefania",(byte)6,'F'));
        kids.add(new Kid("987","Maria Jose",(byte)9,'F'));
        kids.add(new Kid("145","Jaider",(byte)3,'M'));
        kids.add(new Kid("197","Danna",(byte)2,'F'));
        kids.add(new Kid("287","Leonardo",(byte)7,'M'));

    }
/*
    public Node getKids()
    {
        return kids.getHead();
    }

    public void invert(){
        kids.invert();
    }

 */
}
