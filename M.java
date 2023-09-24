
import java.util.*;

import java.lang.Thread;


class Multi extends Thread

{
       public void run()

       {

              System.out.println("The thread is running ");

       }
}







public class M 

{

       // implementing java threads

       public static void main(String[] args) 
       
       {
       
    Multi m1=new Multi();

    m1.start();

    
       }

}



