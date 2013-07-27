package controle.messages;

import java.util.ResourceBundle;

public class I18NMessages {
public ResourceBundle messages;
	public I18NMessages() {
		super();
		final ResourceBundle mensagens = ResourceBundle.getBundle("Messages");
				//ResourceBundle.getBundle("MessagesBundle",new Locale("pt","BR"));
		this.messages = mensagens;
	}
	/**
	 * Passa uma String para procurar no Messages.Properties!
	 * @param message
	 * @return
	 */
	
	public String appGetMessage(String message){
    	try{
    		return messages.getString(message);
    	}catch(Exception e){
    		return message;
    	}
	}
}