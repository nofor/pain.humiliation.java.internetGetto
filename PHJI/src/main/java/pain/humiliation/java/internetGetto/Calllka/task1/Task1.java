package pain.humiliation.java.internetGetto.Calllka.task1;

public class Task1 {

    public int naturelNumber (int q, int w){
        return (q / w) & (q % w);
    }

    public int sumNumber (int x){
        return ((x / 10) % 10) + x % 10;
    }

    public int changeTypes(double x){
        return (int) x;
    }

    public int sumNumberT (int x){
        return ((x / 10) % 10) + x % 10 + ((x / 100) % 10);
    }

    public void verificationMethod(){
        byte s = 120;
        System.out.println(s-20);
        float w = 2.5F;
        int z = 10 / (int) w;
        System.out.println(z+w);
        float y = 2F;
        System.out.println((int)y+"2"+y*1.5);
    }

}
