
class Question {
    String question;
    String correctAnswer;

    Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    void displayQuestion() {
        System.out.println("Question: " + question);
    }
}

class ExamQuestion extends Question {
    ExamQuestion(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    void checkAnswer(String answer) {
        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct Answer!");
            System.out.println("Marks: 1");
        } else {
            System.out.println("Wrong Answer!");
            System.out.println("Marks: 0");
        }
    }
}

public class ExamGrader {
    public static void main(String[] args) {
        ExamQuestion q = new ExamQuestion(
                "Which language is used for OOP?",
                "Java"
        );

        q.displayQuestion();
        q.checkAnswer("Java");
    }
}