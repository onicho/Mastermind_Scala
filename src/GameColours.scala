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

  addColour(new Colour("blue"))
  addColour(new Colour("green"))
  addColour(new Colour("orange"))
  addColour(new Colour("purple"))
  addColour(new Colour("red"))
  addColour(new Colour("yellow"))

}

//object test extends App{
//
//  println(GameColours.gcol)
//
//}
//
