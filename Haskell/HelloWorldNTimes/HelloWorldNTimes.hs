-- Print "Hello World" N amount of times. The input portion will be handled automatically. You need to write a function with the recommended method signature.

-- Input Format
-- A single line of input containing integer , the number of times to print "Hello World".

-- Output Format
-- Output  lines, each containing "Hello World".

-- Constraints
-- 0 <= N <= 50

-- Sample Input
-- 4

-- Sample Output
-- Hello World
-- Hello World
-- Hello World
-- Hello World

-- Recommended Method Signature
-- Number Of Parameters: 1
-- Parameters: [n]
-- Returns: nil

-- You have to read input from standard input and write output to standard output. Please follow the input/output format mentioned above.

-- NOTE: You only need to submit the code above, after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.
import Control.Monad (replicateM_)

main :: IO ()
main = getLine >>= (\n -> replicateM_ (read n :: Int) $ putStrLn "Hello World")