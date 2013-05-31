package com.train.server;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.train.shared.dispatch.SendTextToServerAction;
import com.train.shared.dispatch.SendTextToServerResult;
import com.train.shared.to.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-31
 */
@Component
public class SendTextToServerHandler extends AbstractActionHandler<SendTextToServerAction, SendTextToServerResult> {

    @Resource
    private ServletContext servletContext;

    public SendTextToServerHandler() {
        super(SendTextToServerAction.class);
    }

    @Override
    public Class<SendTextToServerAction> getActionType() {
        return SendTextToServerAction.class;
    }

    @Override
    public SendTextToServerResult execute(SendTextToServerAction action, ExecutionContext executionContext) throws ActionException {
        String input = action.getTextToServer();
        if (input == null || input.length() < 4) {
            input = "guest";
        }
        String serverInfo = servletContext.getServerInfo();
        User user = action.getUser();
        System.out.println(user);
        return new SendTextToServerResult("Hello, " + input + "! from " + serverInfo);
    }

    @Override
    public void undo(SendTextToServerAction sendTextToServerAction, SendTextToServerResult sendTextToServerResult, ExecutionContext executionContext) throws ActionException {
        System.out.println("undo() run...");
        // Not undoable
    }
}
