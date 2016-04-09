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


}


