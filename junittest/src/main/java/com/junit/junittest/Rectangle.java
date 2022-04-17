package com.junit.junittest;

public class Rectangle {
    
    private final double width,height;

    public Rectangle(){
        this.width=1;
        this.height=1;
    }

    public Rectangle(double height, double width){
        if(width<=0 || height <=0){
            throw new ArithmeticException("Width or Height cannot be 0");
        }
        this.width=width;
        this.height=height;
    }

    public double calculateArea(){
        return this.height*this.width;
    }

    public boolean isSquare(){
        if(this.width==this.height){
            return true;
        }
        else{
            return false;
        }
    }

}
