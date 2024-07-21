package service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import model.Cash;
import model.CashDetails;

public class ConversaoService {
	
	public Cash getConversao(String conversao) throws ClientProtocolException, IOException {
		
		Cash cash = null;
		HttpGet request = new HttpGet("https://economia.awesomeapi.com.br/json/last/" + conversao);
		                               
		try (
			CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
			CloseableHttpResponse response = httpClient.execute(request)
		) {
			
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				Gson gson = new Gson();
				cash = gson.fromJson(result, Cash.class);
			}
		}	
		
		return cash;
	}
}
