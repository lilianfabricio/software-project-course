import java.util.ArrayList;

import br.ic.ufal.employees.Employee;
import br.ic.ufal.employees.Hourly;
import br.ic.ufal.employees.Salaried;


public class Main {
    public static void main(String[] args) {
    
        Employee employee = new Hourly("Bruno", "UFAL", 16, 5);

        System.out.println(employee.toString());
    }
}

