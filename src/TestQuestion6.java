public class TestQuestion6 {
    public static void main(String[] args) {
        FillInQuestion6 question = new FillInQuestion6();
        question.setText("The inventor of Java was _James Gosling_");

        question.display();

        System.out.println(question.checkAnswer("James Gosling")); // true
        System.out.println(question.checkAnswer("Gosling"));       // false
    }
}


