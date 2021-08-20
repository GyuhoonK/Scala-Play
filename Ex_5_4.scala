object Ex_5_3{ // CALL-BY-NAME
    def main(args:Array[String]) = {
        dropship(people(5))
    }
    def people(n: Int) = {
        println("Start boading")
        n
    }
    def dropship(n: => Int) ={ // 바깥에 있는 함수 먼저 실행했다가, 매개변수가 필요할 때 그것을 사용(무슨 말??) 
                               // => : scala는 매개변수로 함수를 사용할 수 있기에, 이를 표현해주는 방법
         println("Ready . . . ")
        println(n + " people on boarding") // 즉 이 시점에, people 함수가 dropship 내부로 가져와져서 실행된다
                                           
    }
}

// 실행 결과 : dropship -> people -> dropship
// Ready . . . 
// Start boading
// 5 people on boarding