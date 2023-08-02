-- You are given a list of N elements. Reverse the list without using the reverse function. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

-- Input Format
-- Each element, X, of the list is displayed on a separate line.

-- Output Format
-- The output is the reverse of the input list.

-- Sample Input
-- 19
-- 22
-- 3
-- 28
-- 26
-- 17
-- 18
-- 4
-- 28
-- 0

-- Sample Output
-- 0
-- 28
-- 4
-- 18
-- 17
-- 26
-- 28
-- 3
-- 22
-- 19

-- Method Signature
-- Number Of Parameters: 1
-- Parameters: [list]
-- Returns: List or Vector

-- Constraints
-- 1 <= N <= 100
-- 0 <= X <= 100

-- You have to read input from standard input and write output to standard output. Please follow the input/output format mentioned above.

-- NOTE: You only need to submit the code above after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.

rev :: [Int] -> [Int]
rev l = [l !! i | i <- [length l - 1, length l - 2 .. 0]]

rev' :: [Int] -> [Int]
rev' l = [last l, last l - 1 .. head l]

main :: IO ()
main = interact $ unlines . map show . rev . map read . words