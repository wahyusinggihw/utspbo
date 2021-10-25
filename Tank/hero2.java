import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero2 extends Actor
{
    /**
     * Act - do whatever the hero2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY());
        if(Greenfoot.isKeyDown("a"))
        {
            hero2 hero2 = new hero2();
            getWorld().addObject(hero2,getX()-2,getY());
            getWorld().removeObject(this);
        }
        
        else if(Greenfoot.isKeyDown("d"))
        {
            hero hero = new hero();
            getWorld().addObject(hero,getX()+2,getY());
            getWorld().removeObject(this);
        }
        
        else if(Greenfoot.isKeyDown("space"))
        {
            shooting();
        }
    }
    
    public void shooting()
    {
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1kiri(),getX()-60,getY()-20);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}
