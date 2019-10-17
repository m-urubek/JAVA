import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    public boolean cursorIsOutOfBorder(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse == null)
          return true;
        return false;
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1, true); 
        addObject(new Had(), 200, 200);
        addObject(new Mys(), 900, 60);
        addObject(new Mys(), 1000, 500);
        addObject(new Mys(), 800, 700);
        addObject(new Mys(), 100, 650);
    }
}
