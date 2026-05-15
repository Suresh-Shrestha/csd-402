public class UseDivision {

    public static void main(String[] args) {

        // International divisions
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 1001, "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Euro Finance", 1002, "Germany", "German");

        // Domestic divisions
        DomesticDivision domDiv1 = new DomesticDivision("Midwest Sales", 2001, "Nebraska");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Marketing", 2002, "California");

        // display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();

    }
}
