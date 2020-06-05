
public class HarryPotter {

    public static void main(String[] args) {
        int[] B = {6,5,4,3,2};

        int[] tempB = B;

        int price = 0;
        int discountPrice = 0;

        for(int i = 0 ; i < 5 ; i++){
            price += B[i] * 100;
        }
//        System.out.println(price);

        int[] b = B;

        int bookDiscountCount[] = {0,0,0,0};
        while (checkBook(b)) {
            int setOfDiscount = 0;

            for (int i = 0; i < 5; i++) {
                if (b[i] - 1 >= 0) {
                    setOfDiscount++;
                    b[i] -= 1;
                }
            }
            switch (setOfDiscount){
                case 2: bookDiscountCount[0]++; break;
                case 3: bookDiscountCount[1]++; break;
                case 4: bookDiscountCount[2]++; break;
                case 5: bookDiscountCount[3]++; break;
                default:break;
            }
//            System.out.println(bookDiscountCount[0]+" "+ bookDiscountCount[1]);
        }

        discountPrice += bookDiscountCount[0]*10;
        discountPrice += bookDiscountCount[1]*30;
        discountPrice += bookDiscountCount[2]*80;
        discountPrice += bookDiscountCount[3]*125;

        int finalPrice = price - discountPrice;
        System.out.println("Price after calculate discount: "+finalPrice);
    }

    private static boolean checkBook(int[] b){
        int book = 0;
        for(int i = 0 ; i < 5 ; i++){
            book += b[i];
        }
        if (book == 0)
            return false;
        else
            return true;
    }
}
