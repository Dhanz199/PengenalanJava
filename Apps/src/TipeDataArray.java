public class TipeDataArray {
    public static void main(String[] args) {

        String[] stringArray ;
        stringArray = new String[3];

        stringArray[0] = "Ahmad";
        stringArray[1] = "Sofa";
        stringArray[2] = "Ramadhan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Bisa Seperti ini

        String[] namaNama = {
                "Ahmad", "Sofa", "Ramadhan"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        // Tipe Array Didalam Array
        String[][] members = {
                {"Sofa", "Ramadhan"},
                {"Asep", "Lopang"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
    }
}
