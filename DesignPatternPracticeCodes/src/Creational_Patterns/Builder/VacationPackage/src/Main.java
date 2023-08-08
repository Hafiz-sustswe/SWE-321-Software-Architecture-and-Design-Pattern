package Creational_Patterns.Builder.VacationPackage

public class Main {
    public static void main(String[] args) {
        VacationPackage vacationPackage=new VacationPackage.VacationPackageBuilder().buildActivities("nfsdj").build() ;

        System.out.println(vacationPackage.getActivities());
    }
}