
public class nestedloop {
    public static void main(String[] args) {
        
        int example[][] = {
            {3, 4, 4, 5},
            {9, 6, 7, 23},
            {89, 2, 65, 65}
        };

        int len = example.length;
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print(example[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
