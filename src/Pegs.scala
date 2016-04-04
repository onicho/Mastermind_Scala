

/**
//  * Created by ONicholls on 05/03/2016.
//  */

import scala.collection.mutable.ListBuffer

trait Pegs {

  def checkingCode(code: ListBuffer[Colour], guess: ListBuffer[Colour]): String = {

    var codeCopy = code
    var pegInfo = new ListBuffer[String]

    for (i <- Range(0, 4)) {
      if (guess(i) == codeCopy(i)) {
        pegInfo = pegInfo :+ "Black"
        guess(i).matched = true
      }
    }
    for (i <- Range(0, 4)) {
      if (!guess(i).matched && codeCopy.contains(guess(i))) { //reads "if not matched and "
        pegInfo = pegInfo :+ "White"

      }
    }

    pegInfo.result().reverse.mkString(" ")
  }
}






//import scala.collection.mutable.ListBuffer
//
//trait Pegs {
//
//  def checkingCode(code: String, guess: String): String = {
//
//    var pegInfo = new ListBuffer[String]
//    for (item <- guess) {
//      if (code.contains(item)) {
//        if (code.indexOf(item) == guess.indexOf(item)) {
//          pegInfo = pegInfo :+ "Black"
//        } else {
//          pegInfo = pegInfo :+ "White"
//        }
//      }
//    }
//
//    pegInfo.result().mkString(" ")    // instead of toString
//
//
//  }
//
//}
//




//import scala.collection.mutable.ListBuffer
//
//trait Pegs {
//
//  def checkingCode(code: String, guess: String): String = {
//
//    var pegInfo = new ListBuffer[String]
//    for (item <- guess) {
//      if (code.contains(item)) {
//        if (code.indexOf(item) == guess.indexOf(item)) {
//          pegInfo = pegInfo :+ "Black"
//        } else {
//          pegInfo = pegInfo :+ "White"
//        }
//      }
//    }
//
//    (pegInfo.result()).mkString(", ")    // instead of toString
//
//
//  }
//
//
//}
