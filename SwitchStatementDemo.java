public class SwitchStatementDemo {
    public static void main(String[] args) {
        int day = 4; 
        char grade = 'B'; 

        
        switch (day) {
            case 1:
                System.out.println("Monday: Start of the week.");
                break;
            case 2:
                System.out.println("Tuesday: Keep going.");
                break;
            case 3:
                System.out.println("Wednesday: Midweek already!");
                break;
            case 4:
                System.out.println("Thursday: Almost there.");
                break;
            case 5:
                System.out.println("Friday: Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday: Time to relax.");
                break;
            case 7:
                System.out.println("Sunday: Rest well.");
                break;
            default:
                System.out.println("Invalid day.");
        }

     
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair effort.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            case 'F':
                System.out.println("Failed. Try harder!");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
