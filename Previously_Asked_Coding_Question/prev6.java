package Previously_Asked_Coding_Question;

/*
 * An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A
company manager wants to make the production of both types of vehicle according to the
given data below:
● 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
● 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
per the given data.

 */
public class prev6 {
    public static void main(String[] args) {
        int v = 200;
        int w = 540;
        int x = (4 * v - w) / 2;
        int y = (w - 2 * v) / 2;
        System.out.println(x + " " + y);
    }
}
