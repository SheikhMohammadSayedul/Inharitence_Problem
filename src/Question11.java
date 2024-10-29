public class Question11 {
    private String text;
    private String answer;

    public Question11() {
        text = "";
        answer = "";
    }
    public void setText(String questionText) {
        text = questionText;
    }
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }
    public boolean checkAnswer(String response) {
        return response.trim().equalsIgnoreCase(answer.trim());
    }
    public void display() {
        System.out.println(text);
    }
    public void addText(String additionalText) {
        text += "\n" + additionalText;
    }
    @Override
    public String toString() {
        return "Question: " + text + "\nAnswer: " + answer;
    }
}

