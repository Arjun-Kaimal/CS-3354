public class Submission {
    private String name;
    private int correctTestCases;
    private int incorrectTestCases;
    private String errorMsg;
    private String description;
    private String solution;
    private Problem problemObj;
    private String userResponse;

    public Submission(int correctTestCases, int incorrectTestCases, String errorMsg, Problem problemObj, String userResponse) {
        this.problemObj = problemObj;
        this.name = problemObj.getName();
        this.description = problemObj.getDescription();
        this.solution = problemObj.getSolution();
        this.correctTestCases = correctTestCases;
        this.incorrectTestCases = incorrectTestCases;
        this.errorMsg = errorMsg;
        this.userResponse = userResponse;
    }

    public Submission() {
        this.name = "";
        this.description = "";
        this.solution = "";
        this.problemObj = new Problem();
        this.errorMsg = "";
        this.correctTestCases = 0;
        this.incorrectTestCases = 0;
        this.userResponse = "";
    }

    public int getCases() {
        return correctTestCases;
    }

    public int getIncorrect() {
        return incorrectTestCases;
    }

    public String getError() {
        return errorMsg;
    }

    public void setCases(int n) {
        correctTestCases = n;
    }

    public void setIncorrect(int n) {
        incorrectTestCases = n;
    }

    public void setError(String str) {
        errorMsg = str;
    }

    public void submitQuestion(String title, String description) {
        System.out.println("Question submitted successfully");
        System.out.println("Correct test cases: " + correctTestCases);
        boolean isCorrect = checkSubmission();
        if (!isCorrect) {
            System.out.println("Submission failed: " + errorMsg);
        }
    }

    public void saveQuestion(String title, String description) {
        if (problemObj != null) {
            System.out.println("Question saved successfully");
            // Code to save to a database would go here
        }
    }

    public void setUserResponse(String str) {
        userResponse = str;
    }

    public String getUserResponse() {
        return userResponse;
    }

    public boolean checkSubmission() {
        if (solution.equals(userResponse)) {
            return true;  // Actual evaluation logic should go here
        }
        errorMsg = "Solution does not match the expected output.";
        return false;
    }
}
