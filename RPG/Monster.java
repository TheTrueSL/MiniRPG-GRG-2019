import java.util.Random;

public class Monster extends entity
{
    Randomizer r;
    public Monster(int nATK,int nDEF,int nMagATK,int nMagDEF,int nLeben)
    {
        super();
        ATK = nATK;
        DEF = nDEF;
        MagATK = nMagATK;
        MagDEF = nMagDEF;
        Leben = nLeben;
        r = new Randomizer();
    }
    
    public void LebenHeilen(int x){
    Leben = Leben+x;
    }
    
    public void LebenVerloren(int x){
    Leben = Leben-x;
    }
    

    public int heilen(){
        return r.erzeugenZufallZwischen1und10()+1;
    }

    
   
}

