
public class Held extends entity
{

    Randomizer r;

    public Held(int nATK,int nDEF,int nMagATK,int nMagDEF,int nLeben)
    {
        super();
        ATK = nATK;
        DEF = nDEF;
        MagATK = nMagATK;
        MagDEF = nMagDEF;
        r = new Randomizer();
        Leben = nLeben;
    }

    public int LebenGeben(){
        return Leben;
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
