
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author W
 */
public class Database {

    private ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        database.add(new Bird(name, latinName));
    }

    public void printStatistics() {
        for (Bird bird : database) {
            System.out.println(bird);
        }
    }

    public ArrayList<Bird> database() {
        return this.database;
    }

}
