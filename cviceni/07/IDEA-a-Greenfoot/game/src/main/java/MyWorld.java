import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    private Set<Class> setOfAnimals;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setOfAnimals = new HashSet();
        setOfAnimals.add(Mys.class);
        setOfAnimals.add(Had.class);
        setOfAnimals.add(Motyl.class);
        setOfAnimals.add(Ryba.class);
        setOfAnimals.add(Vosa.class);
        addObject(new Kolecko(), 100, 100);
    }

    public Set<Class> getSetOfAnimals() {
        return setOfAnimals;
    }

}
