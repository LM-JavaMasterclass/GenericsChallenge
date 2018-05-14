package com.lm;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public boolean addTeam(T team) {
        if (this.teams.contains(team)) {
            System.out.println(team.getName() + " already in the league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " now competing in " + this.name);
            return true;
        }
    }

    public void printRanking() {
        Collections.sort(this.teams); // works because Team has a compareTo method
        for (T team : teams) {
            System.out.println(team + " - Ranking: " + team.ranking());
        }
    }


}
