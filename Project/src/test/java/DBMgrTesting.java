import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBMgrTesting {
    private DBMgr db;
    private User user;

    @BeforeEach
    public void setup() {
        db = new DBMgr();

        user = new User();
        user.email = "test@example.com";
        user.password = "securePass123";
        user.skillLevel = 2;
        user.streak = 1;
        user.badges = new ArrayList<>();
        user.completedProblems = new ArrayList<>();
        user.points = 50;
    }

    @Test
    public void testAddValidUser() {
        String result = db.addUser(user);
        assertEquals("User added successfully!", result);
    }

    @Test
    public void testAddNullUser() {
        String result = db.addUser(null);
        assertEquals("User is null!", result);
    }

    @Test
    public void testAddDuplicateUser() {
        db.addUser(user);
        String result = db.addUser(user);
        assertEquals("User already exists in database!", result);
    }

    @Test
    public void testShowLeaderboardAllUsers() {
        db.addUser(user);
        String leaderboard = db.showLeaderboard();
        assertTrue(leaderboard.contains("test@example.com"));
    }

    @Test
    public void testShowLeaderboardWithPositiveLimit() {
        User user2 = new User();
        user2.email = "second@example.com";
        db.addUser(user);
        db.addUser(user2);

        String leaderboard = db.showLeaderboard(1);
        assertTrue(leaderboard.contains("example.com"));
        assertFalse(leaderboard.contains("second@example.com") && leaderboard.contains("test@example.com"));
    }

    @Test
    public void testShowLeaderboardWithZeroLimit() {
        String leaderboard = db.showLeaderboard(0);
        assertEquals("Number of users to show is less than or equal to 0!", leaderboard);
    }

    @Test
    public void testShowLeaderboardWithNegativeLimit() {
        String leaderboard = db.showLeaderboard(-3);
        assertEquals("Number of users to show is less than or equal to 0!", leaderboard);
    }

    @Test
    public void testShowLeaderboardSpecificUserExists() {
        db.addUser(user);
        String result = db.showLeaderboard(user);
        assertTrue(result.contains("test@example.com"));
    }

    @Test
    public void testShowLeaderboardSpecificUserNull() {
        String result = db.showLeaderboard(null);
        assertEquals("User is null!", result);
    }

    @Test
    public void testShowLeaderboardSpecificUserNotInDB() {
        User newUser = new User();
        newUser.email = "notadded@example.com";
        String result = db.showLeaderboard(newUser);
        assertEquals("User not found!", result);
    }
}
