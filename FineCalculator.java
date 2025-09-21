// program to calculate the fine for overdue library books
/* 
  *Mary wanjiru
  *so8-8423-2024
  *Program to calculate the fine for overdur library books
*/ 


import java.util.Scanner;

public class FineCalculator {
    public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter Book ID: ");
String bookID= input.nextLine();
System.out.print("Enter Due Date as day number: ");
int dueDate = input.nextInt();
System.out.print("Enter Return Date as day number: ");
int returnDate = input.nextInt();
int daysOverdue = returnDate - dueDate;
int fineRate = 0;
int fineAmount =0;
if(daysOverdue>0){
    if(daysOverdue<=7){
        fineRate = 20;
    } else if (daysOverdue<=14) {
        fineRate = 50;
    } else {
        fineRate = 100;
    }
    fineAmount = daysOverdue * fineRate;
} else {
    daysOverdue = 0;
}

System.out.println("Book ID: " + bookID);
System.out.println("Due Date: " + dueDate);
System.out.println("Return Date: " + returnDate);
System.out.println("Days Overdue: " + daysOverdue);
System.out.println("Fine Rate (per day): Ksh. " + fineRate);
System.out.println("Total Fine Amount: Ksh. " + fineAmount);
}
}
