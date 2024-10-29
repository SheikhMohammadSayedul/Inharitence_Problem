public class Question8 {
    private String text;
    private String answer;

    public Question8() {
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
}
