public class ChoiceQuestionTest11 {
    public static void main(String[] args) {
        ChoiceQuestion11 question = new ChoiceQuestion11();
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
        System.out.println(question.toString());
    }
}

