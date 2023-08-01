getNthFibonacci :: Int -> Int
getNthFibonacci 1 = 0
getNthFibonacci 2 = 1
getNthFibonacci n = getNthFibonacci (n - 1) + getNthFibonacci (n - 2)

getFibonacciSeries :: Int -> [Int]
getFibonacciSeries 0 = []
getFibonacciSeries n = getFibonacciSeries (n - 1) ++ [getNthFibonacci n]

main :: IO ()
main = print $ getNthFibonacci 5