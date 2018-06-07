/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitlab1;

/**
 *
 * @author Yana Horkun
 */
public class SimpleCalc {
    
    private final double a;
    private final double b;
    
    SimpleCalc(double x, double y)
    {
    this.a = x;
    this.b = y;
   
}
   public double getMN (){
       return this.a*this.b;
    }
   public double getDil (){
       return this.a/this.b;
    }
   public double getsum (){
       return this.a+this.b;
    }
    public double getrisn (){
       return this.a-this.b;
    }
    
}
