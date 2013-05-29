package com.mycompany.sg.server.ws.to;

import com.mycompany.sg.shared.User;
import org.codehaus.jackson.map.annotate.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

/**
 * User: hjl
 * Date: 2013-5-26
 * TODO need follow javax.ws.rs.core.Response
 */
@XmlRootElement(name = "response")
@XmlSeeAlso(User.class)
@JsonRootName("response")
public class ResponseTo {

    //SmartGwt Status Code (from com.smartgwt.client.rpc.RPCResponse)
    public static int STATUS_SUCCESS = 0;
    public static int STATUS_FAILURE = -1;
    public static int STATUS_VALIDATION_ERROR = -4;
    public static int STATUS_LOGIN_INCORRECT = -5;
    public static int STATUS_MAX_LOGIN_ATTEMPTS_EXCEEDED = -6;
    public static int STATUS_LOGIN_REQUIRED = -7;
    public static int STATUS_LOGIN_SUCCESS = -8;
    public static int STATUS_TRANSPORT_ERROR = -90;
    public static int STATUS_SERVER_TIMEOUT = -100;

    private int status = 0;//状态，默认值0
    private int startRow=0;//当前查询起始下标,默认值0
    private int endRow;//当前查询结束下标
    private int totalRows;//总记录数
    private List data;//分页数据

    public ResponseTo() {
        this.status = STATUS_SUCCESS;
    }
    public ResponseTo(int statusCode) {
        this.status = statusCode;
    }

    public int getStatus() {
        return status;
    }

    public ResponseTo setStatus(int status) {
        this.status = status;
        return  this;
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

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    @XmlElementWrapper(name="data") // 在集合外包一层，名为 data
    @XmlElement(name="record")       // 集合单个元素，名为 record
    public List getData() {
        if(data == null){
            data = new ArrayList();
        }
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public static ResponseTo ok() {
        return new ResponseTo().setStatus(STATUS_SUCCESS);
    }

    public static ResponseTo failure() {
        return new ResponseTo().setStatus(STATUS_FAILURE);
    }

    public static ResponseTo ok(Object entity) {
        ResponseTo responseTo = new ResponseTo().setStatus(STATUS_SUCCESS);
        responseTo.getData().add(entity);
        return responseTo;
    }
}
