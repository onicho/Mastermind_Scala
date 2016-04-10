/**
  * Created by ONicholls on 05/03/2016.
  */


/**
  * The object colour that forms a palette of the mastermind game. Each colour has a different name
  * @param name - name of of the colour
  *
  */

class Colour (name: String) {

  /**
    * A string name of the colour object
    * @return - a string hich is a capital letter of the colour name, e.g. "Y"
    */

    override def toString() : String = name.split("").headOption.mkString.toUpperCase

  // the variable matched was added to simplify logic used by Pegs.
  // If Pegs have already matched the colour and generated a black peg,the matched status will change to 'true' and the colour will be ignored during "white pegs checking"
    var matched = false

  override def equals(obj: scala.Any): Boolean = {
    obj.asInstanceOf[Colour].getName().split("").headOption.mkString.toUpperCase ==
      name.split("").headOption.mkString.toUpperCase
  }

  def getName() :String = name
}

object Colour {

  def apply(name:String) = new Colour(name)

}
