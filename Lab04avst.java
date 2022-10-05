// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double monthlyRate = 1319.2295689273974;


        double numMonths = numYears * 12;
        double numerator = monthlyRate * Math.pow(1 + monthlyRate,numMonths);

        System.out.println(numerator);
        System.out.println(monthlyRate);

        double denominator = Math.pow(1 + annualRate,numMonths - 1);




        double temp = 3.141529;
        System.out.println(temp);
        temp *=100;
        System.out.println(temp);
        temp = Math.round(temp);
        System.out.println(temp);
        temp /= 100;
        System.out.println(temp);

        System.out.println("Principle: " + principal);
        System.out.println("Annual Rate: " + annualRate);
        System.out.println("Number of Years: " + numYears);
        System.out.println("Monthly Payment: " + monthlyRate);








    }
}

