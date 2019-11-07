package cz.mendelu.pjj.game.domain;

import greenfoot.Greenfoot;
import greenfoot.World;
import greenfoot.Actor;

import java.lang.reflect.Constructor;

public class Engine {

    static Constructor<Actor> constructor;

    public static void addActors(World world, Class classParam, int count) {

        try {
            constructor = classParam.getConstructor();

            for (int i = 0; i < count; i++) {
                int x = Greenfoot.getRandomNumber(world.getWidth());
                int y = Greenfoot.getRandomNumber(world.getHeight());
                world.addObject(constructor.newInstance(), x, y);
            }

        } catch (Exception ex){

        }
    }
}
