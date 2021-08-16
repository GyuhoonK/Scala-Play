object Ex_1_1 { // object 는 싱글턴 객체이다 : 하나의 인스턴스만을 가지는 클래스, 즉 Ex_1_1이라는 클래스와 클래스의 인스턴스를 동시에 정의하고 있다
    def main(args: Array[String]): Unit = { // 프로그램의 시작을 알리는 메인 메서드를 선언 
                                            // Unit <- 반환형;  java의 void와 같다
            println("Hello, Scala") // 매개변수를 출력
        }
    }