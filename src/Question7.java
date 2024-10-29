public class Question7 {
    private String text;
    private String answer;

    public Question7() {
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
        String normalizedAnswer = normalizeString(answer);
        String normalizedResponse = normalizeString(response);
        return normalizedAnswer.equals(normalizedResponse);
    }

    public void display() {
        System.out.println(text);
    }

    private String normalizeString(String input) {
        return input.trim().toLowerCase().replaceAll("\\s+", " ");
    }
}


