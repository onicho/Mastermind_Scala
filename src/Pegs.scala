
/**
//  * Created by ONicholls on 05/03/2016.
//  */

import scala.collection.mutable.ListBuffer
import com.google.inject.ImplementedBy


/**
  * Pegs info for the game grid
  * Pegs tell a player whether guessed colours are present in the secret code (White peg)
  * and whether some of the guessed colours are present and  exactly match a position of a colour in the secret code (Black peg)
  */

@ImplementedBy(classOf[Grid])
trait Pegs {

  /**
    * Checking colours in the user guess against the colours of secret code to generate pegs information
    * @param code -  the secret code of the game
    * @param guess - user's guess
    * @return - A string that contains Pegs information
    *
    */

  def checkingCode(code: ListBuffer[Colour], guess: ListBuffer[Colour]): String = {

    val codeCopy = code
    var pegInfo = new ListBuffer[String]

    // staring with "Black pegs"
    for (i <- Range(0, 4)) {
      if (guess(i) == codeCopy(i)) { // if a Colour of index i in user's guess matches a colour of index i in the code
        pegInfo = pegInfo :+ "Black" // string "Black" that represent a black peg will be added to the pegInfo
        guess(i).matched = true // the matched value of a colour will be changed to true, so it does not get assessed
        // again when "screening" for white pegs
      }
    }
    for (i <- Range(0, 4)) {
      if (!guess(i).matched && codeCopy.contains(guess(i))) { //reads "if not matched and the colour is present in the secret code "
        pegInfo = pegInfo :+ "White" // string "White" that represent a white peg will be added to the pegInfo

      }
    }

    pegInfo.result().mkString(" ")
  }
}


