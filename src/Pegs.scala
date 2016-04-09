

/**
//  * Created by ONicholls on 05/03/2016.
//  */

import scala.collection.mutable.ListBuffer


trait Pegs {

  def checkingCode(code: ListBuffer[Colour], guess: ListBuffer[Colour]): String = {

    val codeCopy = code
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


