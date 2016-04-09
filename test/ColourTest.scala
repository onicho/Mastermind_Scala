import org.scalatest.FunSuite
import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ONicholls on 09/04/2016.
  */


class ColourTest extends FlatSpec with MockFactory with Matchers  {


  "Colour" should
    "return a string name of that particular Colour (when toString is called)" +
    "rerutn the name of the colour obeject (when getName is called "  in{

    Colour("Y").toString() should be ("Y")
    Colour("R").toString() should be ("R")
    Colour("B").getName() should be ("B")
  }


}
