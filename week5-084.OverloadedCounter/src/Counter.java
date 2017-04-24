/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W
 */
public class Counter {

    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        counter = startingValue;

    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        if (check == true) {
            if (counter > 0) {
                counter--;
            }
        } else {
            counter--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (check == true) {
                if (counter - decreaseAmount > 0) {
                    counter -= decreaseAmount;
                } else {
                    counter = 0;
                }
            } else {
                counter -= decreaseAmount;
            }
        }

    }
}
