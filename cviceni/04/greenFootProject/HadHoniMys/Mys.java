import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mys extends Actor
{
    /**
     * Act - do whatever the Mys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        turn(Greenfoot.getRandomNumber(31)-15);
        if (isAtEdge()){
            turn(180);
        }
    }    
}
