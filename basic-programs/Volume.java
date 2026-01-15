public class Volume{
    public static void main(String args[]){
        int R = 6378;
        double R_M = 6378/1.6;
        double Volume_km = (4/3)*3.16*R*3;
        double Volume_miles = (4/3)*3.16*R_M*3;
        System.out.println("The volume of earth in cubic kilometers is "+Volume_km+" and cublic miles is "+Volume_miles);
    }
    }
