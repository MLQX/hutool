package cn.hutool.cache.test;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.CacheObj;
import cn.hutool.cache.impl.FIFOCache;
import cn.hutool.core.io.FileUtil;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

/**
 * @author ruoan
 * @version 1.0
 * @date 2020/4/12 21:02
 */
public class Test1 {

    @Test
    public void test1(){
        class T{

        }
        //CacheObj<String, Object> cacheObj = new CacheObj<>("HELLO",new T(),2L);

        //CacheUtil.newFIFOCache(8, 200) 返回一个FIFOCache<>
        FIFOCache<String, Object> objects = CacheUtil.newFIFOCache(8, 200);
        objects.put("h1",new Object());
        objects.put("h2",new Object());
        objects.get("h2");
        System.out.println(objects.getHitCount());
        //CacheUtil.newLRUCache();



    }



    @Test
    public void test2(){
        byte[] bytes = FileUtil.readBytes(new File("C:\\Users\\24316\\Desktop\\gg.txt"));
        System.out.println(bytes);
        System.out.println(Arrays.toString(bytes));
        File file = FileUtil.writeBytes(bytes, "d://copy_gg.txt");
        System.out.println(file);
    }









}
