import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    /**
     * Constructor for objects of class Stage3.
     * 
     */
    int timer;
    int timer2;
    boolean condition = true;
    boolean condition2 = true;
    bomber bomber = new bomber();
    public Stage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 465, 1); 
        prepare();
    }
    
    public void act()
    {
        //tulisan Stage 3
        timer--;
        if(condition)
        {
            showText("STAGE 3",400,100);
            timer = 100;
            condition = false;
        }
        if(timer == 1)
        {
            showText("",400,100);
        }
        //jika pesawat bomber tidak ada di world dan mendapat angka 1 dari range 200-1 maka akan ditambah tank3
        if (bomber.getWorld() == null && Greenfoot.getRandomNumber(200)==1)
        {
            addObject(new tank3(),1,322);
        }
        //jika score lebih dari 50 dan mendapat angka 1 dari range 300-1 maka akan ditambah tank2
        if(MyWorld.score.getValue()>50 && Greenfoot.getRandomNumber(300)==1)
        {
            addObject(new tank2(),800,322);
        }
        //jika score lebih dari 100 akan spawn pesawat bomber lagi
        if(Stage3.score.getValue()>=100)
        {
            spawnbomber();
        }
        //score untuk ke stage selanjutnya
        if(Stage3.score.getValue()>=40)
        {
            showText("YOU WIN!",400,100);
            Greenfoot.delay(100);
            showText("CONGRATULATIONS",400,100);
            showText("Score : "+MyWorld.score.getValue()+" points" ,400,120);
            Greenfoot.delay(350);
            Greenfoot.setWorld(new team());
            
        }
        //gameover
        if(Stage3.hp.getValue()==0)
        {
            removeObject(new hero());
            removeObject(new hero2());
            //Greenfoot.delay(100);
            Greenfoot.setWorld(new OverPage());
        }
    }
    //bomb pesawat
    public void spawnbomber () 
    {
        timer2--;
        if(condition2)
        {
            //showText("STAGE 3",400,100);
            timer2=100;
            condition2 = false;
        }
        if (timer2==1)
        {
            addObject(new bomber(),1,30);
        }
    }
    
    public void prepare()
    {
        //hero 
        hero hero = new hero();
        addObject(hero,400,310);

        Counter counter = new Counter();
        addObject(score,56,22);
        score.setValue(0);

        Counter counter2 = new Counter();
        addObject(hp,56,57);
        hp.setValue(5);

        addObject(bomber,1,30);
    }
}
