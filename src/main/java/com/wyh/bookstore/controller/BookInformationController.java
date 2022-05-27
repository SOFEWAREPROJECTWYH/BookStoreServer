package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.BookInformation;
import com.wyh.bookstore.service.BookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
@ResponseBody
@RestController
public class BookInformationController {
    @Autowired
    private BookInformationService bookInformationService;
    @RequestMapping(value = "/downloadbookimage",method = RequestMethod.GET)
    public boolean downloadBookImage() throws Exception {
        List<BookInformation> bookInformationList=bookInformationService.getAllBookInformation();
        while (!bookInformationList.isEmpty()){
            BookInformation bookInformation=bookInformationList.get(0);
            bookInformationList.remove(0);
            String fileName =bookInformation.getBookname();
            URL url = new URL(bookInformation.getUrl());
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为5秒
            conn.setConnectTimeout(5*1000);
            //防止屏蔽程序抓取而返回403错误
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //得到输入流
            InputStream inputStream = conn.getInputStream();
            //获取自己数组
            byte[] getData = readInputStream(inputStream);
            //文件保存位置
            File saveDir = new File("E://BookStoreImage");
            if(!saveDir.exists()){ // 没有就创建该文件
                saveDir.mkdir();
            }
            File file = new File(saveDir+File.separator+fileName+".jpeg");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(getData);
            fos.close();
            inputStream.close();
            System.out.println("the file: "+url+" download success");
        }
        return true;
    }
    private static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[4*1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }
}
