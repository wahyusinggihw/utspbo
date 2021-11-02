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
    int b= 0,
        a =1,
        c= 0;
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
            if(a == 3){
                shootup();
            }else{
                shooting();
            }
        }
        
        if(Greenfoot.isKeyDown("w") && a < 5){
            if(b == 0){
                a++;
                b = 1;
            }
            setImage("tankkiri"+a+".png");
 
        }else{
            b = 0;
        }
        
        if(Greenfoot.isKeyDown("s") && a > 1){
            if(c == 0){
                a--;
                c = 1;
            }
            if(a == 1){
                setImage("tankkiri.png");
            }else{
                setImage("tankkiri"+a+".png");
            }
            
           
        }else{
            c = 0;
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
    
        public void shootup(){
        delay++;
        if(delay==15)
        {
        getWorld().addObject(new roketatas(),getX()+60,getY()-20);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}
