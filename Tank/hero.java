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
    int b = 0,
    a = 1,
    c = 0;
    static int atasbawah = 0;
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

            }else{
                shooting();
            }

        }

        if(Greenfoot.isKeyDown("W") && a < 5){
            if(b == 0){
                a++;
                b = 1;
            }
            setImage("hero"+a+".png");
           // shootup();
        }else{
            b = 0;
        }

        if(Greenfoot.isKeyDown("S") && a > 1){
            if(c == 0){
                a--;
                c = 1;
            }
            if(a == 1){
                setImage("hero0.png");
            }else{
                setImage("hero"+a+".png");
            }
            //shootup();
        }else{
            c = 0;
        }
    }

    public void shooting()
    {
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new rocket1(),getX()+60,getY()-20);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }



    
    public void shootup2(){
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new roketatas(),getX()+55,getY()-34);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }
    
        public void shootup3(){
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new roketatas(),getX()+50,getY()-55);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }

        public void shootup4(){
        delay++;
        if(delay==15)
        {
            getWorld().addObject(new roketatas(),getX()+40,getY()-60);
            delay=0;
            Greenfoot.playSound("tank_amunisi.mp3");
        }
    }

}