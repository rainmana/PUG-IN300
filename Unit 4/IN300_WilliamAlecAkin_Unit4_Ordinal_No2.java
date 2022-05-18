/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 3 Assignment - Java Source Code
May 17th, 2022
*/

/* Description: Using Java and the same enumeration specifics (called 'Packet', consisting of SOURCE_IP, DESTINATION_IP,
PROTOCOL, and INFO) as IN300_WilliamAlecAkin_Unit4_Enum_No1.java, create a program that compares the ordinal place
for five values. Use the following data:

p1 = Packet.INFO;
p2 = Packet.DESTINATION_IP;
p3 = Packet.PROTOCOL;
p4 = Packet.SOURCE_IP;
p5 = Packet.INFO;

Using the compareTo() method, check if p1 comes before or after p3. Then compare p1 to p5 to see if they are equal.
*/


public class IN300_WilliamAlecAkin_Unit4_Ordinal_No2 {

    //Use the same enumertor as IN300_WilliamAlecAkin_Unit4_Enum_No1.java
    enum Packet {
        SOURCE_IP, DESTINATION_IP, PROTOCOL, INFO
    }

    public static void main(String[] args) {

        //Variables for packet data
        Packet p1, p2, p3, p4, p5;

        //Assign the values to the variables
        p1 = Packet.INFO;
        p2 = Packet.DESTINATION_IP;
        p3 = Packet.PROTOCOL;
        p4 = Packet.SOURCE_IP;
        p5 = Packet.INFO;

        //Compare the values to see if p1 is before p3
        if(p1.compareTo(p3) < 0 ) {
            System.out.println("p1 comes before p3");
        } 
        
        //Compare the values to see if p1 is after p3
        else if(p1.compareTo(p3) > 0 ) {
            System.out.println("p1 comes after p3");
        }

        //Compare the values to see if p1 is equal to p5
        if(p1.compareTo(p5) == 0 ) {
            System.out.println("p1 is equal to p5");
        }

    }
    
}
