
trait TColourMaker  {

  def CreateColour(char: Char) : Colour
}

class ColourMaker extends TColourMaker
{
  override def CreateColour(char: Char): Colour = {
    new Colour(char.toString)
  }
}