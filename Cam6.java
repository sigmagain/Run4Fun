import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cam6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cam6 extends SmoothMover
{
    /**
     * Act - do whatever the Cam6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getExactX()-1,getExactY() );
    }    
}
