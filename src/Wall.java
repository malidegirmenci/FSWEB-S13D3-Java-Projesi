public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = checkValue(width);
        this.height = checkValue(height);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = checkValue(width);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = checkValue(height);
    }
    public double getArea(){
        return  this.width * this.height;
    }

    double checkValue(double value){
        if(value < 0){
            return  0;
        }else{
            return  value;
        }
    }
}
