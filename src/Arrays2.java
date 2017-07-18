import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        // ask the user how many scores
        Scanner scan = new Scanner(System.in);
        System.out.println("How many test scores? ");
        int numGrades = scan.nextInt();



        //put it into an array
        //create the array
        double[] grades = new double[numGrades];
        //loop through all elements of array
        for (int i = 0; i < numGrades; i++) {
            //prompt the user to enter each score
            System.out.println("Next score: ");
            //get double score from user
            //store it in array
            grades[i] = scan.nextDouble();
        }


        System.out.println("All scores: ");
        //output all scores
        for (double grade : grades) {
            System.out.println(grade);
        }
        //output the avg
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }
        double avg = sum / grades.length;
        //output all scores > avg
        System.out.println("All scores above avg of " + avg + ": ");
        for (double grade : grades) {
            if (grade > avg) {
                System.out.println(grade);
            }
        }

    }
}
