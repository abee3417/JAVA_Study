import java.util.Scanner;
public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        int rand[] = new int[10];
        int count = 1;
        for (int i = 0; i < 10; i++){ // 중복 없는 10개의 수를 추출
            rand[i] = (int)(Math.random()*16 + 1);
            for (int j = 0; j < i; j++){
                if (rand[i] == rand[j]){ // 중복 방지 코드
                    i--;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                for (int k = 0; k < 10; k++){
                    if (count == rand[k]){ // 중복없이 랜덤으로 뽑아놓은 rand의 수랑 count랑 일치할때만 랜덤값저장
                        arr[i][j] = (int)(Math.random()*10 + 1);
                        break;
                    }
                }
                System.out.print(arr[i][j] + " ");
                count++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}