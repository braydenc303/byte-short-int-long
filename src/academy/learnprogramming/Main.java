package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //If you exceed the min or max value, java will circle back around to the opposite end of the range.
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        //When setting a variable equal to an operation, java assumes the answer will be an int. Therefore in the firstexample here, there is no error. However, in order to prevent an error in the following two examples, we must explicitly tell java what type of number to expect. This is called casting. You do so by preceding the operation with the name of the type wrapped in parentheses and a space.
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue /2);

        byte myChallengeByte = 82;
        short myChallengeShort = 15000;
        int myChallengeInt = 5;
        //We do not seem to get the casting error with long.
        long myChallengeLong = 50000 + 10 * (myChallengeByte + myChallengeShort + myChallengeInt);

        System.out.println("myChallenge:" + myChallengeLong);
    }
}