import java.util.*;

public class StudyPlan {
    private String goal;
    private int totalChapters;
    private int chaptersCompleted;
    private List<String> missedQuestions;
    private Map<String, Integer> topicDifficultyMap; // Adaptive tracking
    private int studyHoursPerWeek;

    public StudyPlan() {
        this.goal = "";
        this.totalChapters = 0;
        this.chaptersCompleted = 0;
        this.missedQuestions = new ArrayList<>();
        this.topicDifficultyMap = new HashMap<>();
        this.studyHoursPerWeek = 0;
    }

    // UC25 - Set Study Goals
    public void setStudyGoal(String goal, int totalChapters, int studyHoursPerWeek) {
        this.goal = goal;
        this.totalChapters = totalChapters;
        this.studyHoursPerWeek = studyHoursPerWeek;
        System.out.println("Study goal set to: " + goal);
        System.out.println("Total chapters: " + totalChapters);
        System.out.println("Weekly study hours: " + studyHoursPerWeek);
    }

    // UC26 - Track Study Progress
    public void markChapterCompleted() {
        if (chaptersCompleted < totalChapters) {
            chaptersCompleted++;
            System.out.println("Progress updated. Chapters completed: " + chaptersCompleted + "/" + totalChapters);
        } else {
            System.out.println("All chapters completed!");
        }
    }

    public double getProgressPercentage() {
        return (totalChapters == 0) ? 0 : (chaptersCompleted * 100.0) / totalChapters;
    }

    // UC27 - Revise Previously Missed Questions
    public void addMissedQuestion(String question) {
        missedQuestions.add(question);
    }

    public void reviseMissedQuestions() {
        if (missedQuestions.isEmpty()) {
            System.out.println("No missed questions to revise.");
        } else {
            System.out.println("Revising missed questions:");
            for (String question : missedQuestions) {
                System.out.println("- " + question);
            }
        }
    }

    // UC28 - Adaptive Study Plan
    public void recordTopicDifficulty(String topic, int difficultyRating) {
        topicDifficultyMap.put(topic, difficultyRating);
    }

    public void suggestAdaptiveFocus() {
        if (topicDifficultyMap.isEmpty()) {
            System.out.println("No difficulty data recorded.");
            return;
        }

        System.out.println("Adaptive Suggestions (focus on high difficulty):");
        topicDifficultyMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .forEach(e -> System.out.println("- " + e.getKey() + ": Difficulty " + e.getValue()));
    }

    // UC29 - Time Management Suggestions
    public void suggestStudyTimePerChapter() {
        if (totalChapters == 0 || studyHoursPerWeek == 0) {
            System.out.println("Set total chapters and study hours to get suggestions.");
            return;
        }

        double hoursPerChapter = (double) studyHoursPerWeek / totalChapters;
        System.out.printf("Suggested study time per chapter: %.2f hours/week\n", hoursPerChapter);
    }

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
