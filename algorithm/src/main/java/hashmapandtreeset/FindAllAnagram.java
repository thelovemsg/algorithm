package hashmapandtreeset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllAnagram {

    /**
     * 4. 모든 아나그램 찾기
     * 설명
     * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     *
     * 입력
     * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     *
     * 출력
     * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     *
     * bacaAacba    =>    3
     * abc
     */

    public static void main(String[] args) {
        FindAllAnagram faa = new FindAllAnagram();
        Scanner kb = new Scanner(System.in);
        String sString = kb.next();
        String tString = kb.next();

        faa.solution(sString, tString);
    }

    private void solution1(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        int L = b.length()-1; //2
        for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        int lt=0;
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0){
                am.remove(a.charAt(lt));
            }
            lt++;
        }
        System.out.println(answer);
    }

    //내 풀이... 못풀음... 자꾸 포문 2개밖에 생각 안나는데 무슨 이게 sliding임?
    private void solution(String sString, String tString) {
        int p1=tString.length(), p2=0;

        String answer = "";
        Map<Character, Character> map = new HashMap<>();
        for(char temp : tString.toCharArray()){
            map.put(temp, temp);
            answer +=temp;
        }
        int count = 0;
        for(int i=p1; i<sString.length(); i++){
            for(char temp : answer.toCharArray()){
                if(!map.containsKey(temp)){
                    break;
                }
            }
        }

    }

}
