package interfaces;

import java.util.List;

public class cocheCRUDImpl implements cocheCRUD {


    @Override
    public void save() {
        System.out.println("Metodo que guarda");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo que busca");
    }

    @Override
    public void delete() {
        System.out.println("Metodo que elimina");
    }
}
