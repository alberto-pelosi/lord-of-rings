package it.kabul.lor

object Battle {
  
  def simulate(a1: Army, a2: Army) : Army = {
    println(a1 + " VS " + a2)
    println("---------------------------------")
    if(combat(a1.figthers, a2.figthers) == 0) {println(a1.name + " " + Battle.WIN_MSG); a1} 
    else{println(a1.name + " " + Battle.WIN_MSG); a2}
  }
  
  def combat(l1: List[Fighter], l2: List[Fighter]) : Int = (l1, l2) match{
    case ((xh :: xt), (yh :: yt)) => if (faceToFace(xh, yh) equals 0) combat(l1, yt) else combat(xt, l2)  
    case ((xh :: xt), Nil) => 0
    case (Nil, (yh :: yt)) => 1
  }
  
  def faceToFace(f1: Fighter, f2: Fighter): Int = {
    if(f1.damage > f2.damage) {reporter(f1, f1, f2); 0}
    else if(f1.damage < f2.damage){ reporter(f2, f1, f2); 1}
    else {
      if(UtilityMethods.generateNumber(2) equals(0)){ 
        reporter(f1, f1, f2); 0
        }
      else reporter(f2, f1, f2); 1
    }
  }
  
  def reporter(winner: Fighter, f1: Fighter, f2: Fighter): Unit = {
    println(f1)
    println(" VS ")
    println(f2)
    println("--------")
    println(Battle.WIN_MSG + winner.id)
    println("--------")
    
  }
  
  object Battle{
    val WIN_MSG: String = " WIN "
    val LOS_MSG: String = " LOSES "
  }
  
}