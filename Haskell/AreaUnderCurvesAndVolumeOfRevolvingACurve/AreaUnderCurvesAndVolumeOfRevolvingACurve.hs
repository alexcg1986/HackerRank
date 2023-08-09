-- Definite Integrals via Numerical Methods
--
-- This relates to definite integration via numerical methods.
--
-- Consider the algebraic expression given by:
--
-- (a1)x^b1 + (a2)x^b2 + (a3)x^b3... (an)x^bn
--
-- For the purpose of numerical computation, the area under the curve y = f(x) between the limits a and b can be computed by the Limit Definition of a Definite Integral.
--
-- Here is some background about areas and volume computation.
--
-- Using equal subintervals of length = 0.001, you need to:
--
-- 1. Evaluate the area bounded by a given polynomial function of the kind described above, between the given limits of L and R.
--
-- 2. Evaluate the volume of the solid obtained by revolving this polynomial curve around the x-axis.
--
-- A relative error margin of 0.01 will be tolerated.
--
-- Input Format
-- The first line contains N integers separated by spaces, which are the values of a1, a2, a3... an.
-- The second line contains N integers separated by spaces, which are the values of b1, b2, b3... bn.
-- The third line contains two space separated integers, L and R, the lower and upper range limits in which the integration needs to be performed, respectively.
--
-- Constraints
-- -1000 <= a <= 1000
-- -20 <= b <= 20
-- 1 <= L < R <= 20
--
-- Output Format
-- The first line should contain the area between the curve and the x-axis, bound between the specified limits.
-- The second line should contain the volume of the solid obtained by rotating the curve around the x-axis, between the specified limits.
--
-- Sample Input
-- 1 2 3 4 5
-- 6 7 8 9 10
-- 1 4
--
-- Sample Output
-- 2435300.3
-- 26172951168940.8
--
-- Explanation
-- The algebraic expression represented by:
-- (1)x^6 + (2)x^7 + (3)x^8 + (4)x^9 + (5)x^10
--
-- We need to find the area of the curve enclosed under this curve, between the limits  and . We also need to find the volume of the solid formed by revolving this curve around the -axis between the limits  and .

eval :: [(Double, Double)] -> Double -> Double
eval poly x = sum $ map (\(a, b) -> a * (x ** b)) poly

area :: Double -> Double -> Double -> [(Double, Double)] -> Double
area dx a b poly = sum [dx * eval poly x | x <- [a, a + dx .. b]]

volume :: Double -> Double -> Double -> [(Double, Double)] -> Double
volume dx a b poly = sum [dx * pi * eval poly x ** 2 | x <- [a, a + dx .. b]]

solve :: ([(Double, Double)], Double, Double) -> [Double]
solve (poly, l, r) = [area 0.001 l r poly, volume 0.001 l r poly]

processInput :: [Double] -> ([(Double, Double)], Double, Double)
processInput xs = (zip a b, head range, range !! 1)
  where
    coeffLength = div (length xs - 2) 2
    a = take coeffLength xs
    b = take coeffLength (drop coeffLength xs)
    range = drop (2 * coeffLength) xs

processInput' :: [Double] -> ([(Double, Double)], Double, Double)
processInput' xs =
  let coeffLength = div (length xs - 2) 2
      a = take coeffLength xs
      b = take coeffLength (drop coeffLength xs)
      range = drop (2 * coeffLength) xs
   in (zip a b, head range, range !! 1)

main :: IO ()
main = interact $ unlines . map show . solve . processInput . map read . words
