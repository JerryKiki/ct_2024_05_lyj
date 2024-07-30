package com.ki.level2.p12973;

class Solution {
    public int solution(String s) {
        //길이 자체가 홀수면 바로 리턴
        if (s.length() % 2 != 0) return 0;

        return solution2(s);
    }

    public int solution2(String s) {

        //첫번째 문자의 마지막 인덱스 확인
        int lastIdxOfFirstChar;
        lastIdxOfFirstChar = s.lastIndexOf(s.charAt(0));
        if (lastIdxOfFirstChar == 0) return 0;

        if (lastIdxOfFirstChar == 1) {
            s = s.substring(2);
        } else if (lastIdxOfFirstChar == 2) return 0;
        else {
            String confirm = s.substring(1, lastIdxOfFirstChar);
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
