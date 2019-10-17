import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Had here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Had extends Actor
{
    /**
     * Act - do whatever the Had wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld mw = (MyWorld) getWorld();
        if (mw.cursorIsOutOfBorder()){
            return;
        }
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if ()
        turnTowards(mouse.getX(),mouse.getY());
        move(4);
        Actor mys = getOneIntersectingObject(Mys.class);
        if (mys != null){
            mw.removeObject(mys);
        }
    }    
    
}
