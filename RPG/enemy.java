

public class enemy extends Monster
{
   Randomizer r;
    public enemy()
    {
       super(20,20,20,20,150);
      ATK= 20;
      DEF= 20;
      MagATK = 20;
      MagDEF = 20;
      Leben = 150;
      
      System.out.println();
      System.out.println("Monster:");
      System.out.println("ATK:"+ ATK);
      System.out.println("DEF:"+DEF);
      System.out.println("MagATK:"+MagATK);
      System.out.println("MagDEF:"+MagDEF);
      System.out.println("Leben:"+Leben);
    }

    
}
