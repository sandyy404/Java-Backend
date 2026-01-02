package Quiz;

import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {

        question[0] = new Question(1, "Which of the following is NOT a feature of Java?", "A:- Platform Independent", "B:- Object-Oriented", "C:- Use of pointers", "D:- Secure", " Use of pointers");

        question[1] = new Question(2, "What is the default value of an instance variable in Java?", "A:- Garbage value", "B:- 0", "C:- Depends on data type", "D:- Null for all", " Depends on data type");

        question[2] = new Question(3, "Which keyword is used to inherit a class in Java?", "A.:-implements", "B:-inherits", "C:- extends", "D:- super", " extends");

        question[3] = new Question(4, "Which of these is checked at compile time?", "A:- Runtime Exception", "B.:-Logical Error", "C:- Checked Exception", "D:- JVM Error", " Checked Exception");

        question[4] = new Question(5, "Which collection does NOT allow duplicate elements?", "A:- ArrayList", "B:- LinkedList", "C:- HashSet", "D:- Vector", " HashSet");

    }
int score = 0;
    public void displayService() {
        int i = 0;
        for (Question q : question) {
            System.out.println("Question:-" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());
            Scanner sc = new Scanner(System.in);
            System.out.println();
            selection[i] = sc.nextLine();
            if (selection[i].equals("C") || selection[i].equals("c")) {
               System.out.println("Your answer is correct");
               score++;
            }else{
              System.out.println("Wrong Answer");
              System.out.println("The correct answer is:-"+q.getAnswer());
              score--;
            }
            i++;
            System.out.println();
        }
    }
    public void printscore(){
        System.out.println("Your total score is :- "+score +" out of 5.");
    }

}
