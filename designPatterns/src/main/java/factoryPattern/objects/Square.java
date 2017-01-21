package factoryPattern.objects;

public class Square implements Shape {

    Double length;

    public Square withLength(Double length){
        this.length = length;
        System.out.println("Length: "+length);
        return this;
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
