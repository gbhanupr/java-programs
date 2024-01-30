import java.util.Scanner;
class IrregularArray
{
public static void main(String[] args)
 {
 System.out.print("\nEnter the number of rows: ");
  Scanner reader = new Scanner(System.in);
  int r = reader.nextInt();
 int arr[][] = new int[r][];
int col [] = new int[r];
 for (int i = 0; i < arr.length; i++)
 {  
     System.out.print("\nEnter the number of elements in row "+ (i+1));
     col[i] = reader.nextInt();
     arr[i] = new int[col[i]];
 }
 int count = 0;
 for (int i = 0; i < arr.length; i++)
 for (int j = 0; j < arr[i].length; j++)
 arr[i][j] = count++;
 System.out.println("Contents of 2D Jagged Array");
 for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++)
 System.out.print(arr[i][j] + " ");
 System.out.println();
 }
 }
} 