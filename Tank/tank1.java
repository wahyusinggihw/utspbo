import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tank1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tank1 extends Actor
{
    /**
     * Act - do whatever the tank1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-1,getY());
            if (getX()==700)
            {
                setLocation(getX()+1,getY());
            }
        
        if(isTouching(rocket1.class))
        {
            removeTouching(rocket1.class);
            MyWorld.score.add(10);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
        }
    }
}
