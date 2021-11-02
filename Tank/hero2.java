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
            }else if(a == 3){
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
        getWorld().addObject(new rocket1kiri(),getX()-60,getY()-5);
        delay=0;
        Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    
        public void shootup2(){
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new roketatas4(),getX()-14,getY()+60);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    
        public void shootup3(){
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new roketatas4(),getX()+45,getY()-45);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }

        public void shootup4(){
        delay++;
        if(delay==25)
        {
            getWorld().addObject(new roketatas5(),getX()+35,getY()-55);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
        
    }
        public void shootup5(){
        delay++;
        if(delay==25)
        {
            getWorld().addObject(new roketatas6(),getX()+15,getY()-55);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    

}
