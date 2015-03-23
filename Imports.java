import java.sql.*;
import java.util.*;

//static import
import static java.util.Arrays.asList;
import static java.lang.System.out;


public class Imports {

    public static void main(String[] args) {
        //Date d = new Date(); //WILL NOT COMPILE WITH THIS STATEMENT, Date is ambiguous
	arrayFun();
    }
    public static void arrayFun() {
	List<Integer>nums = asList(1,2,3);
	for (int i : nums) {
		out.println(i);
	}
    }
}
