public class Whistle{
    private String suara;
    
    public Whistle (String suara){
        this.suara=suara;
    }
    
    
    public void sound(){
    System.out.println(this.suara);
      }

    
    public static void main (String[]args){
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

           duckWhistle.sound();
           roosterWhistle.sound();
           duckWhistle.sound();
    }
    
}