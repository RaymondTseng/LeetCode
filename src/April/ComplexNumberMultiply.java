/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

/**
 *
 * @author raymondtseng
 */
public class ComplexNumberMultiply {
    public String complexNumberMultiply(String a, String b) {
        ComplexNumber aa = strToComplexNumber(a);
        ComplexNumber bb = strToComplexNumber(b);
        return aa.multiply(bb);
    }
    
    private ComplexNumber strToComplexNumber(String a){
        String[] temp = a.split("\\+");
        ComplexNumber c = new ComplexNumber(Integer.valueOf(temp[0]), Integer.valueOf(temp[1].substring(0, temp[1].length()-1)));
        return c;
    }
    
}

class ComplexNumber{
    public int a;
    public int b;
    
    public ComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public String multiply(ComplexNumber c){
        int ta = a * c.a;
        ta -= b * c.b;
        int tb = a * c.b;
        tb += b * c.a;
        return ta + "+" + tb + "i";
    }
}
