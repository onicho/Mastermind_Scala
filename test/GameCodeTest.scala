
import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}


/**
  * Created by ONicholls on 05/04/2016.
  */
class GameCodeTest extends FlatSpec with MockFactory with Matchers {

  "GameCode" should
    "return a new game code, which is a ListBuffer containing four random colour objects " in{

    val gamecode = new GameCode

    gamecode.code.length should be (4)
    gamecode.generateCode should be (gamecode.basecode)
    gamecode.code should be (gamecode.code)

    for(i <- gamecode.code) {

      assert(i.isInstanceOf[Colour])

    }

  }




}








