package java_e_bebek_maas_hesaplayici;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kaç çalışan var?");
        Scanner input = new Scanner(System.in);
        int numberOfEmployees = input.nextInt();

        Employee[] employeesArray = new Employee[numberOfEmployees];
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        //set
        for(int i=0;i<numberOfEmployees;i++){
            Employee employee = new Employee();
            System.out.println("Çalışanın adını ve soyadını giriniz : ");
            employee.setName(input.next());
            System.out.println("Çalışanın maaşını giriniz : ");
            employee.setSalary(input.nextDouble());
            System.out.println("Çalışanın giriş yılını giriniz : ");
            employee.setHireYear(input.nextInt());
            System.out.println("Çalışanın haftalık saatini giriniz : ");
            employee.setWorkHours(input.nextDouble());
            employeesArray[i] = employee;
            employeeArrayList.add(employee);
            System.out.println(employee.toString());
        }

        for(Employee employee: employeeArrayList){
            employee.toMyString();
        }
    }
}
