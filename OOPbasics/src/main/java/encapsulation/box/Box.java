package encapsulation.box;

public class Box {

    private double length;
    private double height;
    private double width;


    public Box(double length, double height, double width) {
        setLength(length);
        setHeight(height);
        setWidth(width);
    }

    public double geLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative number");
        }
        this.length = length;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative number");
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be a zero or negative number");
        }

        this.width = width;
    }

    public double calculateLateralSurfaceArea() {
        return (2 * length * height) + (2 * width * height);
    }


    //2lw + 2lh + 2wh
    public double calculateSurfaceArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }


    public double calculateVolume() {
        return length * width * height;
    }

}
