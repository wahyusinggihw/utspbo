import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int y = 200;
    double g = 1;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY());
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2,getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            //jika tombol w ditekan, moncong hero akan berubah ke class hero1
        }
        if(Greenfoot.isKeyDown("space"))
        {
            shooting();
        }
    }
    
    public void shooting()
    {
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1(),getX()+60,getY()-20);
        delay=0;
        //Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}
