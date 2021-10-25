import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial extends Actor
{
    /**
     * Act - do whatever the tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("space"))
        {
            getWorld().removeObject(this);
        }
    }
}
