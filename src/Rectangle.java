public class Rectangle extends Shape{
    public Rectangle(int width, int  height){
        super(width,height);
    }

    @Override
    public void  GetArea(){
        System.out.println("the area using the "+ width +" and height "+  height + " is: " + Math.multiplyExact(width, height));
    }
}
