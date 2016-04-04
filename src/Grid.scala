
/**
  * Created by ONicholls on 05/03/2016.
  */




class Grid extends GameCode with Pegs{

  import scala.collection.mutable.ListBuffer

  val secretCode = code
  var grid = Array.fill(12){new ListBuffer[Colour]}
  var guessCounter: Int = 0
  var lastPegs: String = ""
  val elementsString = "...."
  var codestring = new ListBuffer[Colour]

  def stringify(row: ListBuffer[Colour]) = row.result().mkString

  def printgrid() = {
    if(codestring.size > 0) {println(stringify(codestring) + " Secret Code")
    } else {println(elementsString + " Secret Code")}
    for (row <- grid){
      if(row.length == 0) {
        println(elementsString)
      } else {
        val check = checkingCode(secretCode,row)
        lastPegs = check
        if (check.length() > 0) {
          println(stringify(row) + " result: " + check)
        } else {
          println(stringify(row) + " result: No Pegs")
        }
      }
    }
  }

  def insertGuess(index: Int, guess: ListBuffer[Colour]) = {
    grid.update(index,guess)
    updateCount()
  }

  def updateCount() = {
    guessCounter += 1
  }




}

































//class Grid extends GameCode with Pegs{
//
//  val secretCode = code
//  var grid: List[String] = List.range(1,13).map(num => "." *4)  // TAKE OUT THE SPACE
//  var guessCounter: Int = 0
//  var lastPegs: String = ""
//  var codeString = "...."
//
//  //
//  //
//  //  def gridRows = {
//  //
//  //    val Rows = grid.map(num => ". " *4)
//  //    Rows
//  //  }
//
//  def printgrid(listofrows:List[String]) = {
//    println(codeString + " Secret Code")
//    for (row <- listofrows){
//      if(row.equals("....")) {
//        println(row)
//      } else {
//        val check = checkingCode(secretCode,row)
//        lastPegs = check
//        if (check.length() > 0) {
//          println(row + " result: " + check)
//        } else {
//          println(row + " result: No Pegs")
//        }
//      }
//    }
//  }
//
//  def insertGuess(index: Int, guess: String) = {
//    grid = grid.updated(index,guess)
//    updateCount()
//  }
//
//  def updateCount() = {
//    guessCounter += 1
//  }
//}
//
//object Grid extends App {
//  def apply = new Grid
//}







///**
//  * Created by ONicholls on 05/03/2016.
//  */
//class Grid extends GameCode with Pegs{
//
//
//  val secretcode = code
//  var grid: List[String] = List.range(1,13).map(num => "." *4)
//  var guessCounter: Int = 0
//  var lastPegs: String = ""
//
//
////
////
////  def gridRows = {
////
////    val Rows = grid.map(num => ". " *4)
////    Rows
////  }
//
//  def printgrid(listofrows:List[String]) = {
//    println(code + "Secret Code") ///?????????? WHY
//    for (row <- listofrows){
//      if(row.equals("....")) {
//        println(row)
//      } else {
//        val check  = checkingCode(secretcode,row)
//        lastPegs = check
//        if (check.length() > 0) {
//          println(row + " result: " + check)
//        } else {
//          println(row + " result: No Pegs")
//        }
//      }
//
//    }
//  }
//
//  def insertGuess(index: Int, guess: String) = {
//    grid = grid.updated(index,guess)
//    updateCount()
//  }
//
//  def updateCount() = {
//    guessCounter += 1
//  }
//
//}
//
//
//object Grid extends App {
//  def apply = new Grid
//}
//

//object Grid extends App{
//
//  def apply  = new GameGrid
//  val g = new GameGrid
//  var UpdateGrid = g.gridRows
//
//  g.printgrid(UpdateGrid)
//  val userI = userInputTaker
//
//
//  UpdateGrid = g.insertGuess(this.UpdateGrid, g.guessCounter, userI.sendInput())
//  g.updateCount()
//  g.printgrid(UpdateGrid)
//  UpdateGrid = g.insertGuess(this.UpdateGrid,g.guessCounter, userI.sendInput())
//  g.printgrid(UpdateGrid)
//



