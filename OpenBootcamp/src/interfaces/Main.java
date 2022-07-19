package interfaces;

import java.util.List;

public class Main {

    static cocheCRUD cochecrud = new cocheCRUDImpl();

    public static void main(String[] args) {
        cochecrud.findAll();
        cochecrud.save();
        cochecrud.delete();
    }


}
