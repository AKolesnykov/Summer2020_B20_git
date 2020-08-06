package utility;
import java.util.Scanner;
public class BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        boolean drive = false;
        boolean arived = false;
        String statement = "";
        int i = 0;

        String[] points = {"A","B","C","D"};
        String[] directions = {"right","down","left","up"};

        if(end.equals(start)){
            statement= start + " found";

        }else {
            while (!arived){
                if(start.equals(points[i])){
                    drive = true;
                }
                if(points[i].equals(points[points.length-1]) && start!=end){
                    statement = statement + (directions[directions.length-1] + " > ");
                    i=0;
                    start = points[i];
                    if(points[i].equals(end)){
                        statement = statement.substring(0,statement.length()-3) + ( ": " + end + " found");
                        arived = true;
                        continue;
                    }

                }
                if(drive){
                    statement = statement + (directions[i] + " > ");
                }


                i++;
                if(points[i].equals(end) && drive){
                    statement = statement.substring(0,statement.length()-3) + ( ": " + end + " found");
                    arived = true;
                }


            }

        }

        System.out.println(statement);



    }
}
