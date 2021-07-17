object Ex_3_3{
    def main(args: Array[String]): Unit = {
        for(x <- -1 to 10) // x 선언이 없어도 x 자동으로 초기화됨, to 는 <= 와 동일
            println("x : " + x)
    }
}