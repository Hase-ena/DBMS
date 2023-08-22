class Arithmetic  extends Exception
{  
    public Arithmetic (String str)  
    {  
 super(str);  
    }  
}  

public class TestException 
{  
static void validate (int divisor) throws Arithmetic{    
       if(divisor == 0){  
 throw new Arithmetic("zero division Error");    
    }  
       else { 
	int ans=a/b;  
        System.out.println("Answer is:");   
        }   
     }    


 public static void main(String args[])  
    {  
a = System.out.println("First number");
b = System.out.println("Second` number");
        try  
        { 

            validate(b);  
        }  
        catch (TestException ex)  
        {  
            System.out.println("Caught the exception");

 System.out.println("Exception occured: ");  
        }  
  
        System.out.println("try again");    
    }  
}    