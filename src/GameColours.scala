

import scala.collection.mutable.ListBuffer


/**
  * This is a game palette
  * New colour objects with dfferent names can be added to the palette or removed
  */

object GameColours {


  var gcol = new ListBuffer[Colour]

// adding new colours
  def addColour(colour: Colour)= {
    gcol = gcol += colour
  }

  //removing colours
  def removeColour(colour: Colour)= {
    gcol = gcol -= colour
  }

//at present the game palette consists of 6 different colours

  addColour(Colour("blue"))
  addColour(Colour("green"))
  addColour(Colour("orange"))
  addColour(Colour("purple"))
  addColour(Colour("red"))
  addColour(Colour("yellow"))


}
