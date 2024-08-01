package com.ki.level2.p12973;

//자바에도 스택이 있댄다. 써보자...
//스택: 늦게 들어온 놈이 맨 위에 쌓여서 가장 먼저 제거되는 자료구조
//근본적으로 앞에 것들을 저장하면서 저장된 마지막 놈과 새로 들어오려 하는 놈을 비교
//같으면 저장하지 않고 원래 있던 마지막것도 지운다 ==> 같은 쌍 2개 삭제처럼 기능함
//같지 않으면 저장해서 뒤에것들과 다시 비교하게 된다
//어레이리스트의 마지막 인덱스랑 비교하는거랑 크게 다르지 않을 거 같긴 한데 새거 배운다는 느낌으로 써보기로함
//add 혹은 push로 값 추가
//pop으로 값 제거(자동으로 마지막값) (해당 값을 반환해주므로 필요시 변수에 저장해서 사용도 가능하다
//clear : 싹다 제거
//peak : 마지막 요소를 반환해줌
//empty : 비었나 안비었나 확인. 비었으면 true 뭐라도 있으면 false
//search : 인자 검색해서 해당 위치 반환. 같은 값이 여러개면 가장 먼저 빠져나올 놈의 위치를 반환
// ==> 여기서 위치란 인덱스가 아니라 빠져나오게 될 순서를 말한다. (뒤에서부터 몇번째, 0부터 시작 안함 양수임)
// 찾는 값 없으면 -1

import java.util.Stack;

class Solution {
    public int solution(String s) {
        //길이 자체가 홀수면 바로 리턴
        if (s.length() % 2 != 0) return 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

//기존 푼 방식(시간초과...)
//        ArrayList<String> ss = new ArrayList<>(List.of(s.split("")));
//
//        int idx = 0;
//
//        while (!ss.isEmpty()) {
//            try {
//                if (ss.get(idx).equals(ss.get(idx + 1))) {
//                    ss.remove(idx);
//                    ss.remove(idx);
//                    idx = 0;
//                } else {
//                    idx++;
//                }
//            } catch (IndexOutOfBoundsException e) {
//                    break;
//                }
//            }
//
//        if (ss.isEmpty()) return 1;
//        else return 0;

// 두번째 : 실패 및 시간초과
/*
        while(true) {

            HashMap<String, ArrayList<Integer>> maps = new HashMap<>();
            String[] ss = s.split("");

            //일단 맵에 담는다 (철자, (인덱스리스트))
            for (int i = 0; i < ss.length; i++) {
                if (!maps.containsKey(ss[i])) {
                    maps.put(ss[i], new ArrayList<>());
                    maps.get(ss[i]).add(i);
                } else {
                    maps.get(ss[i]).add(i);
                }
            }

            //철자별 개수 확인: 홀수 하나라도 있으면 불가
            // + 짝수검증 통과하면 지울 수 있는지 다시 확인
            for (String key : maps.keySet()) {
                ArrayList<Integer> list = maps.get(key);
                if (list.size() % 2 != 0) return 0;
                for (int i = 0; i < list.size(); i += 2) {
                    try {
                        //두개씩 짝지었을 때 인덱스 사이가 짝수인게 있으면 못지우는게 생기니까 바로 리턴
                        if ((list.get(i + 1) - list.get(i))%2 == 0) return 0;
                        else if (list.get(i + 1) - list.get(i) == 1) {
                            ss[list.get(i)] = "";
                            ss[list.get(i + 1)] = "";
                            System.out.println(Arrays.toString(ss));
                        } else { //1이 아니지만 사이가 지워질 가능성이 있으면(인덱스 사이 홀수)
                            String confirm = s.substring(list.get(i)+1, list.get(i+1));
                            if(solution(confirm) == 0) return 0;
                            else {
                                for (int j = list.get(i); j <= list.get(i+1); j++) {
                                    ss[j] = "";
                                }
                            }
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
            }

            s = String.join("", ss);
            System.out.println(s);
            if (s.isEmpty()) return 1;
 */

/* 3회차... 역시나 문제가 생긴다
    public int solution(String s) {
        //길이 자체가 홀수면 바로 리턴
        if (s.length() % 2 != 0) return 0;

        return solution2(s);
    }

    public int solution2(String s) {

        //첫번째 문자의 두번째 인덱스 확인
        int SecondIdxOfFirstChar;
        String ss = s.substring(1);
        String firstChar = String.valueOf(s.charAt(0));
        if (ss.contains(firstChar)) {
            SecondIdxOfFirstChar = ss.indexOf(firstChar) + 1;
        } else return 0;

        if (SecondIdxOfFirstChar == 1) {
            s = s.substring(2);
        } else if (SecondIdxOfFirstChar == 2) return 0;
        else {
            String confirm = s.substring(1, SecondIdxOfFirstChar);
            if (solution2(confirm) == 0) {
                return 0;
            }
            else {
                s = s.replace(confirm, "");
            }
        }

        if (s.isEmpty()) return 1;
        else {
            return solution2(s);
        }
    }
}
 */

/*4회차 ==> 1회차 수정... 더 돈다
int idx = 0;
        boolean removedInThisTurn = false;

        while (!ss.isEmpty()) {
            try {
                if (ss.get(idx).equals(ss.get(idx + 1))) {
                    //이렇게 하면 끝까지 한바퀴 돌지 않을까?
                    ss.remove(idx);
                    ss.remove(idx);
                    removedInThisTurn = true;
                    if (ss.isEmpty()) return 1; //지운 다음 미리 체크
                } else {
                    idx++;
                }
            } catch (IndexOutOfBoundsException e) {
                    //한바퀴를 다 돌았을 때
                    if (!removedInThisTurn) return 0; //한번도 지워지지 않았으면 return 0;
                    else { //지워졌다면 re-check
                        idx = 0;
                        removedInThisTurn = false;
                    }
                }
            }

        if (ss.isEmpty()) return 1;
        else return 0;
 */
