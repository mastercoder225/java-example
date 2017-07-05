package com.example.java.apache.httpclient.fluent;

import org.apache.http.Consts;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class HttpFluentGet {

    public static void main(String[] args) throws IOException {
        Content content = Request
                .Get("https://www.baidu.com")
                .execute()
                .returnContent();
        content.asString(Consts.UTF_8);
    }
}
