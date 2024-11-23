package Problems_On_String;

import java.util.*;
//https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {
public int romanToInt(String s) {

Map<Character, Integer> romanMap = new HashMap<>();
romanMap.put('I', 1);
romanMap.put('V', 5);
romanMap.put('X', 10);
romanMap.put('L', 50);
romanMap.put('C', 100);
romanMap.put('D', 500);
romanMap.put('M', 1000);

int result = 0;
int prevValue = 0;


for (int i = s.length() - 1; i >= 0; i--) {
int currentValue = romanMap.get(s.charAt(i));


if (currentValue < prevValue) {
result -= currentValue;
} else {

result += currentValue;
}


prevValue = currentValue;
}

return result;
}
}