
import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ONicholls on 09/04/2016.
  */
class ColourMakerTest extends FlatSpec with MockFactory with Matchers{


  "ColourMaker" should
    "return a new Colour object with the name that is passed to it at construction" in{

    val colourmaker = new ColourMaker

    colourmaker.CreateColour('G') should be (Colour("G"))
    colourmaker.CreateColour('B') should be (Colour("B"))
    colourmaker.CreateColour('Y') should be (Colour("Y"))
    colourmaker.CreateColour('R') should be (Colour("R"))
    colourmaker.CreateColour('O') should be (Colour("O"))
    colourmaker.CreateColour('P') should be (Colour("P"))

  }



}
