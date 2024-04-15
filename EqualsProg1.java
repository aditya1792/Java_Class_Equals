/* Proper way to write a class in Java. Whenever anyone asks a person to write a java class, the person might just wite a java class like "class ABC { }" for example; but one has to focus on many more parameters other than this so that the class qualifies for industry. Let us make a class employee to get into the details.*/


class Employee {
    private String ename; //This crucial details like ename and eid must be kept private, so that misuse can be avoided.
    private int eid;

    /*A default constructor must be declared, because in java some classes use parameterised 
      constructors themselves, so in that case default constructor must be present*/
    
    public Employee() 
    {
    
    }

    /*disambiguate instance variables from local variables with the same name, to 				
      invoke one constructor from another constructor in the same class, or to 
      pass the current object as a parameter to other methods.*/

    public Employee(String ename, int eid) 
    {
        this.ename = ename;                  
        this.eid = eid;
    }

   /*This getter and setter methods are used so that private variables of 					
     classes can be modified authentically*/ 


    public void setEname(String n) 
    {
        ename = n;
    }

    public String getEname() 
    {
        return ename;
    }

    public void setEid(int id) {
        eid = id;
    }

    public int getEid() {
        return eid;
    }

 /* Since objects are made by users and vary accordingly, so we have to 
    compare whether the current object is equal to another object. It is
    inherited from 'Object' class.*/
    
    public boolean equals(Object o) 
    {

	/* Now checking whether given object is an object in our class or not using 						  instanceof keyword.*/

        if (o instanceof Employee) 
	{
            Employee obj = (Employee) o;
            return eid == obj.eid;
        }
        return false;
    }


    /*Since here we are comparing two employyes, java demands that if both are 
      equal, the hash code, too, must be same. So here let's return Employye ID as
      hashcode*/
    
    public int hashCode()
    {
        return eid;
    }

   /* toString() method must be called to convert objects into strings. Even if we don't call it, it is called automatically.Because of these automatic calls,it's a good practice to override the toString method in your classes to  
	provide a meaningful and readable string representation*/

    
    public String toString() 
    {
        return ename + " " + eid;
    }
}

public class EqualsProg1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("ABC", 101);
        Employee e2 = new Employee("ABC", 101);

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("\n s1 = " + s1.toString());
        System.out.println("\n e1 = " + e1.toString());

        System.out.println("\n s1.hashCode() = " + s1.hashCode());
        System.out.println("\n s2.hashCode() = " + s2.hashCode());

        System.out.println("\n e1.hashCode() = " + e1.hashCode());
        System.out.println("\n e2.hashCode() = " + e2.hashCode());

        if (e1.equals(e2)) {
            System.out.println("\n EQUAL ");
        } else {
            System.out.println("\n NOT EQUAL ");
        }
    }
}
/* In conclusion we saw two classes here, the first one being an ibuilt Java class, "String", we could dirctly use equals method to check whether the content inside is same. Remember the equals method is needed because if we check the content inside the objects of class with "==" operator, then even if our content is same then to we will get not equal or false because it checks the reference. It has been observed that equals method works easily and quite effectively with classes inbuilt in Java like the string class. But in case of classes built by users, the equals method doesn't work directly, it has to be overridden. There are certain cnditions for equality approval like even the hashcodes must be same. So everything along with proper template for class has been explained in the given code above.*/

