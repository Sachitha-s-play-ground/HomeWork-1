import java.util.Scanner;

public class Homework {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String RED = "\033[31m";
        final String BLUE = "\033[34m";
        final String GREEN = "\033[32m";
        final String BOLD = "\033[1m";
        final String RESET = "\033[0m";

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine().strip();
        if(name.length()==0) {
            System.out.println(RED+"Invalid Name"+RESET);
            System.exit(0); 
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (!(age >=10 && age <= 18)) {
            System.out.println(RED+"Invalid Age"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject1: ");
        String subject1 = scanner.nextLine().strip();
        if (!(subject1.startsWith("SE"))) {
            System.out.println(RED+"Invalid Subject Name"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject1 mark: ");
        Double mark1 = scanner.nextDouble();
        scanner.nextLine();
        if (!(mark1>=0 && mark1<=100)) {
            System.out.println(RED+"Invalid Subject Mark"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject2: ");
        String subject2 = scanner.nextLine().strip();
        if (!subject2.startsWith("SE") || subject2.equals(subject1)) {
            System.out.println(RED+"Invalid Subject Name"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject2 mark: ");
        Double mark2 = scanner.nextDouble();
        scanner.nextLine();
        if (!(mark2>=0 && mark2<=100)) {
            System.out.println(RED+"Invalid Subject Mark"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject3: ");
        String subject3 = scanner.nextLine().strip();
        if (!subject3.startsWith("SE") || subject3.equals(subject1) || subject3.equals(subject2)) {
            System.out.println(RED+"Invalid Subject Name"+RESET);
            System.exit(0);
        }

        System.out.print("Enter your subject3 mark: ");
        Double mark3 = scanner.nextDouble();
        scanner.nextLine();
        if (!(mark3>=0 && mark3<=100)) {
            System.out.println(RED+"Invalid Subject Mark"+RESET);
            System.exit(0);
        }
        // String name = "sachitha";
        // int age = 15;
        // String subject1 = "SE-1";
        // Double mark1 = 88.0;
        // String subject2 = "SE-2";
        // Double mark2 = 80.0;
        // String subject3 = "SE-1";
        // Double mark3 = 75.0;

        Double total = (mark1+mark2+mark3);
        Double average = (mark1+mark2+mark3)/3;
        int subjectNum1 = Integer.valueOf(subject1.substring(3, subject1.length()));
        int subjectNum2 = Integer.valueOf(subject2.substring(3, subject2.length()));
        int subjectNum3 = Integer.valueOf(subject3.substring(3, subject3.length()));


        System.out.println("+------------------------------------------+");
        System.out.printf("| Name: %-35s|\n",name.toUpperCase());
        System.out.printf("| Age: %s years                            |\n", age);
        System.out.printf("| Status: %s%-41s%s |\n", BOLD,(average>75)?(BLUE+"Credit Pass"+RESET):(average>55)?(GREEN+"Pass"+RESET):(RED+"Fail"+RESET),RESET);
        System.out.printf("| Total: %- 18.2f Average: %.2f |\n",total,average);
        System.out.println("+------------------------------------------+");
        System.out.printf("| %-9s| %-9s| %-19s|\n", "Subjects","Marks","Status");
        System.out.println("+------------------------------------------+");
        System.out.printf("| SE-%03d   |%- 10.2f| %-28s|\n", subjectNum1,mark1,(mark1>=75)?(BLUE+"Credit Pass"+RESET):(mark1>=55)?(GREEN+"Pass"+RESET):(RED+"Fail"+RESET));
        System.out.printf("| SE-%03d   |%- 10.2f| %-28s|\n", subjectNum2,mark2,(mark2>=75)?(BLUE+"Credit Pass"+RESET):(mark2>=55)?(GREEN+"Pass"+RESET):(RED+"Fail"+RESET));
        System.out.printf("| SE-%03d   |%- 10.2f| %-28s|\n", subjectNum3,mark3,(mark3>=75)?(BLUE+"Credit Pass"+RESET):(mark3>=55)?(GREEN+"Pass"+RESET):(RED+"Fail"+RESET));
        System.out.println("+------------------------------------------+");
    }
}