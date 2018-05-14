package com.lm;

public class Main {

    public static void main(String[] args) {
        //    Created by Laura Macia: May 14, 2018
        //    Udemy - Complete Java Masterclass with Tim Buchalka
        //    Challenge: Generics Challenge
        //
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        //HINT: ArrayList<Team> teams;
        // Collection.sort(teams);

        volleyballPlayer benjo = new volleyballPlayer("Benjo");
        volleyballPlayer ryan = new volleyballPlayer("Ryan");
        volleyballPlayer fulano = new volleyballPlayer("Fulano");
        volleyballPlayer sutano = new volleyballPlayer("Sutano");
        volleyballPlayer perencejo = new volleyballPlayer("Perencejo");
        volleyballPlayer perenceja = new volleyballPlayer("Perenceja");
        soccerPlayer leo = new soccerPlayer("Leo");

        Team<volleyballPlayer> legacy = new Team<volleyballPlayer>("Legacy");
        Team<volleyballPlayer> mojo = new Team<volleyballPlayer>("Mojo");
        Team<volleyballPlayer> toreros = new Team<volleyballPlayer>("Toreros");
        Team<soccerPlayer> dynamo = new Team<>("Dynamo");

        legacy.addPlayer(benjo);
        legacy.addPlayer(ryan);
        mojo.addPlayer(fulano);
        toreros.addPlayer(perenceja);
//        legacy.addPlayer(leo);


        League<Team<volleyballPlayer>> usv = new League<>("USV Boys");
        usv.addTeam(toreros);
        usv.addTeam(legacy);
        usv.addTeam(mojo);
//        usv.addTeam(dynamo);

        legacy.matchResult(mojo,2,1);
        legacy.matchResult(toreros, 2, 1);
        mojo.matchResult(toreros, 1, 2);

        usv.printRanking();

    }
}
