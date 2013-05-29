package com.mycompany.sg.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	E:/GitHub/gwt-study/smartgwt/02-i18n/src/main/resources/com/mycompany/sg/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Click Me".
   * 
   * @return translated "Click Me"
   */
  @DefaultMessage("Click Me")
  @Key("label.click.me")
  String label_click_me();

  /**
   * Translated "Server return".
   * 
   * @return translated "Server return"
   */
  @DefaultMessage("Server return")
  @Key("label.server.return")
  String label_server_return();

  /**
   * Translated "Your Name".
   * 
   * @return translated "Your Name"
   */
  @DefaultMessage("Your Name")
  @Key("label.yourName")
  String label_yourName();

  /**
   * Translated "Can not be blank!".
   * 
   * @return translated "Can not be blank!"
   */
  @DefaultMessage("Can not be blank!")
  @Key("msg.can.not.be.blank")
  String msg_can_not_be_blank();
}
