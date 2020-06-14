package com.example.clientone.democlientone.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author jacksparrow414
 * @date 2020-06-14
 * @description: TODO
 */
@TableName(value = "sw_user")
@Data
public class SwUser {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String name;
}
