package task3.abstractFactory.juridicalPersons;

import task3.abstractFactory.HeadOfDepartment;

public class JPHeadOfDepartment implements HeadOfDepartment {
    @Override
    public void approveDocuments() {
        System.out.println("Head of juridical person's department approves documents");
    }
}