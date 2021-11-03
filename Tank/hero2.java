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
            if(a == 2){
                shootup2();
            }else if (a == 3){
                shootup3();
            }else if(a == 4){
                shootup4();
            }else if(a == 5){
                shootup5();
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
        getWorld().addObject(new rocket1kiri(),getX()-70,getY()-5);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    
    public void shootup2(){
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1up2kiri(),getX()-65,getY()-36);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    public void shootup3(){
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1up3kiri(),getX()-52,getY()-50);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    public void shootup4(){
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1up4kiri(),getX()-38,getY()-59);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    public void shootup5(){
        delay++;
        if(delay==30)
        {
        getWorld().addObject(new rocket1up5kiri(),getX()-20,getY()-55);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
}
