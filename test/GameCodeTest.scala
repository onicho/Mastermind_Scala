
import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}


/**
  * Created by ONicholls on 05/04/2016.
  */
class GameCodeTest extends FlatSpec with MockFactory with Matchers {

  "GameCode" should
    "return a new game code, which is a ListBuffer containing four random colour objects " +
    "it will be the actuall game code that a player needs to crack" in{

    val gamecode = new GameCode

    gamecode.generateCode should be (gamecode.basecode)
    gamecode.code.length should be (4)

    for(i <- gamecode.code) {

      assert(i.isInstanceOf[Colour])

    }

  }




}








