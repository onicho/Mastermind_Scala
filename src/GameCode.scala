
import scala.collection.mutable.ListBuffer
import scala.util.Random


/**
  * Secret code for the Mastermind game, which a player needs to crack.
  */

class GameCode {

  val ourcolours = GameColours.gcol // palette of the game colours
  var basecode = new ListBuffer[Colour]
  val code = generateCode //the secret code of the game


  /**
    * Chooses 4 random colours from the game palette to make a secret code for the game
    * @return - a ListBuffer with four random colour objects
    */
  def generateCode: ListBuffer[Colour] = {

    for (i <- Range(0, 4)) {

      basecode = basecode :+ ourcolours(Random.nextInt(5))
    }

      basecode

  }

}

