
public class Spiel
{
   Controller c;

    public Spiel(String Auswahl)
    {
       c = new Controller(Auswahl);
        
    }

    public void Angriff(){
    c.PlayerAngriff();
    }
    
    public void Magie(){
    c.PlayerMagieAngriff();
    }
    
    public void Heilen(){
    c.PlayerHeilen();
    }
    
}
