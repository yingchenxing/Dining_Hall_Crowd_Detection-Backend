package com.example.dininghallcrowddetection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xic
 * @since 2022-11-12
 */
@Getter
@Setter
  @TableName("message_info")
public class MessageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private LocalDateTime timeToSend;

    private String phoneNumber;

    private Boolean state;


}
