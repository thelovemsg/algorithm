package stackqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
//        System.out.println(er.solution1(n, m, arr));
        System.out.println(er.solution(arr, m));
    }

    private int solution1(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }
        while(!q.isEmpty()){
            Person temp = q.poll();
            for (Person person : q) {
                if (person.priority > temp.priority) {
                    q.offer(temp);
                    temp=null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if(temp.id==m) return answer;
            }
        }
        return answer;
    }

    //내 풀이. 뭔가 많이 다름
    private int solution(int[] arr, int m) {
        int order = 1;
        int target = arr[m];
        int[] newArray = Arrays.stream(arr).sorted().toArray();
        for(int i=newArray.length-1; i>0; i--){
            if(newArray[i] == target){
                break;
            }
            order++;
        }

        return order;
    }
}
