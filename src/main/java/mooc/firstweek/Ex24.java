package mooc.firstweek;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            }
            if (command.equals("points")) {
                System.out.println("Top ten by points");
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                System.out.println("Top ten by goals");
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                System.out.println("Top ten by assists");
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                System.out.println("Top ten by penalties");
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("Statistics for Sidney Crosby");
                NHLStatistics.searchByPlayer("Sidney Crosby");
            } else if (command.equals("club")) {
                System.out.println("Statistics for Anaheim Ducks");
                NHLStatistics.teamStatistics("ANA");
                NHLStatistics.sortByPoints();
            }
        }
    }
}
