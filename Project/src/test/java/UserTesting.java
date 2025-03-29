import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTesting
{
    User user = new User();
    Problem problem = new Problem();

    @Test
    void addCompletedProblem_tc1()
    {
        //tc1 goes over adding 1 completed problem to user
        System.out.println("\naddCompletedProblem_tc1");
        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc2()
    {
        //tc2 goes over adding 10 completed problems to user
        System.out.println("\naddCompletedProblem_tc2");
        for(int i=0; i<10; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc3()
    {
        //tc3 goes over adding 40 completed problems to user
        System.out.println("\naddCompletedProblem_tc3");
        for(int i=0; i<40; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }

    @Test
    void addCompletedProblem_tc4()
    {
        //tc3 goes over adding 100 completed problems to user
        System.out.println("\naddCompletedProblem_tc3");
        for(int i=0; i<100; i++)
            user.addCompletedProblem(problem);

        assertEquals("Completed Problem added to user account successfully.", user.addCompletedProblem(problem));
    }
}
