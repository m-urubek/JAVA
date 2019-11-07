import cz.mendelu.pjj.game.domain.Engine;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Set;

/**
 * Write a description of class Kolecko here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kolecko extends Actor {
    /**
     * Act - do whatever the Kolecko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            int count = Greenfoot.getRandomNumber(5)+1;
            Engine.addActors(getWorld(), getRandomClass(((MyWorld)getWorld()).getSetOfAnimals()), count);
        }
    }
    private Class getRandomClass(Set<Class> animals){
        int index = Greenfoot.getRandomNumber(animals.size());
        Class[] pole = new Class[animals.size()];
        animals.toArray(pole);
        return pole[index];
    }
}
