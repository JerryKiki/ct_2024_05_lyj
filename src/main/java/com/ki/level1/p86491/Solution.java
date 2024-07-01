package com.ki.level1.p86491;

//최소직사각형구하기 "[[60, 50], [30, 70], [60, 30], [80, 40]] => 80 * 50 => 4000"
class Solution {
    public int solution(int[][] sizes) {

        int[] newWidths = new int[sizes.length];
        int[] newHeights = new int[sizes.length];
        int maxWidth = 0;
        int maxHeight = 0;

        //가로 = 두변 중 긴 부분, 세로 = 두변 중 짧은 부분으로 통일
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                newWidths[i] = sizes[i][1];
                newHeights[i] = sizes[i][0];
            } else {
                newWidths[i] = sizes[i][0];
                newHeights[i] = sizes[i][1];
            }
        }

        for (int i = 0; i < newWidths.length; i++) {
            if (newWidths[i] > maxWidth) {
                maxWidth = newWidths[i];
            }
            if (newHeights[i] > maxHeight) {
                maxHeight = newHeights[i];
            }
        }

        return maxWidth * maxHeight;
    }
}