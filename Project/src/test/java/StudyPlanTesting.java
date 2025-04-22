import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StudyPlanTesting {

    private StudyPlan studyPlan;

    @BeforeEach
    public void setUp() {
        studyPlan = new StudyPlan();
    }

    @Test
    public void testSetStudyGoal() {
        studyPlan.setStudyGoal("Learn Java", 8, 12);
    }

    @Test
    public void testMarkChapterCompleted() {
        studyPlan.setStudyGoal("Java", 3, 5);
        studyPlan.markChapterCompleted();
        studyPlan.markChapterCompleted();
        studyPlan.markChapterCompleted();

        assertEquals(100.0, studyPlan.getProgressPercentage());
    }

    @Test
    public void testAddAndReviseMissedQuestions() {
        studyPlan.addMissedQuestion("Explain polymorphism.");
        studyPlan.addMissedQuestion("Difference between ArrayList and LinkedList.");


        studyPlan.reviseMissedQuestions();
    }

    @Test
    public void testRecordAndSuggestAdaptiveFocus() {
        studyPlan.recordTopicDifficulty("OOP", 5);
        studyPlan.recordTopicDifficulty("Recursion", 9);
        studyPlan.recordTopicDifficulty("Threads", 7);

        studyPlan.suggestAdaptiveFocus();
    }

    @Test
    public void testSuggestStudyTimePerChapter() {
        studyPlan.setStudyGoal("Python", 6, 12);
        studyPlan.suggestStudyTimePerChapter(); // Should print 2.00
    }

    @Test
    public void testProgressPercentageZeroWhenNoChapters() {
        assertEquals(0.0, studyPlan.getProgressPercentage());
    }
}
