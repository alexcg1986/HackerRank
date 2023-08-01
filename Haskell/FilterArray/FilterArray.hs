-- Filter a given array of integers and output only those values that are less than a specified value X. The output integers should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For the rest of the languages, you have to write a complete code.

-- Input Format
-- The first line contains the delimiter X.
-- The next B lines each contain an integer, which represents the elements of the list/array. You have to read the input to the End-Of-File.

-- Output Format
-- Print all the integers from the array that are less than the given upper limit X in value on separate lines. The sequence should be the same as it was in the original array.

-- Constraints
-- 1 <= B <= 100
-- For any element Y in the array, -100 <= Y <= 100
-- - 100 <= X <= 100

-- Note
-- The purpose of this challenge is to learn how to write your own implementation of a filter function. We recommend not using the inbuilt library function.

-- Sample Input
-- 3
-- 10
-- 9
-- 8
-- 2
-- 7
-- 5
-- 1
-- 3
-- 0

-- Sample Output
-- 2
-- 1
-- 0

-- Recommended Method Signature
-- Number Of Parameters: 2
-- Parameters: [upper-limit(X) list]
-- Returns: List or Vector

-- You have to read input from standard input and write output to standard output. Please follow the input/output format mentioned above.

-- NOTE: You only need to submit the code above after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.

processInput :: Int -> [Int] -> [Int]
processInput n xn = [x | x <- xn, x < n]

main :: IO ()
main = interact $ unlines . map show . (\(x : xs) -> processInput x xs) . map read . words