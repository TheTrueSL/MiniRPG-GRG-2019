

public class entity
{
    int ATK;
    int DEF;
    int MagATK;
    int MagDEF;
    int Leben;
    
    public entity()
    {
       
    }
    
    
    public int angriff(){
        return ATK;
    }

    public int magischerAngriff(){
        return MagATK;
    }

    public int verteidigung(){
        return DEF;
    }

    public int magischeVerteidgung(){
        return MagDEF;
    }
    
    public int LebenGeben(){
     return Leben;
    }
}
