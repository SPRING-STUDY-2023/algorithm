package programmers.lv0

class Solution {
    fun solution(box: IntArray, n: Int): Int {
        val width = box[0]
        val height = box[1]
        val depth = box[2]

        val x = width / n
        val y = height /  n
        val z = depth / n

        var answer: Int = x * y * z
        return answer
    }
}

class Printer {
    fun main() {
        val sol = Solution()
        val box = intArrayOf(10, 8, 6)
        val n = 3
        println(sol.solution(box, n))
    }
}
