package com.ki.level1.p12934;

import static java.lang.Math.sqrt;

public class Main {
}
class Solution {
    public long solution(long n) {

        long answer = n;
        double sqrt = sqrt(n);

        if(n==0) return -1;
        //정수인지를 판별
        else if(sqrt%1 == 0) {
            answer = (long)((sqrt+1)*(sqrt+1));
            //제곱은 Math.pow를 이용해서도 할 수 있다
            return answer;
        }

        return -1;
    }
}
