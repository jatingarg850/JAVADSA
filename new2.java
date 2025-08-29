import java.util.Scanner;

class Employee{
    String Name;
    int Age;
    String Address;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter Age:");
        Age = sc.nextInt();
        System.out.println("Enter Address:");
    }
    void showdata(){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
    }
}
public class new2 {
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.getdata();
        emp.showdata();
    }
    
}