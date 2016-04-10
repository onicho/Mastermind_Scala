import com.google.inject.ImplementedBy



@ImplementedBy(classOf[ColourMaker])
trait TColourMaker  {

  def CreateColour(char: Char) : Colour
}

/**
  * This class creates new Colour objects with a new name
  */

class ColourMaker extends TColourMaker
{
  override def CreateColour(char: Char): Colour = {
    new Colour(char.toString)
  }
}