import com.google.inject.AbstractModule
import com.google.inject.name.Names

/**
  * Created by ONicholls on 16/03/2016.
  */
class DependencyModule extends AbstractModule{

  def configure: Unit ={

    bind(classOf[TColourMaker]).to(classOf[ColourMaker])
    bind(classOf[Game]).to(classOf[TheGame])

    bind(classOf[Boolean]).annotatedWith(Names.named("ShowCode")).toInstance(true)
  }
}
