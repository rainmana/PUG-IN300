/* William Alec Akin
Purdue University Global
IN300 - Programming for Data Analysis (Python, R, Java)
Dr. Robert Kayl
Unit 3 Assignment - Java Source Code
May 17th, 2022
*/

/* Description: Using Java, create an enumeration called Packet, consisting of SOURCE_IP, DESTINATION_IP, PROTOCOL, and
INFO. Use the values() method to loop through the enumeration. In that loop, print each value and index
using the ordinal() method.
*/

public class IN300_WilliamAlecAkin_Unit4_Enum_No1 {

    //Create the enumeration specified above
    enum Packet {
        SOURCE_IP, DESTINATION_IP, PROTOCOL, INFO
    }
    
    //Public static main method
    public static void main(String[] args) {

        //Loop through the enumeration
        for(Packet p: Packet.values()) {

            //Print the value and the ordinal as described above
            System.out.println(p + "=" + p.ordinal());
        }
    }
}
