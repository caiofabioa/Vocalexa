package visao;

import java.util.Properties;

import javax.swing.UIManager;

import com.jtattoo.plaf.texture.TextureLookAndFeel;

import visao.frames.PrincipalFrame;

public class AppStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Seleciona Look and Feel
			Properties props = new Properties();
			props.put("logoString", "Vocalexa");
			props.put("textureSet", "Leather");
			TextureLookAndFeel.setTheme(props);
			UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
			// Abre aplicação
			new PrincipalFrame();
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		//Se tudo der certo, fecho paraguai!
	}
}