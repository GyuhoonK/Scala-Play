object Ex_5_3{ 
    def main(args:Array[String]) = {
        val thisYear=2016
        val fixedValueFunction=go(thisYear, _: String)
        fixedValueFunction("test1")
        fixedValueFunction("test2")
        fixedValueFunction("test3")
    }
    def go(thisYear: Int, string: String)={
        println(string + ":" + thisYear)
    }                 
}

