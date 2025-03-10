package top.tangyh.lamp.system.vo.result.system;

import cn.dev33.satoken.session.TokenSign;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 在线用户 token
 * @author tangyh
 * @since 2024/8/1 15:40
 */
@Data
public class OnlineTokenResultVO extends TokenSign {

    /** 创建时间 */
    private LocalDateTime sessionTime;
    private String sessionStr;
    /**  失效时间 */
    private LocalDateTime expireTime;
    private String expireStr;
}
