import java.util.Scanner;
public class Main1{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        // Key in the units
        String Unit1, Unit2, Unit3, Unit4, Unit5, Unit6, Unit7;
        System.out.println("Enter the names of the 7 Units:");
        System.out.print("Unit 1: "); Unit1 = input.nextLine();
        System.out.print("Unit 2: "); Unit2 = input.nextLine();
        System.out.print("Unit 3: "); Unit3 = input.nextLine();
        System.out.print("Unit 4: "); Unit4 = input.nextLine();
        System.out.print("Unit 5: "); Unit5 = input.nextLine();
        System.out.print("Unit 6: "); Unit6 = input.nextLine();
        System.out.print("Unit 7: "); Unit7 = input.nextLine();


        // Student details : Student 1
        System.out.println("\n--- Enter Details for Student 1 ---");
        System.out.print("Reg No: ");
        String RegNo1 = input.nextLine();
        System.out.print("Full Name: ");
        String Student1 = input.nextLine();

        // Key in marks for the different units
        System.out.println("Enter marks for : " + Student1 + ":" );

        System.out.print("Unit 1 : " + Unit1 + ":");
        int student1mark1 = input.nextInt();
        System.out.print("Unit 2 : " + Unit2 + ":");
        int student1mark2 = input.nextInt();
        System.out.print("Unit 3 : " + Unit3 + ":");
        int student1mark3 = input.nextInt();
        System.out.print("Unit 4 : " + Unit4 + ":");
        int student1mark4 = input.nextInt();
        System.out.print("Unit 5 : " + Unit5 + ":");
        int student1mark5 = input.nextInt();
        System.out.print("Unit 6 : " + Unit6 + ":");
        int student1mark6 = input.nextInt();
        System.out.print("Unit 7 : " + Unit7 + ":");
        int student1mark7 = input.nextInt();

        int TotalMarks1 = student1mark1 + student1mark2 + student1mark3 + student1mark4 + student1mark5 +  student1mark6 + student1mark7;
        System.out.println(" Total marks : " + TotalMarks1);
        double Average1 = TotalMarks1 / 7.0;
        System.out.println("Average marks : " + Average1);
        input.nextLine(); // CONSUMES THE NEWLINE LEFT BY nextInt()


        // Student details : Student 2
        System.out.println("\n--- Enter Details for Student 2 ---");
        System.out.print("Reg No: ");
        String RegNo2 = input.nextLine();
        System.out.print("Full Name: ");
        String Student2 = input.nextLine();

// Marks for Student 2
        System.out.println("Enter marks for : " + Student2 + ":" );

        System.out.print("Unit 1 : " + Unit1 + ":");
        int student2mark1 = input.nextInt();
        System.out.print("Unit 2 : " + Unit2 + ":");
        int student2mark2 = input.nextInt();
        System.out.print("Unit 3 : " + Unit3 + ":");
        int student2mark3 = input.nextInt();
        System.out.print("Unit 4 : " + Unit4 + ":");
        int student2mark4 = input.nextInt();
        System.out.print("Unit 5 : " + Unit5 + ":");
        int student2mark5 = input.nextInt();
        System.out.print("Unit 6 : " + Unit6 + ":");
        int student2mark6 = input.nextInt();
        System.out.print("Unit 7 : " + Unit7 + ":");
        int student2mark7 = input.nextInt();



        int TotalMarks2 = student2mark1 + student2mark2 + student2mark3 + student2mark4 + student2mark5 + student2mark6 + student2mark7;
        System.out.println(" Total marks : " + TotalMarks2);
        double Average2 = TotalMarks2 / 7.0;
        System.out.println("Average marks : " + Average2);
        input.nextLine(); // CONSUMES THE NEWLINE LEFT BY nextInt()


// Student details : Student 3

        System.out.println("\n--- Enter Details for Student 3 ---");
        System.out.print("Reg No: ");
        String RegNo3 = input.nextLine();
        System.out.print("Full Name: ");
        String Student3 = input.nextLine();

// Marks for Student 3
        System.out.println("Enter marks for : " + Student3 + ":" );

        System.out.print("Unit 1 : " + Unit1 + ":");
        int student3mark1 = input.nextInt();
        System.out.print("Unit 2 : " + Unit2 + ":");
        int student3mark2 = input.nextInt();
        System.out.print("Unit 3 : " + Unit3 + ":");
        int student3mark3 = input.nextInt();
        System.out.print("Unit 4 : " + Unit4 + ":");
        int student3mark4 = input.nextInt();
        System.out.print("Unit 5 : " + Unit5 + ":");
        int student3mark5 = input.nextInt();
        System.out.print("Unit 6 : " + Unit6 + ":");
        int student3mark6 = input.nextInt();
        System.out.print("Unit 7 : " + Unit7 + ":");
        int student3mark7 = input.nextInt();



        int TotalMarks3 = student3mark1 + student3mark2 + student3mark3 + student3mark4 + student3mark5 + student3mark6 + student3mark7;
        System.out.println(" Total marks : " + TotalMarks3);
        double Average3 = TotalMarks3 / 7.0;
        System.out.println("Average marks : " + Average3);
        input.nextLine(); // CONSUMES THE NEWLINE LEFT BY nextInt()



        // Student details : student 4

        System.out.println("\n--- Enter Details for Student 4 ---");
        System.out.print("Reg No: ");
        String RegNo4 = input.nextLine();
        System.out.print("Full Name: ");
        String Student4 = input.nextLine();

// Marks for Student 4
        System.out.println("Enter marks for : " + Student4 + ":" );

        System.out.print("Unit 1 : " + Unit1 + ":");
        int student4mark1 = input.nextInt();
        System.out.print("Unit 2 : " + Unit2 + ":");
        int student4mark2 = input.nextInt();
        System.out.print("Unit 3 : " + Unit3 + ":");
        int student4mark3 = input.nextInt();
        System.out.print("Unit 4 : " + Unit4 + ":");
        int student4mark4 = input.nextInt();
        System.out.print("Unit 5 : " + Unit5 + ":");
        int student4mark5 = input.nextInt();
        System.out.print("Unit 6 : " + Unit6 + ":");
        int student4mark6 = input.nextInt();
        System.out.print("Unit 7 : " + Unit7 + ":");
        int student4mark7 = input.nextInt();



        int TotalMarks4 = student4mark1 + student4mark2 + student4mark3 + student4mark4 + student4mark5 + student4mark6 + student4mark7;
        System.out.println(" Total marks : " + TotalMarks4);
        double Average4 = TotalMarks4 / 7.0;
        System.out.println("Average marks : " + Average4);
        input.nextLine(); // CONSUMES THE NEWLINE LEFT BY nextInt()



        // Student details : student 5
        System.out.println("\n--- Enter Details for Student 5 ---");
        System.out.print("Reg No: ");
        String RegNo5 = input.nextLine();
        System.out.print("Full Name: ");
        String Student5 = input.nextLine();

// Marks for Student 5
        System.out.println("Enter marks for : " + Student5 + ":" );

        System.out.print("Unit 1 : " + Unit1 + ":");
        int student5mark1 = input.nextInt();
        System.out.print("Unit 2 : " + Unit2 + ":");
        mark2 = input.nextInt();
        System.out.print("Unit 3 : " + Unit3 + ":");
        mark3 = input.nextInt();
        System.out.print("Unit 4 : " + Unit4 + ":");
        mark4 = input.nextInt();
        System.out.print("Unit 5 : " + Unit5 + ":");
        mark5 = input.nextInt();
        System.out.print("Unit 6 : " + Unit6 + ":");
        student4mark6 = input.nextInt();
        System.out.print("Unit 7 : " + Unit7 + ":");
        mark7 = input.nextInt();



        int TotalMarks5 = mark1 + mark2 + mark3 + mark4 + mark5 + student5mark6 + mark7;
        System.out.println(" Total marks : " + TotalMarks5);
        double Average5 = TotalMarks5 / 7.0;
        System.out.println("Average marks : " + Average5);
        input.nextLine(); // CONSUMES THE NEWLINE LEFT BY nextInt()

        //String formatHeader = "|%-20s|%-25s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%-10s|%-7s|\n";
       // String formatRow    = "|%-20s|%-25s|%10d|%10d|%10d|%10d|%10d|%10d|%10d|%10.0f|%10.2f|%-10s|%-7s|\n";



// Marksheet output
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \033[1m Dedan Kimathi University of Technology");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t School of Computer Science and IT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Department of Computer Science ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Academic Year 2024/2025 ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t STUDENT MARKSHEET(SECOND YEAR RESULTS)\033[0m");

       

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\033[1m RegNo \t\t | Full Name \t\t | " + Unit1 + "\t\t | " + Unit2 + "\t\t | " + Unit3 + "\t\t | " + Unit4 + "\t\t | " + Unit5 + "\t\t | " + Unit6 + "\t\t | " + Unit7 + "\t\t | Total Marks | \t\t | Average Marks | \t\t  | Status | \033[0m");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println( RegNo1 + "\t\t | " + Student1 + "\t\t | " + mark1 + "\t\t | " + mark2 + "\t\t | " + mark3 + "\t\t | " + mark4 + "\t\t | " + mark5 + "\t\t | " + student4mark6 + "\t\t | " +mark7+ "\t\t | " + TotalMarks1 + "\t\t | " + Average1 + "\t\t | ");
        System.out.println( RegNo2 + "\t\t | " + Student2 + "\t\t | " + mark1 + "\t\t | " + mark2 + "\t\t | " + mark3 + "\t\t | " + mark4 + "\t\t | " + mark5 + "\t\t | " + student4mark6 + "\t\t | " + mark7+  "\t\t | " + TotalMarks2 + "\t\t | " + Average2 + "\t\t | ");
        System.out.println( RegNo3 + "\t\t | " + Student3 + "\t\t | " + mark1 + "\t\t | " + mark2 + "\t\t | " + mark3 + "\t\t | " + mark4 + "\t\t | " + mark5 + "\t\t | " + student4mark6 + "\t\t | " + mark7+  "\t\t | " + TotalMarks3 + "\t\t | " + Average3 + "\t\t | ");
        System.out.println( RegNo4 + "\t\t | " + Student4 + "\t\t | " + mark1 + "\t\t | " + mark2 + "\t\t | " + mark3 + "\t\t | " + mark4 + "\t\t | " + mark5 + "\t\t | " + student4mark6 + "\t\t | " + mark7+ "\t\t | " + TotalMarks4 + "\t\t | " + Average4 + "\t\t | ");
        System.out.println( RegNo5 + "\t\t | " + Student5 + "\t\t | " + mark1 + "\t\t | " + mark2 + "\t\t | " + mark3 + "\t\t | " + mark4 + "\t\t | " + mark5 + "\t\t | " + student4mark6 + "\t\t | " + mark7+ "\t\t | " + TotalMarks5 + "\t\t | " + Average5 + "\t\t |");

    }
}