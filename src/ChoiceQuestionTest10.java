public class ChoiceQuestionTest10 {
    public static void main(String[] args) {
        ChoiceQuestion10 question = new ChoiceQuestion10();
        question.setText("What is the capital of France?");
        question.addChoice("Berlin", false);
        question.addChoice("Paris", true);
        question.addChoice("Rome", false);
        question.addChoice("Madrid", false);

        question.display();

        System.out.println("Your answer: 2");
        System.out.println("Correct? " + question.checkAnswer("2"));

        System.out.println("Your answer: 3");
        System.out.println("Correct? " + question.checkAnswer("3"));
    }
}
