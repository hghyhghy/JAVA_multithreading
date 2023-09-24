
import java.util.*;

import java.lang.Thread;

import java.lang.Runnable;


public class M2  implements Runnable


{

   public void run()

   {

       System.out.println("Now the system is running");
   }


   public static void main(String[] args)
   
   
   {
          // CREATING  an object of the class of file name 


       Runnable r1= new M2();


       // creating an object of the class thread


       Thread t1= new Thread(r1,"My new Thread");

       t1.start();

       // printing the thread name by invoking getName()  method  



       String str=t1.getName();

       System.out.println(str);

   }

}
