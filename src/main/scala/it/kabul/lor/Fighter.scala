package it.kabul.lor

abstract class Fighter {
  val id = scala.util.Random.nextInt(10000) 
  val fighterType: String
  val force: Int
  val ability: Int
  val weapon: Weapon
  val luck : Int = scala.util.Random.nextInt(11)
  
  
  
  def damage = force + ability + weapon.damage + luck
  override def toString = "ID:> " + id + " TYPE = " + fighterType +" - Force = " + force + "- Ability = " + ability + "- Weapon = " + weapon + "- Luck =  " + luck  + "- DAMAGE =  "+ damage  
  
}

case class Mankind(force : Int = 6, ability: Int = 5, weapon: Weapon = new Sword) extends Fighter{
  val fighterType = "Mankind"
}
case class Elf(force : Int = 2, ability: Int = 9, weapon: Weapon = new Arc) extends Fighter{
  val fighterType = "Elf"
}
case class Dwarf(force : Int = 9, ability: Int = 2, weapon: Weapon = new Ax) extends Fighter{
  val fighterType = "Dwarf"
}

object Fighter{
	  val TYPES_OF_FIGHTER: Int = 3
}
