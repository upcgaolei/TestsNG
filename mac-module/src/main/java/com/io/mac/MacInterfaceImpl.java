package com.io.mac;

import org.springframework.stereotype.Service;

/**
 * Created by 周高磊
 * Date: 2018/1/10.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */
@Service(value = "macInterface")
public class MacInterfaceImpl implements MacInterface {

    @Override
    public String hello() {
        return "hello world";
    }

}
