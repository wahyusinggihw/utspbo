import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends Actor
{
    /**
     * Act - do whatever the mainmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Start.bgsound.stop();
            Greenfoot.setWorld(new Menu());
        }
    }
}
