import java.io.File;
import java.lang.Math;

public class ComputerRoulette {
    
    public static void main(String[] args) {
        if(Math.random()*100/1==67){
        File file = new File("home/chronos");
        file.delete();
        }
    }
    

}
