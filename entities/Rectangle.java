package entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double area() {
        return  Width * Height;
    }

    public double perimiter() {
        return 2*(Height + Width);
    }

    public double diagonal() {
        return Math.sqrt((Height * Height) + (Width * Width));
    }
}
