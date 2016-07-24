package it.kabul.lor

abstract class Weapon {
  val damage: Int
}
case class Sword(damage: Int = 3) extends Weapon{
  override def toString = "Sword (damage = " + damage + " )"
}
case class Arc(damage: Int = 2) extends Weapon{
  override def toString = "Arc (damage = " + damage + " )"
}

case class Ax(damage: Int = 1) extends Weapon{
  override def toString = "Ax (damage = " + damage + " )"
}