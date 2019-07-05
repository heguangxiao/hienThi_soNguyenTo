public class hienThi_soNguyenTo {

    static boolean kiemTra(int num){
        boolean flag = true;

        if (num < 2) {
            flag = false;
        } else if (num == 2) {
            flag = true;
        } else if (num > 2) {
            for (int i = 2; i < num-1; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int count = 1;
        System.out.println("Cac so nguyen to nho hon 100 la: ");
        while (count<101){
            if (kiemTra(count)){
                System.out.print(count+"   ");
            }
            count++;
        }
    }
}
