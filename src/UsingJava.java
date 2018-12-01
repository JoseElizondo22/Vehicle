public class UsingJava {
    public static void main(String[] args) {
        String strA = "first a short string";
        String strB = "Friends, Romans, countrymen, lend me your ears; I come to bury Caesar, not to praise him;";
        String strC = "this that and the other this does not make sense that does not either does this";

        int result;
        if(strA.compareTo(strB)>0)  {
            System.out.println(strA);

        }
        else {
            System.out.println(strB);
        }
        if(strA.compareToIgnoreCase(strB)>0)    {
            System.out.println(strA);
        }
        else {
            System.out.println(strB);
        }
        System.out.println("index of Ears in strB :" + strB.indexOf("ear"));

        String array[] = strC.split("/");
        for(int k = 0; k<array.length;k++)  {
            System.out.println(array[k]);
        }
        System.out.println(array.length);

    }
    

}