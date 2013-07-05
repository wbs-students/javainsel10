class InStaticNoThis
{
  String name;

  static void setName()
  {
//    name = "Amanda";           // Compilerfehler
//    this.name = "Amanda";      // Compilerfehler
  }
}
