package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square wall;
    private Square hat;
    private Square brim1;
    private Square brim2;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square window;
    private Square window2;
    private Square window3;
    private Square foot;
    private Square foot1;
    private Square roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {

               grass = new Square();
               grass.moveVertical(230);
               grass.moveHorizontal(-60);
               grass.changeSize(500);
               grass.changeColor("green");
               grass.makeVisible();


        wall = new Square();
        wall.moveVertical(40);
        wall.moveHorizontal(60);
        wall.changeSize(100);
        wall.makeVisible();

        hat = new Square();
        hat.moveVertical(10);
        hat.moveHorizontal(50);
        hat.changeSize(60);
        hat.makeVisible();
        hat.changeColor("red");

        brim1 = new Square();
        brim1.moveVertical(28);
        brim1.moveHorizontal(40);
        brim1.changeSize(10);
        brim1.makeVisible();
        brim1.changeColor("red");

        brim2 = new Square();
        brim2.moveVertical(28);
        brim2.moveHorizontal(30);
        brim2.changeSize(10);
        brim2.makeVisible();
        brim2.changeColor("red");

        wall2 = new Square();
        wall2.moveVertical(40);
        wall2.changeSize(100);
        wall2.makeVisible();

        wall3 = new Square();
        wall3.moveVertical(40);
        wall3.moveHorizontal(100);
        wall3.changeSize(100);
        wall3.makeVisible();

        wall4 = new Square();
        wall4.moveVertical(40);
        wall4.moveHorizontal(180);
        wall4.changeSize(100);
        wall4.makeVisible();

        foot = new Square();
        foot.moveVertical(200);
        foot.moveHorizontal(180);
        foot.changeSize(30);
        foot.makeVisible();

        foot1 = new Square();
        foot1.moveVertical(200);
        foot1.moveHorizontal(70);
        foot1.changeSize(30);
        foot1.makeVisible();


        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(30);
        window.moveVertical(50);
        window.makeVisible();

        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(130);
        window2.moveVertical(50);
        window2.makeVisible();

        window3 = new Square();
        window3.changeColor("black");
        window3.moveHorizontal(230);
        window3.moveVertical(50);
        window3.makeVisible();

        roof = new Square();
        roof.changeSize( 140);
        roof.moveHorizontal(70);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
