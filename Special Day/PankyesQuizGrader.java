import java.util.Scanner;
public class PankyesQuizGrader{

    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = inputCollector.nextInt();
        
        System.out.print("Enter number of QUizzes: ");
        int numQuiz = inputCollector.nextInt();
        
        int[][] scores = new int[numStudents][numQuiz];
        String[] studentNames = new String[numStudents];
        
        
        for(int index = 0; index < numStudents; index++) {
            studentNames[index] = "Student " + (index + 1);
            System.out.println("\nEntering score for " + studentNames[index]);
            
            for(int count = 0; count < numQuiz; count++) {

                while (true) {
                    System.out.print("Enter quiz score " + (count + 1)+": " );
                    int score = inputCollector.nextInt();
                    
                    if(score >= 0 && score <= 100) {
                        scores[index][count] = score;
                        break;
                    } 
                    else {
                        System.out.println("Enter score between 0 and 100");
                    }

                }

            }
            
        }
        



    }




}
