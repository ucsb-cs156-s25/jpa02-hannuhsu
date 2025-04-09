package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_value() {
        Team team1 = new Team("t1");
        Team team2 = new Team("t1");

        assert(team1.equals(team1));
        assert(!team1.equals(""));
        assert(team1.equals(team2));

        team1.addMember("M1");

        assertEquals(team1.equals(team2), false);

        team2.setName("t2");

        assertEquals(team1.equals(team2), false);
    }

    @Test
    public void hashcode_test(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }
}
