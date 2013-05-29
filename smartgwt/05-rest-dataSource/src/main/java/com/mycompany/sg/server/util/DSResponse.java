package com.mycompany.sg.server.util;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Hu Jing Ling
 * Date: 2013-5-27
 */
public class DSResponse {

    public static int STATUS_FAILURE = -1;
    public static int STATUS_LOGIN_INCORRECT = -5;
    public static int STATUS_LOGIN_REQUIRED = -7;
    public static int STATUS_LOGIN_SUCCESS = -8;
    public static int STATUS_MAX_LOGIN_ATTEMPTS_EXCEEDED = -6;
    public static int STATUS_SERVER_TIMEOUT = -100;
    public static int STATUS_SUCCESS = 0;
    public static int STATUS_TRANSPORT_ERROR = -90;
    public static int STATUS_VALIDATION_ERROR = -4;

    int status;
    long startRow;
    long endRow;
    long totalRows;
    Object data;
    List errors;

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public long getStartRow()
    {
        return startRow;
    }

    public void setStartRow(long startRow)
    {
        this.startRow = startRow;
    }

    public long getEndRow()
    {
        return endRow;
    }

    public void setEndRow(long endRow)
    {
        this.endRow = endRow;
    }

    public long getTotalRows()
    {
        return totalRows;
    }

    public void setTotalRows(long totalRows)
    {
        this.totalRows = totalRows;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public List getErrors()
    {
        return errors;
    }

    public void setErrors(List errors)
    {
        this.errors = errors;
    }

    public DSResponse()
    {
        status = STATUS_SUCCESS;

        errors = new ArrayList();
        startRow = 0;
        endRow = 0;
        totalRows = -1;
    }

    public DSResponse(int status)
    {
        this.status = status;

        errors = new ArrayList();
        startRow = 0;
        endRow = 0;
        totalRows = -1;
    }
}
