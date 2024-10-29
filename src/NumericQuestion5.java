public class NumericQuestion5 extends Question5 {
    private double numericAnswer;

    public void setAnswer(double correctResponse) {
        numericAnswer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        try {
            double numericResponse = Double.parseDouble(response);
            return Math.abs(numericResponse - numericAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
