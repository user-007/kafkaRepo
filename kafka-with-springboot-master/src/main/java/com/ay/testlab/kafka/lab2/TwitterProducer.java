package com.ay.testlab.kafka.lab2;

import com.google.common.collect.Lists;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.httpclient.auth.OAuth1;
import com.twitter.joauth.UnpackedRequest;
import com.twitter.joauth.Unpacker;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class TwitterProducer {
    public TwitterProducer(){}
    public static void main(String[] args) {
        new TwitterProducer().run();
    }
    public void run(){

    }
    String consumerKey =  "1138377917266837506-ufhGzGOl8JOCyeq8EkXFGE46jMvhxu";
    String consumerSecret = "j3qMEAWacJBFPEwsCFDAbAB7B7szRmnoPIHKVqHAuag8N";
    String token = "AAAAAAAAAAAAAAAAAAAAAMYcbAEAAAAAtjrwu5uS6KvRBrkeak9o%2BeTfnrE%3D7V0P4izp3AZgCHvPkJMzVEOAP1jvoaZc4RYSiV9M6eCmEdRWgn";

    public void createTwitterClient(){
        BlockingDeque<String> msgQueue = new LinkedBlockingDeque<String>(100000);
        Hosts hosebirdHosts  = new HttpHosts(Constants.STREAM_HOST);
        StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
        List<String> terms = Lists.newArrayList("kafka");
        hosebirdEndpoint.trackTerms(terms);

    }
}
