/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W
 */
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxTeamSize; 

    public Team(String name) {
        this.name = name;
        maxTeamSize = 16;
        this.team = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player playerName) {
        if (size() < maxTeamSize) {
            team.add(playerName);
        }
    }

    public void printPlayers() {
        for (Player player : this.team) {
            System.out.println(player.getName() + ", goals " + player.goals());
        }
        
    }
    
    public void setMaxSize(int MaxSize) {
        maxTeamSize = MaxSize;
    }

    public int size() {
        return team.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : this.team) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
}
