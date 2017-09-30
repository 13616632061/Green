package com.green.utils;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/30.
 */

public class CustomRequest extends Request<Object> {

    private Response.Listener<JSONObject> listener;
    private Map<String, String> params;

    public CustomRequest(String url,Map<String, String> params, Response.Listener<JSONObject> Responselistener,Response.ErrorListener Errorlistener) {
        super(url, Errorlistener);
        this.listener=Responselistener;
        this.params=params;
    }

    public CustomRequest(int method, String url, Map<String, String> params, Response.Listener<JSONObject> Responselistener,Response.ErrorListener Errorlistener) {
        super(method, url, Errorlistener);
        this.listener=Responselistener;
        this.params=params;
    }


    @Override
    protected Response<Object> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(Object response) {

    }
}
