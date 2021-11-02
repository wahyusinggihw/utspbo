import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class Stage2.
     * 
     */
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 465, 1); 
        prepare();
    }
    int timer;
    boolean condition = true;
    tank2 tank2 = new tank2();
    public void act()
    {
        //tulisan Stage 2
        timer--;
        if(condition)
        {
            showText("STAGE 2",400,100);
            timer = 100;
            condition = false;
        }
        if(timer == 1)
        {
            showText("",400,100);
        }
        //jika pesawat tank2 tidak ada di world dan mendapat angka 1 dari range 200-1 maka akan ditambah tank2 lainnya
        if (tank2.getWorld() == null && Greenfoot.getRandomNumber(200)==1)
        {
            addObject(new tank2(),800,322);
        }
        //jika score lebih dari 50 dan mendapat angka 1 dari range 300-1 maka akan ditambah tank3
        if(MyWorld.score.getValue()>=50 && Greenfoot.getRandomNumber(300)==1)
        {
            addObject(new tank3(),1,322);
        }
        //score untuk ke stage selanjutnya
        if(MyWorld.score.getValue()>=40)
        {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(100);
            showText("NEXT STAGE",400,100);
            Greenfoot.delay(100);
            Greenfoot.setWorld(new Stage3());
        }
        //gameover
        if(Stage2.hp.getValue()==0)
        {
            removeObject(new hero());
            removeObject(new hero2());
            //Greenfoot.delay(100);
            Greenfoot.setWorld(new OverPage());
        }
    }
    
    public void prepare()
    {
        //hero 
        hero hero = new hero();
        addObject(hero,0,310);

        //musuh
        //for(int i=1; i==1; i++)
               
        tank2 tank2 = new tank2();
        addObject(tank2,800,322);
          
        Counter counter = new Counter();
        addObject(score,56,22);
        score.setValue(0);

        Counter counter2 = new Counter();
        addObject(hp,56,57);
        hp.setValue(5);

    }
    }

