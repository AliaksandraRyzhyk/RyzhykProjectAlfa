package task3.abstractFactory.physicalPersons;

import task3.abstractFactory.Specialist;

public class PPSpecialist implements Specialist {
    @Override
    public void checkDocuments() {
        System.out.println("Specialist of physical person's department checks documents");
    }
}

