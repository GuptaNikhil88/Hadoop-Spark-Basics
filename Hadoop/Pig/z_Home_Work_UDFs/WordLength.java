package myudfs;
  import java.io.IOException;
  import org.apache.pig.EvalFunc;
  import org.apache.pig.data.Tuple;
  import org.apache.pig.*;
  public class WordLength extends EvalFunc<Integer> {
    public Integer exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0)
            return null;
        try{
            String str = (String)input.get(0);
           return str.length();
        }catch(Exception e){
            throw new IOException("Caught exception processing input row ", e);
        }
    }
  }
