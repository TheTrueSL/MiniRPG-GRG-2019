
public class Randomizer
{

    public Randomizer()
    {

    }

    public int erzeugenZufallZwischen1und100()
    {
        double z = Math.random()*100;
        int zahl = (int) z;
        return zahl;
    }

    public int CoinToss(){

        if(erzeugenZufallZwischen1und10()<5){
            return 1;
        }else{
            return 0;
        }
    }

    public int erzeugenZufallZwischen1und10()
    {
        double z = Math.random()*10;
        int zahl = (int) z;
        return zahl;
    }

}
