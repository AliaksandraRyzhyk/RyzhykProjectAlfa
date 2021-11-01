package task3.abstractFactory.juridicalPersons;

import task3.abstractFactory.Specialist;

public class JPSpecialist implements Specialist {
    @Override
    public void checkDocuments() {
        System.out.println("Specialist of juridical person's department checks documents");
    }
}