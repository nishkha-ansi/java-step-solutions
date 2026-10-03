class Scorecard {
    private boolean[] answers;
    private final int totalQuestions;
    private int count;

    Scorecard(int n) {
        totalQuestions = n;
        answers = new boolean[n];
        count = 0;
    }

    void recordAnswer(boolean answer) {
        if (count < totalQuestions) {
            answers[count] = answer;
            count++;
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (answers[i]) {
                score++;
            }
        }

        return score;
    }
}