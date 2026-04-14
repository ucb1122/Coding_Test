import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        return combination(balls, share);
    }

    private BigInteger combination(int balls, int share) {
        return factorial(balls).divide(factorial(share).multiply(factorial(balls - share)));
    }

    private BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}