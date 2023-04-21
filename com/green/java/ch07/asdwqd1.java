package com.green.java.ch07;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] Alphabat = new char[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            if(i==my_string.length()){
                Alphabat[i] = my_string.charAt(i);
            }
        }
        for(int i = 0; i <= my_string.length(); i++){
            for(int j = 65; j<=90; j++){
                if(Alphabat[i] == j){
                    answer[j-65] += 1;
                }
            }
            for(int j = 97; j<=122; j++){
                if((int)Alphabat[i] == j){
                    answer[26+j-97] += 1;
                }
            }
        }
        return answer;
    }
}


public class asdwqd1 {
    public static void main(String[] args) {
        Solution s1 = new Solution();

        s1.solution("ASDF");
        }
    }