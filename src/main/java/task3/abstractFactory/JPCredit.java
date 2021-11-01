package task3.abstractFactory;

import task3.abstractFactory.juridicalPersons.JPTeamFactory;

public class JPCredit {
    public static void main(String[] args) {
        CreditTeamFactory creditTeamFactory = new JPTeamFactory();
        Manager manager = creditTeamFactory.getManager();
        Specialist specialist = creditTeamFactory.getSpecialist();
        HeadOfDepartment headOfDepartment = creditTeamFactory.getHeadOfDepartment();

        System.out.println("Flow of juridical persons credit:");
        manager.acceptDocuments();
        specialist.checkDocuments();
        headOfDepartment.approveDocuments();
    }
}
