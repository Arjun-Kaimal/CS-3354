import java.util.ArrayList;

public class DBMgr
{
    private ArrayList<User> users;

    public DBMgr()
    {
        users = new ArrayList<>();
    }

    public String addUser(User user)
    {
        if(user == null)
            return "User is null!";
        else if(users.contains(user))
            return "User already exists in database!";
        else
        {
            users.add(user);
            return "User added successfully!";
        }
    }

    public String showLeaderboard()
    {
        String leaderboard = "";

        for (User user : users)
        {
            leaderboard += user.email + " is level " + user.skillLevel + ". Obtained " +
                    user.badges.size() + " badges. Completed " + user.completedProblems.size() +
                    " problems. Currently has a streak of " + user.streak + ".\n";
        }

        return leaderboard;
    }

    public String showLeaderboard(int numUsersToShow)
    {
        if(numUsersToShow <= 0)
            return "Number of users to show is less than or equal to 0!";

        String leaderboard = "";

        int numTimesToLoop = Math.min(numUsersToShow, users.size());

        for(int i = 0; i < numTimesToLoop; i++)
        {
            User user = users.get(i);
            leaderboard += user.email + " is level " + user.skillLevel + ". Obtained " +
                    user.badges.size() + " badges. Completed " + user.completedProblems.size() +
                    " problems. Currently has a streak of " + user.streak + ".\n";
        }

        return leaderboard;
    }

    public String showLeaderboard(User u1)
    {
        if(u1 == null)
            return "User is null!";

        for (User user : users)
        {
            if(user.email.equals(u1.email))
            {
                return user.email + " is level " + user.skillLevel + ". Obtained " +
                        user.badges.size() + " badges. Completed " + user.completedProblems.size() +
                        " problems. Currently has a streak of " + user.streak + ".\n";
            }
        }

        return "User not found!";
    }

    public static void main(String args[])
    {
        /**
        DBMgr db = new DBMgr();

        User user1 = new User();
        user1.email = "user1@gmail.com";
        System.out.println(db.addUser(user1));

        User user2 = new User();
        user2.email = "user2@gmail.com";
        System.out.println(db.addUser(user2));

        User user3 = new User();
        user3.email = "user3@gmail.com";
        System.out.println(db.addUser(user3));
        System.out.println(db.showLeaderboard());
         */
    }
}