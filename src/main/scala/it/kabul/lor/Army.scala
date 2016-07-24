package it.kabul.lor



class Army(val name: String, val figthers: List[Fighter]){
  override def toString = name
}


object FighterFactory{
  
  def enlistArmy(cardinality: Int) : List[Fighter] = {
    List.fill(cardinality)(generateFighter)
  }
  
  def generateFighter() : Fighter = {
    val random = UtilityMethods.generateFighterNumber()
    if(random equals 0) new Mankind
    else if(random equals 1) new Elf
    else new Dwarf
  }
}


object UtilityMethods{
  
  def generateFighterNumber() : Int = {
    generateNumber(Fighter.TYPES_OF_FIGHTER)
  }
  
  def generateNumber(threshold : Int) : Int = {
    scala.util.Random.nextInt(threshold)
  }
  
}



