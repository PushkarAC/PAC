package testjava;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.annotations.expressions.Mule;
import org.mule.api.annotations.param.Payload;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;
//public class Testj  {

	/*public String sayJ(@Mule ("flowVars['requestId']") String requestId) {
		// TODO Auto-generated constructor stub	
		 
			return requestId.toString();
	}*/
	/*public String onCall(MuleEventContext eventContext, @Payload String payload)
			 throws Exception {
			    String returnPath = eventContext.getMessage().getProperty("myReturnPath", PropertyScope.OUTBOUND);   
	            return returnPath;
	}
	*/
   /* public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MuleMessage message = eventContext.getMessage();
		
		MuleMessage msg;
		  
            Testj T = new Testj();
            T.sayJ();
	}*/
	public class Testj implements Callable {
		   @Override
		    public Object onCall(MuleEventContext muleContext) throws Exception {
		        String requestId = (String) muleContext.getMessage().getProperty("requestId", PropertyScope.INVOCATION);
		       // Integer requestId2 = (Integer) muleContext.getMessage().getInvocationProperty("requestId");  // alternative
		        int i,len = requestId.length();
		        StringBuilder rev = new StringBuilder(len);
		        for(i = (len - 1); i >= 0; i--)
		        {
		        	rev.append(requestId.charAt(i));
		        }
		        
		        return rev.toString();
		     
		   }
		
}

