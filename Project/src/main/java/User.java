import java.util.ArrayList;
import java.time.LocalDate;

public class User
{
    public String userID;
    public String username;
    public String email;
    public String password;
    public int skillLevel;
    public int streak;
    public ArrayList<Badge> badges;
    public int points;
    public ArrayList<Problem> completedProblems;
    public StudyPlan studyPlan;

    public User()
    {
        userID = "";
        username = "";
        email = "";
        password = "";
        skillLevel = 0;
        streak = 0;
        badges = new ArrayList<>();
        points = 0;
        completedProblems = new ArrayList<>();
        StudyPlan studyPlan = new StudyPlan();
        System.out.println("User created successfully.");
    }

    public String addBadge(Badge badge)
    {
        badges.add(badge);
        return "Badge (" + badge.getBadgeName() + ") added to user account successfully.";
    }

    public String addCompletedProblem(Problem problem)
    {
        completedProblems.add(problem);

        if(completedProblems.size() % 10 == 0)
        {
            LocalDate currentDate = LocalDate.now();

            if(completedProblems.size() % 100 == 0)
            {
                Badge badge = new Badge("100 Questions Completed!", currentDate.toString(), 75);
                points += 75;
                System.out.println(addBadge(badge));
            }
            else
            {
                Badge badge = new Badge("10 Questions Completed!", currentDate.toString(), 25);
                points += 25;
                System.out.println(addBadge(badge));
            }

            System.out.println(checkIfLevelUp());
        }

        return "Completed Problem added to user account successfully.";
    }

    public String checkIfLevelUp()
    {
        if(points >= 100)
        {
            skillLevel++;
            points %= 100;
            LocalDate currentDate = LocalDate.now();
            Badge badge = new Badge("Level Up!", currentDate.toString(), 0);
            addBadge(badge);
            return "Level up successfully. Current level is level " + skillLevel + ". Points remaining to level up: " + (100 - points) + ".";
        }

        return "Points remaining to level up: " + (100 - points) + ".";
    }

    // Can implement when StudyPlan use case is implemented
    /*
    public static String adjustStudyPlan()
    {
        return "Study Plan adjusted successfully.";
    }
    */

    // Able to run things through main if needed

    public static void main(String args[])
    {
        User user = new User();
        Problem problem = new Problem();
        for(int i=0; i<9; i++)
            user.addCompletedProblem(problem);
        System.out.println(user.addCompletedProblem(problem));
    }

}
