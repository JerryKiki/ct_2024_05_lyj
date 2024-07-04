package com.ki.level1.p92334;

//신고 결과 받기
//인자 : 유저 리스트, 유저가 유저를 신고한 리스트, 신고 제한 횟수
//유저는 다른 유저들에게 k번 신고당하면 아이디 정지됨
//한 유저가 여러 유저를 신고할 수 있지만, 한 유저를 여러번 신고하는 건 1회로 처리
//아이디가 정지되면 한번이라도 신고했던 유저는 대상이 정지되었다는 메일을 받는다
//상대가 정지되었다는 메일을 받은 id별 횟수를 담은 배열을 리턴

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        if (k >= id_list.length) return new int[id_list.length]; //성립 자체가 안되는 경우 빠르게 리턴

        //중복값 삭제
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, ArrayList<String>> reportersPerId = new HashMap<>();
        List<String> willGetMail = new ArrayList<>();

        for (String reportRecord : report) {
            String[] RR = reportRecord.split(" ");
            if (!reportersPerId.containsKey(RR[1])) { //신고대상이 처음 나온 신고대상이라면
                ArrayList<String> newReporterList = new ArrayList<>();
                newReporterList.add(RR[0]);
                reportersPerId.put(RR[1], newReporterList); //첫 신고자를 담은 arraylist를 value로 가지는 새로운 map element 생성
            } else { //처음 나온 신고대상이 아니라면
                reportersPerId.get(RR[1]).add(RR[0]); //현재 신고자 추가
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            if (reportersPerId.containsKey(id_list[i])) { //신고 이력이 있는지부터 체크
                if (reportersPerId.get(id_list[i]).size() >= k) { //신고자가 k보다 많을 때만
                    willGetMail.addAll(reportersPerId.get(id_list[i])); //reporters 목록을 저장
                }
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Collections.frequency(willGetMail, id_list[i]);
        }

        return answer;
    }
}
