package task3.abstractFactory.juridicalPersons;

import task3.abstractFactory.Manager;

public class JPManager implements Manager {
    @Override
    public void acceptDocuments() {
        System.out.println("Manager of juridical person's department accepts documents");
    }
}
