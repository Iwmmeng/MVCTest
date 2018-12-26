package com.stat.byline.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangmeng
 * @date 18/12/7
 */
public class StatFile {

    public void statFileByLine(String fileName){
        Map<String,Integer> map = new HashMap<String,Integer>();

        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                if(map.containsKey(tempString)) {
                    map.put(tempString, map.get(tempString).intValue() + 1);
                } else{
                    map.put(tempString,1);
                }

                // 显示行号
//                System.out.println("line " + line + ": " + tempString);
//                line++;
            }
            for(Map.Entry entry: map.entrySet()){
                System.out.println("key= " + entry.getKey() + " and value= "+ entry.getValue());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }


//    @Test
//    public void test(){
//        statFileByLine("/Users/wangmeng/sdkVersion.txt");
//
//
//    }


}
