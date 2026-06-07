import java.util.Scanner;
public class StudentGrades{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter teacher name");
        String teacher = inputCollector.nextLine();
        
        System.out.println("Welcome, Avatar "+ teacher+ "!!");

        System.out.print("Enter number of your students: ");
        int numStudents = inputCollector.nextInt();

        System.out.print("How many subjects do they take, boss? ");
        int numSubjects = inputCollector.nextInt();

        double[][] scores = new double[numStudents][numSubjects];

        // Input Scores
        for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            System.out.println("\nScores for Student "+ (studentIndex + 1));

            for (int subjectIndex = 0; subjectIndex < numSubjects; subjectIndex++) {
                System.out.print("Enter score for Subject " + (subjectIndex + 1) + ": ");

                double score = inputCollector.nextDouble();

                while (score < 0 || score > 100) {
                    System.out.print(
                            "Enter score between 0 and 100 boss! ");
                    score = inputCollector.nextDouble();
                }

                scores[studentIndex][subjectIndex] = score;
            }

            System.out.println("Saved Successfully");
        }

        // Totz and veggiez
        double[] totals = new double[numStudents];
        double[] averages = new double[numStudents];

        for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            double total = 0;

            for (int subjectIndex = 0; subjectIndex < numSubjects; subjectIndex++) {
                total += scores[studentIndex][subjectIndex];
            }

            totals[studentIndex] = total;
            averages[studentIndex] = total / numSubjects;
        }

        // rankz
        int[] ranks = new int[numStudents];
            for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
                int rank = 1;

                for (int otherStudents = 0; otherStudents < numStudents; otherStudents++) {
                    if (totals[otherStudents] > totals[studentIndex]) {
                        rank++;
                    }
                    

                }

                ranks[studentIndex] = rank;
        }
        
        // highest n lowest
        int highestStudent = 0;
        int lowestStudent = 0;

        for (int studentIndex = 1; studentIndex < numStudents; studentIndex++) {

            if (totals[studentIndex] > totals[highestStudent]) {
                highestStudent = studentIndex;
    }

            if (totals[studentIndex] < totals[lowestStudent]) {
                lowestStudent = studentIndex;
    }
}

        // Display Result Table
    System.out.println("\n====== LAGBAJA STUDENT RESULTS ======");

        for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
        System.out.println("\nStudent " + (studentIndex + 1));
        
        System.out.println();

            for (int subjectIndex = 0; subjectIndex < numSubjects; subjectIndex++) {
            System.out.println("Subject " + (subjectIndex + 1) + ": "+ scores[studentIndex][subjectIndex]);
        }

        System.out.println("Total Score for all subjects: " + totals[studentIndex]);
        System.out.println("Average Score: " + averages[studentIndex]);
        System.out.println("Rank: " + ranks[studentIndex]);
        System.out.println("=====================================");

        }
        System.out.println("Highest Scoring Student: Student "+ (highestStudent + 1));
        System.out.println("Total Score: "+ totals[highestStudent]);
        
        System.out.println("Lowest Scoring Student: Student "+ (lowestStudent + 1));
        System.out.println("Total Score: "+ totals[lowestStudent]);
        System.out.println("=====================================");
    }
}
