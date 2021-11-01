package task3.abstractFactory.physicalPersons;

import task3.abstractFactory.HeadOfDepartment;

public class PPHeadOfDepartment implements HeadOfDepartment {
    @Override
    public void approveDocuments() {
        System.out.println("Head of physical person's department approves documents");
    }
}
