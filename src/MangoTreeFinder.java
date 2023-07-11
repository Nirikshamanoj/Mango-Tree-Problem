import java.util.Scanner;
public class MangoTreeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int plant = sc.nextInt();
        if(plant >0&&plant <=rows)
        {
            count++;
        }
        if(plant >(rows*columns-1)&&plant <=(rows*columns))
        {
            count++;
        }
        for(int iteration = 1; iteration<columns-1;iteration++)
        {
            if ((iteration * rows) + 1 == plant) {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

