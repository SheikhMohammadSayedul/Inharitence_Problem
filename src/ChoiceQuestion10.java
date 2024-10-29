public class ChoiceQuestion10 extends Question10 {
    private int choiceNumber;
    public ChoiceQuestion10() {
        super();
        choiceNumber = 1;
    }
    public void addChoice(String choice, boolean correct) {
        addText(choiceNumber + ": " + choice);
        if (correct) {
            setAnswer(""+ choiceNumber);
        }
        choiceNumber++;
    }
}
