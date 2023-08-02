-- You are given a list. Return the sum of odd elements from the given list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

-- Constraints
-- The list will have 1-100 elements.
-- Each element will be an integer X where -100 <= X <= 100.

-- Sample Input
-- 3
-- 2
-- 4
-- 6
-- 5
-- 7
-- 8
-- 0
-- 1

-- Sample Output
-- 16

-- Method Signature
-- Number Of Parameters: 1
-- Parameters: [list]
-- Returns: Number

-- You have to read input from standard input and write output to standard output. Please follow the input/output format mentioned above.

-- NOTE: You only need to submit the code above after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.

processInput :: [Int] -> [Int]
processInput = filter odd

main :: IO ()
main = interact $ show . sum . processInput . map read . words