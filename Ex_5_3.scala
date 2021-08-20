object Ex_5_3{ // CALL-BY-VALUE
    def main(args:Array[String]) = {
        dropship(people(5))
    }
    def people(n: Int) = {
        println("Start boading")
        n
    }
    def dropship(n: Int) ={
        println("Ready . . . ")
        println(n + " people on boarding")
    }
}
// 실행 결과 : people -> dropship
// Start boading
// Ready . . . 
// 5people on boarding