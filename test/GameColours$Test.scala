import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ONicholls on 09/04/2016.
  */
class GameColours$Test extends FlatSpec with MockFactory with Matchers {


  "GameColours" should
  "This is where new colours with new names can be added to the game palette " +
  "or removed from the game palette" in {

    GameColours.gcol.length should be (6)
    GameColours.gcol(0) should be (Colour("blue"))
    GameColours.gcol.toList should be (List[Colour](Colour("B"),
                                                    Colour("G"),
                                                    Colour("O"),
                                                    Colour("P"),
                                                    Colour("R"),
                                                    Colour("Y")))


    GameColours.addColour(Colour("amber"))
    GameColours.gcol(6) should be (Colour("A"))

    GameColours.removeColour(Colour("amber"))
    GameColours.gcol.size should be (6)

  }




}
