package InterfaceLatihan;

public class NumberType implements I1, D1 {
    
    public String methodD1(){
        return String.format("is Double");
    }
    public String methodI1(){
        return String.format("is Integer");
    }
    
}
