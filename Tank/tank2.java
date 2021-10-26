import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tank2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class tank2 extends Actor
{
    /**
     * Act - do whatever the tank2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0; 
    public void act()
    {
        // Add your action code here.        
        setLocation(getX()-1,getY());        
        if (getX()==0)
        {
            setLocation(getX()+1,getY());
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
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("blast.wav");
        }
        
        else if(isTouching(hero.class) || (isTouching(hero2.class)))
        {
            removeTouching(tank2.class);
            Stage2.hp.add(-1);
            Stage3.hp.add(-1);
            getWorld().addObject(new blast(),getX(),getY());
            getWorld().removeObject(this);
        }
        if(Greenfoot.getRandomNumber(10)<= 5) //menembak ketika dapat angka random kurang dari sama dengan 5
        {
            shooting();
        }
        
    }
    
    public void shooting()
    {
        delay++;
        if(delay==130)
        {
        getWorld().addObject(new rocket2kiri(),getX()-70,getY()-25);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    
}
