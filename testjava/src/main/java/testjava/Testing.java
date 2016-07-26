package testjava;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class Testing extends AbstractMessageTransformer{
    /**
     * @param args
     */
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

       // String str =(String)message.getProperty("requestId", PropertyScope.INVOCATION);
     
        String str =(String)message.getInboundProperty("'http.query.params'.requestId");
        int i,len = str.length();
        StringBuilder rev = new StringBuilder(len);
        for(i = (len - 1); i >= 0; i--)
        {
        	rev.append(str.charAt(i));
        }
        
        return rev.toString();
        
    }
}