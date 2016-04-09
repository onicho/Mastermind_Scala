import com.google.inject.Inject
import com.google.inject.name.Named


class TheGame (colourMaker: ColourMaker) extends Game {
  private var showCode: Boolean = false


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
        println(s"Well done! You've won with ${gr.guessCounter} guesses")
      }

      if (gr.guessCounter == 12 && gr.lastPegs != "Black Black Black Black") {
        println("")
        println("Game is over. You did not crack the Secret Code. ")
        println(s"The Secret code was ${gr.code.result().mkString}")
      }
    }




  }
}

