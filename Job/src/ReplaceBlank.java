import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class ReplaceBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We Are Happy.";
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.toString();
		String[] tp = str.split("\\s+");
//		System.out.println(String.join("%20", tp));
		System.out.println(str.replaceAll("\\s+", "%20"));

	}

}
