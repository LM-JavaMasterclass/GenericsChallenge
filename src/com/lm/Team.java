package com.lm;

import java.util.ArrayList;

// From TB code from Generics lesson

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played =0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();  // Again added the T parameter here


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (T player) { // And added the T parameter here as well (paramtized type)
        if (members.contains(player)){
            System.out.println(((Player) player).getName() + " is already in the team"); // Here requires casting to avoid error
                           // as it cannot otherwise know that the method exists for a generic T - temporary
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName()+ " picked for team " + this.name); // Once type is specified, casting not necessary
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult (Team<T> opponent, int ourScore, int theirScore) {
                        // In parameter <T> checks that I'm matching comparable teams
        String message;

        if (ourScore>theirScore){
            won++;
            message = " won ";
        } else if (ourScore==theirScore){
            tied++;
            message = " tied to ";
        } else{
            lost++;
            message = " lost to ";
        }
        played++;
        // To also update other team's scores:
        if (opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Team " + this.name;
    }
}
