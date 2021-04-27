/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class Counter {
    private int value;
    
    public Counter() {
        this(0);
    }
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int amount) {
        if (amount < 0) {
            return;
        }
        this.value += amount;
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int amount) {
        if (amount < 0) {
            return;
        }
        this.value -= amount;
    }
}
