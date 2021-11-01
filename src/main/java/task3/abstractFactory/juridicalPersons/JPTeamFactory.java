package task3.abstractFactory.juridicalPersons;

import task3.abstractFactory.CreditTeamFactory;
import task3.abstractFactory.HeadOfDepartment;
import task3.abstractFactory.Manager;
import task3.abstractFactory.Specialist;

public class JPTeamFactory implements CreditTeamFactory {
    @Override
    public Manager getManager() {
        return new JPManager();
    }

    @Override
    public Specialist getSpecialist() {
        return new JPSpecialist();
    }

    @Override
    public HeadOfDepartment getHeadOfDepartment() {
        return new JPHeadOfDepartment();
    }
}
