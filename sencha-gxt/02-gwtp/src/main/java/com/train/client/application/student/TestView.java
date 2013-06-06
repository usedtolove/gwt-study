package com.train.client.application.student;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.tree.Tree;

/**
* User: Hu Jing Ling
* Date: 2013-6-4
*/
public class TestView extends ViewWithUiHandlers<TestUiHandlers> implements MenuPresenter.MyView {

    @UiField
    SimpleContainer treeCon;

    public interface Binder extends UiBinder<Widget, TestView> {
    }

    @Inject
    public TestView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void showTree(Tree tree) {
        treeCon.add(tree);
    }


}