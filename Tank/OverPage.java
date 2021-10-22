import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 465, 1);
        prepare();
    }
    
    public void prepare()
    {
        GameOver GameOver = new GameOver();
        addObject (GameOver, 100, 100);
        GameOver.setLocation(400,200);
        showText("Kamu Kalah. Cupu!",400,300);
        showText("Score : " +MyWorld.score.getValue()+" points" ,400,350);

        //Quit quit = new Quit();
        //addObject(quit,504,443);
    }
}
