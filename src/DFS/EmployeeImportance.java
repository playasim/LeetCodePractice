package DFS;

import java.util.List;

public class EmployeeImportance {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
    public static int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        for (Employee employee: employees) {
            if (employee.id == id) {
                for (Integer subid : employee.subordinates) {

                    importance += getImportance(employees, subid);
                    break;


                }
            }

        }


        return importance;
    }




}
