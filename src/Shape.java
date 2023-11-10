public class Shape {
    /**Atributes*/
    protected int width;
    protected int height;


    /**Constructor*/
    public Shape(){}

    public Shape (int  width, int  height) {
        this.width = width;
        this.height =  height;
    }

    public void GetArea(){
        System.out.println("the area using the "+ width +" and height "+  height + " is: " + Math.multiplyExact(width, height));
    }
}
