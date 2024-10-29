public class TestQuestion7 {
    public static void main(String[] args) {
        Question7 question = new Question7();
        question.setText("Who invented Java?");
        question.setAnswer("James Gosling");
        question.display();
        System.out.println(question.checkAnswer("James Gosling"));
        System.out.println(question.checkAnswer(" JAMES gosling "));
        System.out.println(question.checkAnswer("James   Gosling"));
        System.out.println(question.checkAnswer("JamesGosling"));
        System.out.println(question.checkAnswer("Gosling"));
    }
}

