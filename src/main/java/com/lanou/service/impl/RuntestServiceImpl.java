package com.lanou.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lanou.service.RuntestService;
import lombok.extern.log4j.Log4j;
import org.aspectj.tools.ajc.Main;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@Log4j
public class RuntestServiceImpl implements RuntestService {
    @Override
    public  Object testMain(String code){

        try {
            FileWriter fw=new FileWriter("e:/backup/Main.java");
            fw.write(code);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Runtime.getRuntime().exec("javac e:\\backup\\Main.java");
            Process process=Runtime.getRuntime().exec("java -cp e:\\backup\\Main.java &&java Main");
            PrintWriter pw=new PrintWriter(process.getOutputStream());
            pw.println("hello   java invoked");
pw.flush();
            process.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(process.getInputStream()));
//            BufferedReader br=new BufferedReader(new InputStreamReader(process.getErrorStream()));
            log.debug(br.readLine());
            log.debug(Runtime.getRuntime().toString());
            String str = null;
            while((str=br.readLine())!=null){
                log.debug(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void test(){
        JSONArray array= JSON.parseArray("['1 2 3 5 48 1 5','1 5 1 2 3 5']");
    }
}
