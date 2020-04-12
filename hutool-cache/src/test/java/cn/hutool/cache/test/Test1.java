package cn.hutool.cache.test;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.FIFOCache;
import org.junit.Test;

/**
 * @author ruoan
 * @version 1.0
 * @date 2020/4/12 21:02
 */
public class Test1 {

    @Test
    public void test1(){
        //CacheUtil.newFIFOCache(8, 200) 返回一个FIFOCache<>
        FIFOCache<String, Object> objects = CacheUtil.newFIFOCache(8, 200);
        objects.put();

    }
}
