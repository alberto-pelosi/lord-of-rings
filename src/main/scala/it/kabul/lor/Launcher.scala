package it.kabul.lor

object Launcher {
  
  
  val NUMBER_OF_SOLDIER = 100
  
  def main(args: Array[String]) : Unit = {
    var army1 = new Army("Nazi", FighterFactory.enlistArmy(NUMBER_OF_SOLDIER))
    var army2 = new Army("USSR", FighterFactory.enlistArmy(NUMBER_OF_SOLDIER))
    Battle.simulate(army1, army2)
  }
}