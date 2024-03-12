public class InkyPonky{
    public InkyPonky(String x){
        System.out.println(x);
    }
    public InkyPonky(String pinky,String blinky,String rinky){
        System.out.println(blinky+" "+pinky);
        System.out.println(pinky+" "+rinky);
        System.out.println(blinky+" "+pinky+" "+rinky);
    }

    public static void main(String[] args){

        String pinky = "Donky";
        InkyPonky ponky = new InkyPonky(pinky);

        String blinky = "Pinky";
        String rinky = "Monky";

        InkyPonky ponky2 = new InkyPonky(pinky,blinky,rinky);
    }
}