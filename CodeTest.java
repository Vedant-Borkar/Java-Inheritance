public class CodeTest
{
    public static void main(String args[])
    {
        Employee employee=new Employee();
        Lawyer lawyer=new Lawyer("john");
        Secretary secretary=new Secretary();
        Mark mark=new Mark();
        LegalSec legalsec=new LegalSec();

        System.out.println(employee.getHours());
        System.out.println(lawyer.getSalary());
        System.out.println(mark.getSalary());
        System.out.println(legalsec.getVacationDays());
        System.out.println(secretary.getHours());

        //Methods not included in the superclass can also be called here
        //Methods built in are equals, toString....etc.
        Lawyer lawyer1=new Lawyer("john");
        Lawyer lawyer2=new Lawyer("john");
        Lawyer lawyer3=lawyer2;
        //Comparing reference of objects
        System.out.println(lawyer1==lawyer2);//false
        System.out.println(lawyer3==lawyer2);//true

        //Comparing ACTUAL CONTENTS of objects
        System.out.println(lawyer1.equals(lawyer2));

        //Polymorphism-->is the ability of the same code to be used for several different types of objects and for the code
        //to behave differently on the type of object used
        Employee[] employees=new Employee[10];
        employees[0]= lawyer;
        employees[1]= secretary;
        employees[2]= mark;
        employees[3]= legalsec;

        /**NOW MAGICALLY U DONT HAVE TO WRITE SAME NAME OF CLASS AS CONSTRUCTOR U CAN USE NAME OF THE SUBCLASSES***/

        Employee employee1=new Lawyer("john");
        Employee employee2=new Secretary();
        Employee employee3=new Mark();
        Employee employee4=new LegalSec();

        //Now that employee1 will behave like a lawyer object
        System.out.println(employee1.getSalary());//it will not return the employee salary but the lawyer salary

        //employee3.InsideMarket();
        /**IT DOES NOT TAKE THE METHOD EXCLUSIVE TO THAT OBJECT NOT IN EMPLOYEE
         Hence we need to cast empolyee3 as a type Marketer **/

        System.out.println(((Mark)employee3).InsideMarket());


    }
}
