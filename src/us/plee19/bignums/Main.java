package us.plee19.bignums;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.*;

public class Main {

    public static void main(String[] args) {
        BigInteger wisconsin = new BigInteger("5726398");
        BigInteger california = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        BigInteger wicaMultiply;
        BigInteger texasMultiply;
        BigDecimal cost = new BigDecimal(3.23);
        BigDecimal texasMultiplyCost;
        System.out.print("Number of letters, WI -> CA: ");
        wicaMultiply = wisconsin.multiply(california);
        System.out.println(wicaMultiply);
        texasMultiply = wicaMultiply.multiply(texas);
        System.out.print("Number of letters for TX to get a copy of all: " + texasMultiply);
        BigDecimal texasMultiplyDecimal = new BigDecimal(texasMultiply);
        texasMultiplyCost = texasMultiplyDecimal.multiply(cost);
        texasMultiplyCost = texasMultiplyCost.setScale(2, ROUND_HALF_DOWN);
        System.out.print("Total cost to print all Texas letters: $" + texasMultiplyCost);
    }
}