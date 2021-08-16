object Ex_2_2{
    def main(args: Array[String]): Unit = {
        var a : Int = 5 // 자료형 명시, a에 즉시 5를 저장함
        var b = a // b의 메모리 공간에 a에 저장된 값(5)을 저장함
        a = 10 // a의 메모리 공간에 저장된 값을 10으로 바꿈
        println(a)
        println(b) // b의 메모리 공간에 저장된 값은 변하지 않음

        // type 예약어를 통한 자료형 별칭화
        type Name = String
        type Person = (String, Int)
        type FType = String => Int // 함수 표현식
        val name: Name = "KimGyuHoon"
        val person: Person = ("KimGyuHoon", 24)
        val f: FType = text => text.toInt // text라는 이름의 매개변수를 받는 함수를 정의함
    }
}


