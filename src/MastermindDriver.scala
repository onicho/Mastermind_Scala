import com.google.inject.Guice


object MastermindDriver {
  def main(args: Array[String]) {

    val injector = Guice.createInjector(new DependencyModule())

    val g1 = injector.getInstance(classOf[Game])

    g1.runGames
  }
}