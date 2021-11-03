import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket2kiri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket2kiri extends Actor
{
    /**
     * Act - do whatever the rocket2kiri wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-5,getY());
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(rocket1.class))
        {
            removeTouching(rocket1.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
        }
        else if(isTouching(hero.class))
        {
            Stage2.hp.add(-1);
            Stage3.hp.add(-1);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
        }
        else if(isTouching(hero2.class))
        {
            Stage2.hp.add(-1);
            Stage3.hp.add(-1);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);            
        }
    }
}
