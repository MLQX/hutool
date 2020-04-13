package cn.hutool.cache.exam;

import java.util.Map;

/**
 * @author ruoan
 * @version 1.0
 * @date 2020/4/12 21:45
 */
public class MyFIFOCache<K,V> {

    private Map<K,MyCacheObj<K,V>> obj ;
}
