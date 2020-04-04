import library.LibraryClass;


public class Main {

    public static void main(String [] args){

        LibraryClass library = new LibraryClass();

        System.out.println(library.calculateSalaryFromPath("src/main/resources/employees.json"));
        System.out.println(library.calculateSalaryFromPath("src/main/resources/employees.csv"));
    }
}
