
import java.util.*;

import java.lang.Thread;

import java.lang.Runnable;


// creating a new class 

// using Runable 


class Multi1  implements  Runnable

{
   
  public void run()

  {

       System.out.println("Thread is running bro ");
  }

}



public class M1 

{

       public static void main(String[] args) 
       
       {
       
              Multi1 m= new Multi1();

    // By using constructor Thread

    Thread t1= new Thread(m);

    t1.start();


       }

}
