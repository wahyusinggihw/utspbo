import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tank3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tank3 extends Actor
{
    /**
     * Act - do whatever the tank3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+1,getY());        
        if (getX()==0)
        {
            setLocation(getX()-1,getY());
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        if(isTouching(rocket1.class))
        {
            removeTouching(rocket1.class);
            MyWorld.score.add(10);
            Stage2.score.add(10);
            Stage3.score.add(10);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        
        else if(isTouching(rocket1kiri.class))
        {
            removeTouching(rocket1kiri.class);
            MyWorld.score.add(10);
            Stage2.score.add(10);
            Stage3.score.add(10);
            getWorld().addObject(new blast2(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        
        else if(isTouching(hero.class) || (isTouching(hero2.class)))
        {
            removeTouching(tank3.class);
            Stage2.hp.add(-1);
            Stage3.hp.add(-1);
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        
    }
}
