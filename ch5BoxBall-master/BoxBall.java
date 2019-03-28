import java.awt.*;
import java.awt.geom.*;
/**
 * Class BoxBall-a graphical ball that observes
 * 
 * This movement can be initiated by repeated calls to the "move" method.
 *
 * @author KaJuan Jones
 * @version 3/28/19
 */
public class BoxBall
{
    
    //private static final int GRAVITY = 3; // effect of gravity
    //private int ballDegradation = 2;
    
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPostion;
    private int yPostion;
    private int bottomWall = 500;
    private int topWall = 0;
    private int leftWall = 0;
    private int rightWall = 600;
    
    private Canvas canvas;
    private int ySpeed = 4;
    private int xSpeed = 7;
    
    
    

    /**
     * Constructor for BoxBall
     *
     *@param xPos the horizontal coordinate of the ball
     *@param yPos the vertical coordinate of the ball
     *@param ballDiameter the diameter(in pixels) of the ball
     *@param ballColor the color of the ball
     *@param groundPos the postion of the ground(where the ball will bounce)
     *@param drawingCanvas the canvas to draw this ball on
     */
    public BoxBall(int xPos, int yPos, int ballDiameter, Color ballColor, 
    Canvas drawingCanvas)
    {
        xPostion = xPos;
        yPostion = yPos;
        color = ballColor;
        diameter = ballDiameter;
        canvas = drawingCanvas;
    }
        
        
    

    /**
     * Draw this ball at its current position onto the canvas
     *
     * 
     */
    public void draw() 
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPostion,yPostion,diameter);
    }
    
    /**
     * Erase this ball at its current postion.
     **/ 
     public void erase()
     {
         canvas.eraseCircle(xPostion,yPostion,diameter);
        }
        
        
        /**
         * Move this ball according to its postion and speed and redraw.
         **/
         public void move()
         {
             //remove from canvas at the current position
             erase();
             
             //compute new postion
             xPostion = xPostion + xSpeed;// xPosition +=xSpeed;
             yPostion = yPostion +ySpeed;
             
             if(xPostion +diameter > rightWall){
                 xPostion = rightWall - diameter;
                 xSpeed = xSpeed * -1;
                }
                
                //draw again at new position
                draw();
            }
            
            /**
             * return the horizontal postion of this ball
             */
            public int getXPosition()
            {
                return xPostion;
            }
            
            /**
             * return the vertical position of this ball
             */
            public int getYPostion()
            {
                return yPostion;
            }
        }
            
            
         
        
        
      
        
     
        

