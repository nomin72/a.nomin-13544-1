/**
 *  lab1 : Write a recursive function to get the nth Fibonacci number 
   def fib(n: Int): Int
*/
def fib(n: Int): Int = {
    def go(n: Int, first: Int, second: Int): Int =
      if(n == 1) first
      else if (n == 2) second
      else go(n-1, second, first + second)
    go(n, 0, 1)
  }

/**
 * res26: Int = 0
@ fib(2)
res27: Int = 1
@ fib(3)
res28: Int = 1
@ fib(4)
res29: Int = 2
@ fib(5)
res30: Int = 3
@ fib(10)
res31: Int = 34 
 */
