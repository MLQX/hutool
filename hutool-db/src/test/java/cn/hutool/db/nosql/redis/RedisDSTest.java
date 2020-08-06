package cn.hutool.db.nosql.redis;

import cn.hutool.setting.GroupedMap;
import cn.hutool.setting.Setting;
import cn.hutool.setting.SettingLoader;
import cn.hutool.setting.SettingUtil;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class RedisDSTest {

    @Test
    public void create() {
        //自定义redis配置文件
        Setting setting = new Setting("config/redis_copy.setting");
        RedisDS redisDS = new RedisDS(setting,"mysetting");
        Assert.assertNotNull(redisDS);

        redisDS.setStr("aa", "1234");

        
    }



    @Test
    public void create2() {
        Setting setting = new Setting("config/simple.setting");


        class T{
            private String username;
            private String password;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }
        }


        T tt=setting.toBean(new T());
        System.out.println(tt.getPassword());
        Assert.assertEquals(tt.getUsername(), "zhangsan");

    }




    @Test
    public void create3() {
//        Setting setting = new Setting("config/simple.setting");


        //将 代码中生成的配置文件持久化
        GroupedMap map = new GroupedMap();
        LinkedHashMap<String, String> content = new LinkedHashMap<>();
        content.put("aaa", "111");
        content.put("bbb", "222");
        content.put("ccc", "333");
        map.put("hello", content);
        SettingLoader loader = new SettingLoader(map, Charset.defaultCharset(),false);
        loader.store("d:/hello.setting");


    }


    @Test
    public void create4() {
//        Setting setting = new Setting("config/simple.setting");


        Setting setting = SettingUtil.get("config/simple.setting");
        Assert.assertNotNull(setting);

    }



}