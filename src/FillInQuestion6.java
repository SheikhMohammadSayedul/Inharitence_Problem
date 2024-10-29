public class FillInQuestion6 extends Question6 {
    @Override
    public void setText(String questionText) {
        super.setText(replaceAnswerWithBlanks(questionText));
        String answer = extractAnswer(questionText);
        setAnswer(answer);
    }

    private String extractAnswer(String questionText) {
        int start = questionText.indexOf('_');
        int end = questionText.lastIndexOf('_');
        if (start != -1 && end != -1 && start < end) {
            return questionText.substring(start + 1, end);
        }
        return "";
    }

    private String replaceAnswerWithBlanks(String questionText) {
        int start = questionText.indexOf('_');
        int end = questionText.lastIndexOf('_');
        if (start != -1 && end != -1 && start < end) {
            return questionText.substring(0, start) + "_____"
                    + questionText.substring(end + 1);
        }
        return questionText;
    }
}

