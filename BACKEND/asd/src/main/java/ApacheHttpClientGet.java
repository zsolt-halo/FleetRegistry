import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.http.client.ClientProtocolException;

import com.google.gson.Gson;

public class ApacheHttpClientGet {

	public static void main(String[] args) {
		try {
			HttpClient client = new HttpClient();
			GetMethod method = new GetMethod("http://testerg.cloudfoundry.com/driver/6");
			
			Gson gs = new Gson();
			Driver d = new Driver("Alexa", "Márk", "12843514");
			String par = gs.toJson(d);
			//method.setQueryString("js=" + par);
			int statusCode = client.executeMethod(method);
			System.out.println(method.getResponseBodyAsString());
			//int statusCode = client.executeMethod(method);
			
//			BufferedReader br = new BufferedReader(new InputStreamReader(
//					(response.getEntity().getContent())));
//
//			String output;
//			System.out.println("Output from Server .... \n");
//			while ((output = br.readLine()) != null) {
//
//				System.out.println(output);
//			}


		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}