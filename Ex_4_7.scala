// 추상 클래스를 이용한 trait

object Ex_4_7{
    def main(args:Array[String]):Unit = {
        val pig1 = new Pig
        pig1.eat
        pig1.shout
        pig1.run
    }
}

class Pig extends Animal with Swimming with Flying with Running{
    def shout = println("소리 질러버리기~~ <- 추상 클래스로부터 정의됨")
    def eat = println("먹어 버리기~~ <- trait으로부터 정의됨")
}

abstract class Animal{
    def shout
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