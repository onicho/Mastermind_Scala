import org.scalatest.FunSuite
import scala.collection.mutable.ListBuffer

class GridTest extends FunSuite {

  val grid = new Grid
  var x = new ListBuffer[Colour]
  x = x += Colour("Y")
  x = x += Colour("R")
  x = x += Colour("B")
  x = x += Colour("O")

test("testStringify"){

  assert(grid.stringify(x) == "YRBO")

}

test("insertGuess"){

  grid.insertGuess(5,x)
  assert(grid.grid(5).result().mkString == "YRBO")

}

test("guessCounter"){

  grid.guessCounter = 0
  grid.updateCount()
  assert(grid.guessCounter ==  1)

}
//trait Pegs
test("checkingCode") {

  var code = new ListBuffer[Colour]
  code = code += Colour("Y")
  code = code += Colour("B")
  code = code += Colour("P")
  code = code += Colour("G")


  //code  YBPG
  //guess YRBO

  grid.checkingCode(code = code, guess = x) == "Black, White"



}


}


