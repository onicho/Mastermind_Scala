
import scala.collection.mutable.ListBuffer
import scala.util.Random


class GameCode {

  val ourcolours = GameColours.gcol
  var basecode = new ListBuffer[Colour]
  val code = generateCode


  def generateCode: ListBuffer[Colour] = {
    //do we want it to return a string?
    for (i <- Range(0, 4)) {

      basecode = basecode :+ ourcolours(Random.nextInt(5))
    }
    //println(finalcode) //need to remove afterwards
      basecode

  }

}

//}

//  object GameCode {
//
//    def apply  = new GameCode
//    apply.code
//
//
////    val sc = new GameCode
////    val sctest = sc.generateCode
//
//   // println(sctest)
//
//}
