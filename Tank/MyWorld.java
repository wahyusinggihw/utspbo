import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 465, 1); 
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    int delay = 0;
    int timer;
    boolean condition = true;
    public void act()
    {    
        timer--;
        if(condition)
        {
            showText("STAGE 1",400,100);
            timer = 100;
            condition = false;
        }
        if(timer == 1)
        {
            showText("",400,100);
        }
        
        if(MyWorld.score.getValue()>=10)
        {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(100);
            showText("NEXT STAGE",400,100);
            Greenfoot.delay(200);
            Greenfoot.setWorld(new Stage2());
        }
        
        if(MyWorld.hp.getValue()==0)
        {
            Greenfoot.delay(100);
            Greenfoot.setWorld(new OverPage());
        }
    }
    
    private void prepare()
    { 
        //hero
        hero hero = new hero();
        addObject(hero,0,322);
        
        //musuh
        tank1 tank1 = new tank1();
        addObject(tank1,800,322);

        Counter counter = new Counter();
        addObject(score,56,22);
        score.setValue(0);
        
        Counter counter2 = new Counter();
        addObject(hp,56,57);
        hp.setValue(1);
    }
}
