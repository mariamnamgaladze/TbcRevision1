class Math {
    fun lcm(n1: Int, n2: Int): String {
        var lcm: Int = if (n1 > n2) n1 else n2

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                return ("The LCM of $n1 and $n2 is $lcm.")
                break
            }
            ++lcm
        }
    }
    fun gcd(n1: Int, n2: Int): String {

        var gcd = 1

        var i = 1
        while (i <= n1 && i <= n2) {

            if (n1 % i == 0 && n2 % i == 0)
                gcd = i
            ++i
        }

        return ("G.C.D of $n1 and $n2 is $gcd")
    }

    fun containsDollarSignOrNot(string: String): Boolean {
        return string.contains("$")
    }

    fun recursion(number: Int = 100): Int {
        return if (number == 1) {
            return 1
        } else recursion(number - 1) + number
    }

    fun reverse(Int: Int): Int {
        return Int.toString().reversed().toInt()
    }

    fun polyndrom(num: String) {
        if (num == num.reversed()) {
            return polyndrom("yes it is")
        } else polyndrom("no it isnot")
    }

}