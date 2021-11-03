import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomber extends Actor
{
    /**
     * Act - do whatever the bomber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+2,getY());        
        if (getX()==0)
        {
            setLocation(getX()-2,getY());
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else 
        {
            bombing();
        }
        
        if(isTouching(rocketup.class))
        {
            removeTouching(rocketup.class);
            MyWorld.score.add(10);
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
    }
    public void bombing()
    {
        delay++;
        if(delay==100)
        {
        getWorld().addObject(new rocket3(),getX(),getY()+50);
        delay=0;
        Greenfoot.playSound("missile.mp3");
        }
    }
}
