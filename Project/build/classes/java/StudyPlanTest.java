public class StudyPlanTest {
    public static void main(String[] args) {
        StudyPlan sp = new StudyPlan();
        sp.setStudyGoal("Finish Data Structures", 10, 15);
        sp.markChapterCompleted();
        sp.markChapterCompleted();
        System.out.println("Progress: " + sp.getProgressPercentage() + "%");

        sp.addMissedQuestion("What is the time complexity of merge sort?");
        sp.reviseMissedQuestions();

        sp.recordTopicDifficulty("Trees", 9);
        sp.recordTopicDifficulty("Graphs", 8);
        sp.recordTopicDifficulty("Linked Lists", 5);
        sp.suggestAdaptiveFocus();

        sp.suggestStudyTimePerChapter();
    }
}

