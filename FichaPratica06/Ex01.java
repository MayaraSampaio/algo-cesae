package FichaPratica06;

public class Ex01 {
    /**
     *
     * @param animal
     */
    public static void fazerBarulho(String animal){

        if (animal.equalsIgnoreCase("cão")){
            System.out.println("au, au");

        } else if (animal.equalsIgnoreCase("gato")) {
            System.out.println("miau");

        } else if (animal.equalsIgnoreCase("porco")) {
            System.out.println("oinc, oinc");

        } else {
            System.out.println("não conheço este animal");

        }
    }
}
