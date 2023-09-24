
import java.util.*;

import javax.sound.sampled.SourceDataLine;

import java.lang.Thread;

class Test extends Thread


{

  public void run()

  {

       for(int i=0;i<5;i++)

       {
              // this thread will slep for 500 milliseconds 

              try 
              {
               Thread.sleep(500);      
              } 
              catch (InterruptedException e) {System.out.println(e);}
              
              System.out.println(i);
       }
  }



} 


public class M3 

{

       
       public static void main(String[] args)
       
       {
       
              Test  m1= new Test();

           Test  m2= new Test();

           m1.start();;

           m2.start();

       }
}
