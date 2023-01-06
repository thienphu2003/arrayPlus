import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng thứ 1");
        int numberOne=sc.nextInt();
        int[] arrayInteger1=new int[numberOne];
        for( int i=0;i<numberOne;i++)
        {
            System.out.println("Hãy nhập phần tử thứ  "+(i+1));
            arrayInteger1[i]=sc.nextInt();
        }
        for( int i=0;i<arrayInteger1.length;i++)
        {
            System.out.println(arrayInteger1[i]);
        }
        System.out.println("Hãy nhập số phần tử của mảng thứ 2");
        int numberTwo =sc.nextInt();
        int[] arrayInteger2=new int[numberTwo];
        for( int i=0;i<numberTwo;i++)
        {
            System.out.println("Hãy nhập phần tử thứ  "+(i+1));
            arrayInteger2[i]=sc.nextInt();
        }
        for( int i=0;i<arrayInteger2.length;i++)
        {
            System.out.println(arrayInteger2[i]);
        }
        int[] arrayInteger3= new int[arrayInteger1.length+arrayInteger2.length];
        for(int i=0;i<arrayInteger1.length;i++)
        {
            arrayInteger3[i]=arrayInteger1[i];
        }
        int nextIndex=arrayInteger1.length;
        for(int j=0;j<arrayInteger2.length;j++)
        {
            arrayInteger3[nextIndex]=arrayInteger2[j];
            nextIndex++;
        }
        System.out.println("Mảng sau khi gộp lại là :");
        for(int i=0;i<arrayInteger3.length;i++)
        {
            System.out.println(arrayInteger3[i]);
        }
    }
}
