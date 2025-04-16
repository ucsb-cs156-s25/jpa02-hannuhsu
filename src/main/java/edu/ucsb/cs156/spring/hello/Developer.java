package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Hannah S.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "hannuhsu";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-08");
        team.addMember("Giovanni L.");
        team.addMember("Hannah S.");
        team.addMember("Nathan A.");
        team.addMember("Rishik B.");
        team.addMember("Selena Z.");
        team.addMember("Tiffany G.");
        return team;
    }
}
