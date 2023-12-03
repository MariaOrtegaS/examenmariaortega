package i18n;

import java.util.HashMap;

import org.w3c.dom.Text;

import config.Environments;

public class Translations {

    public HashMap<String, HashMap<String, String>> language = new HashMap(); 
    public Translations() {
        HashMap<String, String> en = new HashMap<>();
        en.put(TextCodes.titleText, "Main windows");
        en.put(TextCodes.userNameTextField, "name");
        en.put(TextCodes.promptText, "Products");
        en.put(TextCodes.registerText, "Register your products");
        en.put(TextCodes.notificationText, "do you want to receive notifications");
        en.put(TextCodes.lastNameTextField, "Last name");
        en.put(TextCodes.adminText, "Admin");
        en.put(TextCodes.clientText, "Client");
        en.put(TextCodes.cashierText, "Cashier");
        en.put(TextCodes.enterText, "Login");
        en.put(TextCodes.descriptionTextField, "Description");
        en.put(TextCodes.typeTextField, "type");
        en.put(TextCodes.registerProductNav, "Register Product");
        en.put(TextCodes.registerUserMainNav, "Main List");
        en.put(TextCodes.priceTextField, "price");

        


        HashMap<String, String> es = new HashMap<>();
        es.put(TextCodes.titleText, "Ventana principal");
        es.put(TextCodes.userNameTextField, "Nombre");
        es.put(TextCodes.promptText, "Productos");
        es.put(TextCodes.registerText, "Registra los productos");
        es.put(TextCodes.notificationText, "quieres recibir notificaciones");
        es.put(TextCodes.lastNameTextField, "Apellido");
        es.put(TextCodes.priceTextField, "precio");
        es.put(TextCodes.adminText, "Administrador");
        es.put(TextCodes.clientText, "Cliente");
        es.put(TextCodes.cashierText, "Cajero");
        es.put(TextCodes.enterText, "Entrar");
        es.put(TextCodes.descriptionTextField, "Descripcion");
        es.put(TextCodes.typeTextField, "Tipo");
        es.put(TextCodes.registerProductNav, "REGISTRAR PRODUCTO");
        es.put(TextCodes.registerUserMainNav, "LISTA PRINCIPAL");
        
        language.put("en", en);
        language.put("es", es);
    }
    public String getI18nText(String key) {
        return language.get(Environments.lag).get(key);
    }
}
