class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }

    protected void finalize()
    {
        System.out.println("Inside Finalize method...");
    }

    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}

class FinalizeDemo
{
    public static void main(String Arg[])
    {
        Employee eobj = new Employee("Rushi",78000,23,"At Post Muktainagar");
        eobj.Display();
        Employee eobj2 = eobj;


        Employee eobj3 = new Employee("Rohit",88000,25,"At Post Jalgaon");

        System.out.println("Hash code of eobj is : "+eobj.hashCode());
        System.out.println("Hash code of eobj2 is : "+eobj2.hashCode());
        System.out.println("Hash code of eobj3 is : "+eobj3.hashCode());

        eobj = null;

        System.gc();
    }   
}