package task3.abstractFactory.physicalPersons;

import task3.abstractFactory.Manager;

public class PPManager implements Manager {
    @Override
    public void acceptDocuments() {
        System.out.println("Manager of physical person's department accepts documents");
    }
}
