class Solution {

    public String numberToWords(int n) {

        String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"
        };

        if (n == 0) return "Zero";

        if (n < 20)
            return ones[n];

        if (n < 100)
            return tens[n / 10] + " " + numberToWords(n % 10);

        if (n < 1000)
            return ones[n / 100] + " Hundred " + numberToWords(n % 100);

        if (n < 1_000_000)
            return numberToWords(n / 1000) + " Thousand " + numberToWords(n % 1000);

        if (n < 1_000_000_000)
            return numberToWords(n / 1_000_000) + " Million " + numberToWords(n % 1_000_000);

        return numberToWords(n / 1_000_000_000) + " Billion " + numberToWords(n % 1_000_000_000);
    }
}
