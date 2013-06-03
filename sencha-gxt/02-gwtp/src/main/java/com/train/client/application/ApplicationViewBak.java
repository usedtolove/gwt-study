//package com.train.client.application;
//
//import com.google.gwt.uibinder.client.UiBinder;
//import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.Widget;
//import com.google.inject.Inject;
//import com.gwtplatform.mvp.client.ViewWithUiHandlers;
//import com.sencha.gxt.core.client.Style;
//import com.sencha.gxt.core.client.util.Margins;
//import com.sencha.gxt.widget.core.client.button.TextButton;
//import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
//import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
//import com.sencha.gxt.widget.core.client.container.MarginData;
//import com.sencha.gxt.widget.core.client.event.SelectEvent;
//
//
///**
// * User: hjl
// * Date: 2013-6-2
// */
//public class ApplicationViewBak extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {
//
//    @UiField(provided = true)
//    MarginData outerData = new MarginData(20);
//    @UiField(provided = true)
//    BorderLayoutData northData = new BorderLayoutData(100);
//    @UiField(provided = true)
//    BorderLayoutData westData = new BorderLayoutData(150);
//    @UiField(provided = true)
//    MarginData centerData = new MarginData();
//    @UiField(provided = true)
//    BorderLayoutData eastData = new BorderLayoutData(150);
//    @UiField(provided = true)
//    BorderLayoutData southData = new BorderLayoutData(100);
//
//    @UiField
//    BorderLayoutContainer con;
//    @UiField
//    FlexTable table;
//
//    //从 MainPageView.ui.xml 文件中读取布局
//    interface Binder extends UiBinder<Widget,ApplicationViewBak>{
//    }
//
//    @Inject
//    public ApplicationViewBak(Binder binder) {
////        initWidget(binder.createAndBindUi(this)); //填充各 ui 组件
//
//        northData.setMargins(new Margins(5));
//        westData.setMargins(new Margins(0, 5, 0, 5));
//        westData.setCollapsible(true);
//        westData.setSplit(true);
//        eastData.setMargins(new Margins(0, 5, 0, 5));
//        southData.setMargins(new Margins(5));
//
//        Widget widget = binder.createAndBindUi(this);
//
//        for (int i = 0; i < Style.LayoutRegion.values().length; i++) {
//            final Style.LayoutRegion r = Style.LayoutRegion.values()[i];
//            if (r == Style.LayoutRegion.CENTER) {
//                continue;
//            }
//
//            SelectEvent.SelectHandler handler = new SelectEvent.SelectHandler() {
//
//                @Override
//                public void onSelect(SelectEvent event) {
//                    TextButton btn = (TextButton) event.getSource();
//                    String txt = btn.getText();
//                    if (txt.equals("Expand")) {
//                        con.expand(r);
//                    } else if (txt.equals("Collapse")) {
//                        con.collapse(r);
//                    } else if (txt.equals("Show")) {
//                        con.show(r);
//                    } else {
//                        con.hide(r);
//                    }
//                }
//            };
//
//            table.setHTML(i, 0, "<div style='font-size: 12px; width: 100px'>" + r.name() + ":</span>");
//            table.setWidget(i, 1, new TextButton("Expand", handler));
//            table.setWidget(i, 2, new TextButton("Collapse", handler));
//            table.setWidget(i, 3, new TextButton("Show", handler));
//            table.setWidget(i, 4, new TextButton("Hide", handler));
//        }
//        initWidget(widget);
//    }
//
//}