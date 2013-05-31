package com.train.server;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.train.shared.SendTextToServerAction;
import com.train.shared.SendTextToServerResult;
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
    public SendTextToServerResult execute(SendTextToServerAction sendTextToServerAction, ExecutionContext executionContext) throws ActionException {
        String input = sendTextToServerAction.getTextToServer();
        if (input == null || input.length() < 4) {
            input = "guest";
        }
        String serverInfo = servletContext.getServerInfo();
        return new SendTextToServerResult("Hello, " + input + "! from " + serverInfo);
    }

    @Override
    public void undo(SendTextToServerAction sendTextToServerAction, SendTextToServerResult sendTextToServerResult, ExecutionContext executionContext) throws ActionException {
        System.out.println("undo() run...");
        // Not undoable
    }
}
