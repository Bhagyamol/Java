import java.util.Scanner;
public class StudMarks
{
    public static void main(String[] args) 
    {
        int n, total= 0,p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
             total= total + marks[i];
        }
        p=total/n;
        System.out.println("Sum:"+total);
        System.out.println("percentage:"+p);
     }
}