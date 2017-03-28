package myudfs;
  import java.io.IOException;
  import org.apache.pig.EvalFunc;
  import org.apache.pig.data.Tuple;

  public class UpperLast3 extends EvalFunc<String>
  {
    public String exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0)
            return null;
        try{
            String str = (String)input.get(0);
		String strr = str;
		int len = str.length();
		if (len > 3){
			strr = str.substring(len-3,len);
		}
		return strr.toUpperCase();
        }catch(Exception e){
            throw new IOException("Caught exception processing input row ", e);
        }
    }
  }
