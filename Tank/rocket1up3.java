import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket1up3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket1up3 extends rocketup
{
    /**
     * Act - do whatever the rocket1up3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+5,getY()-5);
        setRotation(-40);
        if(isAtEdge())
            getWorld().removeObject(this); 
        else if(isTouching(rocket2kiri.class))
        {
            removeTouching(rocket2kiri.class);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
}