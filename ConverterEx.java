import java.util.Scanner ;
import static java.lang.Math.round;

public class ConverterEx {//variable definiton
    int metres;
    String y1 ;
    String z1 ;
    String x1 ;
    String c1 ;
    String f1 ;
    double inches ;
    double yards ;
    double feet ;   
    double chains ;
    double furlongs ;
    double r_inches1 ;
    double r_inches2 ;
    double remaining_inches ;
    double remaining_inches_final ;
    int x ;
    int y ;
    int z ;
    int c ;
    int f ;

    



    public void Insert_values(){//takes input from user
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter distance in metres");
        metres = reader.nextInt();

        if (metres < 0){
            System.out.println("Invalid input!");
            System.exit(1);
        };
    }
    public double conversion(){//conversions in required units
        inches = metres * 39.37008 ;

        furlongs = (int) inches / 7920 ;
        r_inches1 = Math.round(inches - (furlongs * 7920));

        chains = (int) r_inches1 / 792 ;
        r_inches2 = Math.round(r_inches1 - (chains * 792));

        yards = (int)r_inches2/36 ;
        remaining_inches =  Math.round(r_inches2 - (yards * 36)) ; //

        feet =(int) remaining_inches / 12 ; //
        
        remaining_inches_final = remaining_inches - (feet * 12);
        return remaining_inches_final;
    }
    
    
    public void Printing_values(){//prints values with cases required
        System.out.println(metres + " metres in yards, feet and inches is:");

        x =(int) Math.round(remaining_inches_final) ;
        if(x == 1){
             x1 = x + " inch";
         }
         else if(x > 1){
             x1 = x + " inches";    
         }
         
        y =(int) feet ;

        if(y == 1){
             y1 = y + " foot";
         }
         else if(y > 1){
             y1 = y + " feet";
         }
         

        z =(int) yards ;

        if(z == 1){
            z1 = z + " yard";
         }
        else if(z > 1){
            z1 = z + " yards";
        }
        
        c =(int) chains ;
        if(c == 1){
            c1 = c + " chain";
         }
        else if(c > 1){
            c1 = c + " chains";
        }

        f =(int) furlongs ;
        if(f == 1){
            f1 = f + " furlong";
         }
        else if(f > 1){
            f1 = f + " furlongs";
        }

        
        if(x != 0 && y != 0 && z != 0 && c != 0 && f != 0 ){
            System.out.println(f1 + ", " + c1 + ", " + z1 + ", " + y1 + " and " + x1);

         }
        else if (f == 0){
            if (c == 0){
             System.out.println(z1 + ", " + y1 + " and " + x1);     
            }


        }
        
        else if ( z == 0 ){
             if( y == 0){
                 System.out.println(x1);
             }
             else{
                 System.out.println(y1 + " and " + x1);
             }}
        else if(y == 0){
            if(x == 0){
                System.out.println(z1);
            }
            else{
                System.out.println(z1 + " and " + x1);
            };
        }
        else if(x == 0){
            System.out.println(z1 + " and " + y1);

        }
        else{
            System.out.println("distance equal to zero");
        }    
    }   
}
