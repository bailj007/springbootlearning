package cn.springboot.service;


import cn.springboot.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * User 业务层接口
 *
 * Created by bysocket on 18/09/2017.
 */
public interface UserService {

    /**
     * 获取用户分页列表
     *
     * @param pageable
     * @return
     */
    Page<User> findByPage(Pageable pageable);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    User insertByUser(User user);
}
