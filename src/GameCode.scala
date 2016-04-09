
import scala.collection.mutable.ListBuffer
import scala.util.Random


class GameCode {

  val ourcolours = GameColours.gcol
  var basecode = new ListBuffer[Colour]
  val code = generateCode


  def generateCode: ListBuffer[Colour] = {

    for (i <- Range(0, 4)) {

      basecode = basecode :+ ourcolours(Random.nextInt(5))
    }

      basecode

  }

}

