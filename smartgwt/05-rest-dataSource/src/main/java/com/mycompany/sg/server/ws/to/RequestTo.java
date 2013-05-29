package com.mycompany.sg.server.ws.to;

import com.mycompany.sg.shared.User;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * User: Hu Jing Ling
 * Date: 2013-5-27
 */
@XmlRootElement(name = "response")
@XmlSeeAlso(User.class)
public class RequestTo<T> {

    private String dataSource;
    private String operationType;
    private String componentId;
    int startRow;
    int endRow;
    boolean paged;
    String[] sortBy;

    private T data;
    private Object oldValues;

    public RequestTo() {
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public boolean isPaged() {
        return paged;
    }

    public void setPaged(boolean paged) {
        this.paged = paged;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getOldValues() {
        return oldValues;
    }

    public void setOldValues(Object oldValues) {
        this.oldValues = oldValues;
    }

    public String[] getSortBy() {
        return sortBy;
    }

    public void setSortBy(String[] sortBy) {
        this.sortBy = sortBy;
    }
}
