import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int temp;
        int count;

        System.out.print("Enter the starting range: ");
        int startingRange = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int endingRange = sc.nextInt();

        for(int i = startingRange; i <= endingRange; i++){
            int c, f=1;
            temp = i;
            count=0;
            for(int j=2;j<=temp;j++){
                c=0;
                while((temp%j)==0){
                    temp /= j;
                    c++;
                }
                if(c==1){
                    f *= j;
                    count++;
                }
            }
            if(f==i && count==3)
                System.out.print(i + "\t");

        }
    }
}