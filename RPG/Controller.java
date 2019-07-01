
public class Controller
{
    Monster m;
    Held h;
    boolean turnCompleted;
    Randomizer r;
    boolean advantage;
    BATTLESCREEN ScreenB;
    public Controller(String auswahl)
    {
        r = new Randomizer();
        if(auswahl=="Magier")
        {h= new Magier();} 
        else if(auswahl =="Ritter")
        {h = new Ritter();} 
        else if( auswahl == "Schütze")
        {h = new Schütze();}
        else if( auswahl == "Dieb")
        {h = new Dieb();}
        else
        { System.out.println("Klasse existiert nicht");}

        m = new enemy();
        turnCompleted = true;
    }

    public void PlayerAngriff(){
        if(turnCompleted==true){

            turnCompleted=false;
            
            if(r.CoinToss()==1){
                m.LebenVerloren((h.angriff()-(m.verteidigung()/2))+r.erzeugenZufallZwischen1und10());
            }else{
            m.LebenVerloren((h.angriff()-(m.verteidigung()/2))-r.erzeugenZufallZwischen1und10());
            }

            if(m.LebenGeben()<=0){
                System.out.println("YOU WIN");
            } else{
                monsterZug();
            }
        }
    }

    public void PlayerMagieAngriff(){
        if(turnCompleted==true){
            
            turnCompleted=false;
            
            if(r.CoinToss()==1){
                m.LebenVerloren((h.magischerAngriff()-(m.magischeVerteidgung()/2)+r.erzeugenZufallZwischen1und10()));
            }else{
            m.LebenVerloren((h.magischerAngriff()-(m.magischeVerteidgung()/2)-r.erzeugenZufallZwischen1und10()));
            }
            
            if(m.LebenGeben()<=0){
                System.out.println("YOU WIN");
            } else{
                monsterZug();
            }
        }
    }

    public void PlayerHeilen(){
        if(turnCompleted==true){
            turnCompleted=false;
            h.LebenHeilen(r.erzeugenZufallZwischen1und10()*2);
            if(m.LebenGeben()<=0){
                System.out.println("YOU WIN");
            } else{
                monsterZug();
            }
        }
    }

    public void PlayerGlueck(){

    }

    public void monsterZug(){
        int zahl = r.erzeugenZufallZwischen1und10();
        if(zahl == 0)
        {monsterIdle();}
        else if(zahl>=1&&zahl<=4)
        {monsterAngriff();}
        else if(zahl>=5&&zahl<=8)
        {monsterMagieAngriff();}
        else
        {monsterHeilen();}

    }

    public void monsterAngriff(){
        if(r.CoinToss()==1){
                h.LebenVerloren((m.angriff()-(h.verteidigung()/2))+r.erzeugenZufallZwischen1und10());
            }else{
            h.LebenVerloren((m.angriff()-(h.verteidigung()/2))-r.erzeugenZufallZwischen1und10());
            }
        
        
        if(h.LebenGeben()<=0){
            System.out.println("YOU LOSE");
        }    
        turnCompleted=true;
        System.out.println(m.LebenGeben());
        System.out.println(h.LebenGeben());
    }

    public void monsterMagieAngriff(){
        if(r.CoinToss()==1){
                h.LebenVerloren((m.magischerAngriff()-(h.magischeVerteidgung()/2)+r.erzeugenZufallZwischen1und10()));
            }else{
            h.LebenVerloren((m.magischerAngriff()-(h.magischeVerteidgung()/2)-r.erzeugenZufallZwischen1und10()));
            }
        
        if(h.LebenGeben()<=0){
            System.out.println("YOU LOSE");
        }    
        turnCompleted=true;
        System.out.println(m.LebenGeben());
        System.out.println(h.LebenGeben());
    }

    public void monsterHeilen(){
        m.LebenHeilen(r.erzeugenZufallZwischen1und100());
        turnCompleted=true;
        System.out.println(m.LebenGeben());
        System.out.println(h.LebenGeben());
    }

    public void monsterIdle(){
        turnCompleted = true;
    }

}


