public class MyPower {

   public static double myPow(double x, double y)
   {
     /* int power = 0;

      if(y == 0 || y == 1)
      {
         return 1;
      }
      else
      {
         double result1 = myPow(x,y-1);

      }

      return power;*/


     if( y == 0)
     {
        return 1;
     }
     if( y < 0)
     {
        return 1;
     }
     else
     {
         double results = x * myPow(x,y-1);
         return results;
     }

   }

}
