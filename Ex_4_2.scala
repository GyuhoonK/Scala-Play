object Ex_4_2{
    def main(args:Array[String]):Unit={
        val apple = new Fruit("사과")
        println(apple.name)
    }
}

class Fruit(input:String){
    var name = input
}

// 아래 코드와 같음

class Fruit(name:String) // name variable이 private로 선언되는 문제가 있음

case class Fruit(name:String) // case를 통해 자동으로 name 변수를 생성하며, 외부 접근이 가능하도록 셋팅됨