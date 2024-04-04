import java.util.*;
class MultiDimArray{
    public static void main(String[] args){
        int marks[][] = new int[10][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number and marks");
        for(int i = 0; i<marks.length;i++){
            System.out.println("Roll No:\t");
            marks[i][0] = sc.nextInt();
            System.out.println("Marks:\t");
            marks[i][1] = sc.nextInt();
        }
        for(int j=0;j<marks.length;j++)
        {
            System.out.println("Roll no: "+marks[j][0]+" Marks: "+marks[j][1]);
        }
    }
}