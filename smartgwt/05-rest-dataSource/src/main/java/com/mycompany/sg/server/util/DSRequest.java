package com.mycompany.sg.server.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * User: Hu Jing Ling
 * Date: 2013-5-27
 * http://blog.bigpixel.ro/2011/03/working-easier-with-datasources-in-smartgwt-part-ii-server-side/
 */
public class DSRequest {
    HttpSession session;
    HttpServletResponse response;
    HttpServletRequest request;

    private static String OPERATION_FETCH = "fetch";
    private static String OPERATION_UPDATE = "update";
    private static String OPERATION_REMOVE = "remove";
    private static String OPERATION_ADD = "add";

    String dataSource;
    String operationType;

    HashMap criteria;

    int startRow;
    int endRow;
    boolean paged;

    String sortBy;

    public DSRequest(String dataSourceName, String opType)
    {
        this.dataSource = dataSourceName;
        this.operationType = opType;
        endRow = -1;
        startRow = -1;
        paged = true;
    }

    public HttpSession getSession()
    {
        return session;
    }

    public void setSession(HttpSession session)
    {
        this.session = session;
    }

    public HttpServletResponse getResponse()
    {
        return response;
    }

    public void setResponse(HttpServletResponse response)
    {
        this.response = response;
    }

    public HttpServletRequest getRequest()
    {
        return request;
    }

    public void setRequest(HttpServletRequest request)
    {
        this.request = request;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getOperationType()
    {
        return operationType;
    }

    public void setOperationType(String operationType)
    {
        this.operationType = operationType;
    }

    public HashMap getCriteria()
    {
        return criteria;
    }

    public void setCriteria(HashMap criteria)
    {
        this.criteria = criteria;
    }

    public int getStartRow()
    {
        return startRow;
    }

    public void setStartRow(int startRow)
    {
        this.startRow = startRow;
    }

    public int getEndRow()
    {
        return endRow;
    }

    public void setEndRow(int endRow)
    {
        this.endRow = endRow;
    }

    public boolean isPaged()
    {
        return paged;
    }

    public void setPaged(boolean paged)
    {
        this.paged = paged;
    }

    public String getSortBy()
    {
        return sortBy;
    }

    public void setSortBy(String sortBy)
    {
        this.sortBy = sortBy;
    }

    public boolean isAdd()
    {
        return OPERATION_ADD.equals(operationType);
    }

    public boolean isRemove()
    {
        return OPERATION_REMOVE.equals(operationType);
    }

    public boolean isUpdate()
    {
        return OPERATION_UPDATE.equals(operationType);
    }

    public boolean isFetch()
    {
        return OPERATION_FETCH.equals(operationType);
    }

}
