package task3.abstractFactory.physicalPersons;

import task3.abstractFactory.CreditTeamFactory;
import task3.abstractFactory.HeadOfDepartment;
import task3.abstractFactory.Manager;
import task3.abstractFactory.Specialist;

public class PPTeamFactory implements CreditTeamFactory {
    @Override
    public Manager getManager() {
        return new PPManager();
    }

    @Override
    public Specialist getSpecialist() {
        return new PPSpecialist();
    }

    @Override
    public HeadOfDepartment getHeadOfDepartment() {
        return new PPHeadOfDepartment();
    }
}
