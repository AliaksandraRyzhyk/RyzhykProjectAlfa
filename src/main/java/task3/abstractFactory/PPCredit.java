package task3.abstractFactory;

import task3.abstractFactory.physicalPersons.PPTeamFactory;

public class PPCredit {
    public static void main(String[] args) {
        CreditTeamFactory creditTeamFactory = new PPTeamFactory();
        Manager manager = creditTeamFactory.getManager();
        Specialist specialist = creditTeamFactory.getSpecialist();
        HeadOfDepartment headOfDepartment = creditTeamFactory.getHeadOfDepartment();

        System.out.println("Flow of physical persons credit:");
        manager.acceptDocuments();
        specialist.checkDocuments();
        headOfDepartment.approveDocuments();
    }
}
