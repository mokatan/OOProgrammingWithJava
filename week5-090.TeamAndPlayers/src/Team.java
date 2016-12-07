
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class Team {
    private String name;
    private ArrayList<Player> playerList;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.playerList = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if (this.playerList.size() < this.maxSize) {
            this.playerList.add(player);
        }
    }
    
    public void printPlayers(){
        //System.out.println(this.playerList);
        for(Player players : this.playerList){
            System.out.println(players.toString());
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.playerList.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for (Player players : this.playerList) {
            totalGoals += players.goals();
        }
        return totalGoals;
    }
    
}
