public class ChoiceQuestion11 extends Question11 {
    private int choiceNumber;

    public ChoiceQuestion11() {
        super();
        this.choiceNumber = 1;
    }

    public void addChoice(String choice, boolean correct) {
        addText(choiceNumber + ": " + choice);
        if (correct) {
            setAnswer(String.valueOf(choiceNumber));
        }
        choiceNumber++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nChoices added: " + (choiceNumber - 1);
    }
}
