object Ex_4_6{
    def main(args:Array[String]): Unit = {
        val dog = new Animal
        dog.swim
        dog.fly
        dog.run
        
        val pig = new Animal2
        pig.eat

        val pig2 = new Animal3
        pig2.eat
    }
}
class Animal extends Swimming with Flying with Running
class Animal2 extends Eating{
    def eat = println("먹습니다 야미")
}
class Animal3 extends Eating{
    def eat = println("먹습니다 YUMMY")
}

trait Swimming{
    def swim = println("수영을 합니다")
}
trait Flying{
    def fly = println("하늘을 납니다")
}
trait Running{
    def run = println("달립니다")
}

trait Eating{
    def eat
}