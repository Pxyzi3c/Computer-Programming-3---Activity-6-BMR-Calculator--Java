import java.util.Scanner;
public class act6 {
    //PROGRAMMER: HARVY JONES PONTILLAS DICT
    public static void main(String[] args){
        // Variables declaration
        /* height is int because the conversion of height into inches are whole numbers 
            Feet 	    Inches 	Centimeters
            3′ 6″ 	    42″ 	106.68 cm
            3′ 7″ 	    43″ 	109.22 cm
            3′ 8″ 	    44″ 	111.76 cm
            3′ 9″ 	    45″ 	114.3 cm
            3′ 10″ 	    46″ 	116.84 cm
            3′ 11″ 	    47″ 	119.38 cm
            4′ 	        48″ 	121.92 cm
            4′ 1″ 	    49″ 	124.46 cm
            4′ 2″ 	    50″ 	127 cm
            and so on
        */ 
        int age, lifeStyle, heightInches;
        double bmr, bmrNew, weightPounds;
        String name, gender;
        char processAnother;
        bmr = 0.0;
        bmrNew= 0.0;
        weightPounds = 0.0;

        Scanner keyboard = new Scanner(System.in);

        do{
        System.out.println("\n\t--------------------BMR CALCULATOR--------------------\n");
        
        // Ask user to input their name
        System.out.print("\tENTER YOUR NAME\t\t    : ");
        name = keyboard.nextLine();

        // Ask user to input their age
        System.out.print("\tENTER YOUR AGE\t\t    : ");
        age = keyboard.nextInt();

        // Ask user to input their weight in pounds
        System.out.print("\tENTER YOUR WEIGHT(in pounds): ");
        weightPounds = keyboard.nextDouble();

        // Ask user to input their height in inches
        System.out.print("\tENTER YOUR HEIGHT(in inches): ");
        heightInches = keyboard.nextInt();

        // Ask user to input their gender
        System.out.print("\tENTER YOUR GENDER\t    : ");
        keyboard.nextLine();
        gender = keyboard.nextLine();

        // Conditional statement to calculate BMR based on the gender
        // BMR calculation if gender is female
        if(gender.equals("female") || gender.equals("Female"))
            bmr = 655 + (4.3 * weightPounds) + (4.7 * heightInches) - (4.7 * age);
        // BMR calculation if gender is male
        else if(gender.equals("male") || gender.equals("Male"))
            bmr = 660 + (6.3 * weightPounds) + (12.9 * heightInches) - (6.8 * age);

            // Display calculated BMR
            System.out.printf("\tYOUR BMR IS\t\t    : %.2f", bmr);

        // Ask user their lifestyle
        System.out.println("\n\n\tENTER YOUR LIFESTYLE:");
        System.out.println("\t\t1. SEDENTARY (SOMEWHAT INACTIVE)");
        System.out.println("\t\t2. SOMEWHAT ACTIVE (EXERCISE OCCATIONALLY)");
        System.out.println("\t\t3. ACTIVE (EXERCISE 3-4 DAYS A WEEK)");
        System.out.println("\t\t4. HIGHLY ACTIVE (EXERCISE EVERYDAY)");

        // Get user's lifestyle
        System.out.print("\tENTER YOUR LIFESTYLE\t: ");
        lifeStyle = keyboard.nextInt();

        // Conditional statement to calculate user's new BMR based on their lifestyle
        if(lifeStyle == 1)
            // Add 20% of BMR's original value if lifestyle is sedentary
            bmrNew = bmr + (bmr * .20);
        else if(lifeStyle == 2)
            // Add 30% of BMR's original value if lifestyle is somewhat active
            bmrNew = bmr + (bmr * .30);
        else if(lifeStyle == 3)
            // Add 40% of BMR's original value if lifestyle is active
            bmrNew = bmr + (bmr * .40);
        else if(lifeStyle == 4)
            // Add 50% of BMR's original value if lifestyle is highly active
            bmrNew = bmr + (bmr * .50);

            // Display new BMR
            System.out.printf("\tYOUR NEW BMR IS\t\t: %.2f \n\n", bmrNew);
        
        // Ask the user if they want to process another bmr calculation
        System.out.print("\tPROCESS ANOTHER BMR CALCULATION? (Y/N): ");
        processAnother = keyboard.next().charAt(0);
        keyboard.nextLine();
        }while((processAnother!='n' || processAnother!='N') && (processAnother == 'y' || processAnother == 'Y'));

        System.out.println("\n\t-----------THANK YOU FOR USING THE SYSTEM!-----------\n");
    }
}