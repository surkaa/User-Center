package cn.surkaa.service;

import cn.surkaa.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author SurKaa
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-06-19 19:46:45
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * <h2>注册逻辑 注册条件</h2>
     * <ul>
     *     <li>账户密码以及确认密码都不为空(不是null 不是空字符)</li>
     *     <li>账户长度不小于<strong>6</strong>位</li>
     *     <li>密码不小于<strong>8</strong>位</li>
     *     <li>账户不能以数字开头</li>
     *     <li>密码和校验密码相同</li>
     *     <li>账户和密码只能包含如下字符<pre>{@code a-z A-Z 0-9}</pre></li>
     *     <li>账户不重复</li>
     *     <li>对密码进行加密保存</li>
     * </ul>
     *
     * @param account       注册账号
     * @param password      注册密码
     * @param checkPassword 确认密码
     * @return 注册成功后的用户id
     */
    long userRegister(String account, String password, String checkPassword);

}
