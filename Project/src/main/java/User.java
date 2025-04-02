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
    public boolean isLoggedIn;

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
        studyPlan = new StudyPlan();
        isLoggedIn = true;
        System.out.println("User created successfully and logged in.");
    }

    public void logout()
    {
        isLoggedIn = false;
        System.out.println("User logged out successfully.");
    }

    public String addBadge(Badge badge)
    {
        badges.add(badge);
        return "Badge (" + badge.getBadgeName() + ") added to user account successfully.";
    }

    public String addCompletedProblem(Problem problem)
    {
        if(problem.getName().isEmpty())
            return "Problem name is empty!";
        if(problem.getDescription().isEmpty())
            return "Problem description is empty!";
        if(problem.getCategory().isEmpty())
            return "Problem category is empty!";
        if(problem.getDifficulty() == 0)
            return "Problem difficulty is empty!";
        if(problem.getSolution().isEmpty())
            return "Problem solution is empty!";

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

    public static String adjustStudyPlan()
    {
        return "Study Plan adjusted successfully.";
    }

    public static void main(String args[])
    {
        User user = new User();
        Problem problem = new Problem();
        for(int i=0; i<9; i++)
            user.addCompletedProblem(problem);
        System.out.println(user.addCompletedProblem(problem));
        
        user.logout();
    }
}
