/**
  * Created by ONicholls on 05/03/2016.
  */

import scala.collection.mutable.ListBuffer

object GameColours {



  var gcol = new ListBuffer[Colour]


  def addColour(colour: Colour)= {
    gcol = gcol += colour
  }

  def removeColour(colour: Colour)= {
    gcol = gcol -= colour
  }


  addColour(Colour("blue"))
  addColour(Colour("green"))
  addColour(Colour("orange"))
  addColour(Colour("purple"))
  addColour(Colour("red"))
  addColour(Colour("yellow"))


}

object test extends App{

  println(GameColours.gcol)
  println(GameColours.gcol(1).getClass)

}

