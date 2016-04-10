import com.google.inject.AbstractModule
import com.google.inject.name.Names


/**
  * Class for configuring the dependency module and bindings
  */

class DependencyModule extends AbstractModule{

  def configure: Unit ={
    import scala.swing.event.Key

    bind(classOf[TColourMaker]).to(classOf[ColourMaker])
    bind(classOf[Game]).to(classOf[TheGame])

    //by changing the .toInstance value the secret game code will be shown / not shown
    // true - secret code is shown (testing mode)
    // false - secret code is hidden (game mode)
    bind(classOf[Boolean]).annotatedWith(Names.named("ShowCode")).toInstance(true)

    bind(classOf[Grid]).annotatedWith(Names.named("gr")).toInstance(new Grid)


  }


}
