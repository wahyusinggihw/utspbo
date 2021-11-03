import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket3 extends Actor
{
    /**
     * Act - do whatever the rocket3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+1);
        if(isAtEdge())
            getWorld().removeObject(this); 
        else if(isTouching(hero.class) || isTouching(hero.class))
        {
            removeTouching(rocket3.class);
            Stage3.hp.add(-1);
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        else if(isTouching(rocket1.class))
        {
            removeTouching(rocket1.class);
            Stage3.score.add(20);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        else if(isTouching(rocket1kiri.class))
        {
            removeTouching(rocket1kiri.class);
            Stage3.score.add(20);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        else if(isTouching(rocketup.class))
        {
            removeTouching(rocketup.class);
            Stage3.score.add(20);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}
