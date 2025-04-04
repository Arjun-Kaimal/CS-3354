import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubmissionTest {
    Problem problem = new Problem("Sample Problem", "This is a sample problem.", "Algorithms", 2, "return true;");
    Submission submission = new Submission(3, 1, "", problem, "return true;");

    @Test
    void checkSubmission_tc1() {
        /*
        tc1 verifies correct user response.
        Expected Output: The submission should pass.
        */

        System.out.println("\ncheckSubmission_tc1");
        submission.setUserResponse("return true;");
        assertTrue(submission.checkSubmission());
        assertEquals("", submission.getError());
    }

    @Test
    void checkSubmission_tc2() {
        /*
        tc2 verifies incorrect user response.
        Expected Output: The submission should fail with an error message.
        */

        System.out.println("\ncheckSubmission_tc2");
        submission.setUserResponse("return false;");
        assertFalse(submission.checkSubmission());
        assertEquals("Solution does not match the expected output.", submission.getError());
    }

    @Test
    void checkSubmission_tc3() {
        /*
        tc3 verifies empty user response.
        Expected Output: The submission should fail with an error message.
        */

        System.out.println("\ncheckSubmission_tc3");
        submission.setUserResponse("");
        assertFalse(submission.checkSubmission());
        assertEquals("Solution does not match the expected output.", submission.getError());
    }

    @Test
    void checkSubmission_tc4() {
        /*
        tc4 verifies null user response.
        Expected Output: The submission should fail with an error message.
        */

        System.out.println("\ncheckSubmission_tc4");
        submission.setUserResponse(null);
        assertFalse(submission.checkSubmission());
        assertEquals("Solution does not match the expected output.", submission.getError());
    }

    @Test
    void testSettersAndGetters_tc5() {
        /*
        tc5 verifies that setters and getters are working correctly.
        */

        System.out.println("\ntestSettersAndGetters_tc5");
        submission.setCases(5);
        assertEquals(5, submission.getCases());

        submission.setIncorrect(2);
        assertEquals(2, submission.getIncorrect());

        submission.setError("Syntax Error");
        assertEquals("Syntax Error", submission.getError());

        submission.setUserResponse("Some Code");
        assertEquals("Some Code", submission.getUserResponse());
    }

    @Test
    void submitQuestion_tc6() {
        /*
        tc6 verifies that the submitQuestion method prints the correct output.
        */

        System.out.println("\nsubmitQuestion_tc6");
        submission.submitQuestion("Sample Title", "Sample Description");
        assertEquals("Solution does not match the expected output.", submission.getError());
    }

    @Test
    void saveQuestion_tc7() {
        /*
        tc7 verifies that saveQuestion method does not throw an error.
        */

        System.out.println("\nsaveQuestion_tc7");
        submission.saveQuestion("Saved Question", "This is a saved question.");
    }
}

