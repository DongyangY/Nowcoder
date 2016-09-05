public class Solution {
    public double Power(double base, int exponent) {
	double result = PowerHelper(base, Math.abs(exponent));
	return exponent > 0 ? result : 1 / result;
    }

    public double PowerHelper(double base, int exponent) {
	if (exponent == 0) return 1;
	if (exponent == 1) return base;

	double half = Power(base, exponent / 2);
	return exponent % 2 == 0 ? half * half : half * half * base;
    }
}
