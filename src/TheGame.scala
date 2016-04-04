import com.google.inject.Inject
import com.google.inject.name.Named


class TheGame (colourMaker: ColourMaker) extends Game {
  private var showCode: Boolean = false

  /**
    * Create a Game object.
    *
    * @param easy If easy is true the secret code will be
    *             revealed at all times when playing the game. If easy is
    *             false the secret code is not revealed until correctly guessed
    *             or the player runs out of turns.
    */
  @Inject
  def this(@Named("ShowCode") easy: Boolean, colourMaker: ColourMaker) {
    this(colourMaker)
    showCode = easy
    ShowCode()
  }

  def ShowCode() ={
    if (showCode == true) gr.codestring = gr.code
  }

  override def gameflow() {
    var Win = false

    while (!Win && gr.guessCounter < 12) {
      val userGuess = new UserGuess(colourMaker)
      val guess = userGuess.sendInput()
      gr.insertGuess(gr.guessCounter, guess)
      gr.printgrid()
      println("")
      if (gr.lastPegs == "Black Black Black Black") {
        Win = true
        println(s"Congrats. You won with ${gr.guessCounter} guesses")
      }

      if (gr.guessCounter == 12 && gr.lastPegs != "Black Black Black Black") {
        println("")
        println("You suck!!")
      }
    }
  }
}

