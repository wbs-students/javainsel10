public class PlayerDataDemo
{
  public static void main( String[] args )
  {
    PlayerData parry = new PlayerData();
    parry.name = "Parry Hotter";
    PlayerFunctions.hasCompoundName( parry );
    PlayerFunctions.clearName( parry );
  }
}
