package lunaman;

import com.google.gson.Gson;
// 테스트 클래스
class Node {
    // 맴버 변수
    private int data;
    // 취득 함수
    public int getData() {
        return data;
    }
    // 맴버 변수 설정 함수
    public void setData(int data) {
        this.data = data;
    }
}

public class Example {
    // 실행 함수
    public static void main(String[] args) {
        // json 타입의 string 값
        String test = "{\"data\":1}";
        // Gson 인스턴스 생성
        Gson gson = new Gson();
        // string을 Node 인스턴스로 변환
        Node node = gson.fromJson(test, Node.class);
        // 콘솔 출력
        System
            .out
            .println(node.getData());
    }

}
