package us.plee19.bignums;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.*;

/**
 * Main method to illustrate use of BigInteger and BigDecimal.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        BigInteger wisconsin = new BigInteger("5726398");
        BigInteger california = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        BigInteger wicaMultiply;
        BigInteger texasMultiply;
        BigDecimal cost = new BigDecimal(3.23);
        BigDecimal texasMultiplyCost;
        wicaMultiply = wisconsin.multiply(california);
        System.out.println("Number of letters, WI -> CA: " + wicaMultiply);
        texasMultiply = wicaMultiply.multiply(texas);
        System.out.println("Number of letters for TX to get a copy of all: " + texasMultiply);
        BigDecimal texasMultiplyDecimal = new BigDecimal(texasMultiply);
        texasMultiplyCost = texasMultiplyDecimal.multiply(cost);
        texasMultiplyCost = texasMultiplyCost.setScale(2, ROUND_HALF_UP);
        System.out.print("Total cost to print all Texas letters: $" + texasMultiplyCost);
    }
}