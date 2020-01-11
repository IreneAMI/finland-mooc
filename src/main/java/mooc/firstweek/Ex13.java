package mooc.firstweek;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String player1 = reader.nextLine();
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(25);
        NHLStatistics.sortByPenalties();
        Scanner reader2 = new Scanner(System.in);
        String player3 = reader.nextLine();
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        Scanner reader3 = new Scanner(System.in);
        String player4 = reader.nextLine();
        System.out.println("Statistics of Philadelphia Flyers ");
        NHLStatistics.teamStatistics("PHI");
        Scanner reader4 = new Scanner(System.in);
        String player5 = reader.nextLine();
        System.out.println("Statistics for Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
