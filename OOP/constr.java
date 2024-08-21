class orang{
    int mulut;
    public orang(int i){
        mulut=i;
}
   

void cekkerja(){
    if(mulut>1)
       System.out.println("bicara");
    else
       System.out.println("diam");
  
}
}

public class constr{
     public static void main(String[]args){
     orang adi=new orang(1);
     adi.cekkerja();
}
}