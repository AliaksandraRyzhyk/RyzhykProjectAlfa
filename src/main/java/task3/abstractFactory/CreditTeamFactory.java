package task3.abstractFactory;

public interface CreditTeamFactory {
    Manager getManager();
    Specialist getSpecialist();
    HeadOfDepartment getHeadOfDepartment();
}
