package Instruction3.Problem14;

public class ZeroSamplesException extends Exception{
    public ZeroSamplesException(){
        super("0 given as number of samples");
    }
    public ZeroSamplesException(String message){
        super(message);
    }
}
