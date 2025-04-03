import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTesting
{
    User user = new User();
    Problem problem = new Problem("name", "desc", "cat", 1, "solution");

    @Test
    public void testUserLogout()
    {
        assertEquals(true, user.logout());
    }

    @Test
    void addCompletedProblem_tc1()
    {
        /*
        tc1 goes over adding 1 completed problem to user

        only the return String is expected
         */

        System.out.println("\naddCompletedProblem_tc1");
        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc2()
    {
        /*
        tc2 goes over adding 10 completed problems to user

        Receive 1 badge
        Need 75 points to level up
         */

        System.out.println("\naddCompletedProblem_tc2");
        for(int i=0; i<10; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc3()
    {
        /*
        tc3 goes over adding 40 completed problems to user

        Receive 4 badges
        Level up to level 1
         */

        System.out.println("\naddCompletedProblem_tc3");
        for(int i=0; i<40; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc4()
    {
        /*
        tc4 goes over adding 100 completed problems to user

        Receive 10 badges - including the 100 question badge
        Level up to level 3
         */

        System.out.println("\naddCompletedProblem_tc4");
        for(int i=0; i<100; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc5()
    {
        /*
        tc5 goes over adding a problem with no name to user
         */

        System.out.println("\naddCompletedProblem_tc5");

        Problem noName = new Problem("", "desc", "cat", 1, "solution");

        assertEquals("Problem name is empty!", user.addCompletedProblem(noName));
    }

    @Test
    void addCompletedProblem_tc6()
    {
        /*
        tc6 goes over adding a problem with no description to user
         */

        System.out.println("\naddCompletedProblem_tc6");

        Problem noDesc = new Problem("name", "", "cat", 1, "solution");

        assertEquals("Problem description is empty!", user.addCompletedProblem(noDesc));
    }

    @Test
    void addCompletedProblem_tc7()
    {
        /*
        tc7 goes over adding a problem with no category to user
         */

        System.out.println("\naddCompletedProblem_tc7");

        Problem noCat = new Problem("name", "desc", "", 1, "solution");

        assertEquals("Problem category is empty!", user.addCompletedProblem(noCat));
    }

    @Test
    void addCompletedProblem_tc8()
    {
        /*
        tc8 goes over adding a problem with no difficulty to user
         */

        System.out.println("\naddCompletedProblem_tc8");
        Problem noDiff = new Problem("name", "desc", "cat", 0, "solution");

        assertEquals("Problem difficulty is empty!", user.addCompletedProblem(noDiff));
    }

    @Test
    void addCompletedProblem_tc9()
    {
        /*
        tc9 goes over adding a problem with no solution to user
         */

        System.out.println("\naddCompletedProblem_tc9");

        Problem noSol = new Problem("name", "desc", "cat", 1, "");

        assertEquals("Problem solution is empty!", user.addCompletedProblem(noSol));
    }
}
