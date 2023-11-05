/*This program is still in development 
 * I want to  build a triangle shaped like this:
 *                          *
 *                          **
 *                          ***
 *                          ****
 *                          *****
 *                          ****
 *                          ***
 *                          **
 *                          *
 * If you can help me, you are welcome to contribute to this project.
*/
public class loops{

    public static void main(String args[]){

        for (int i = 1; i < 10; i++)
        {
               //if (i > 3)
              // {
               // i -= 1;
              // }
            
            for (int j = 1; j <= i; j++)
            {
              
              System.out.print("x");             
            }
            System.out.println();
        }
    }
}
