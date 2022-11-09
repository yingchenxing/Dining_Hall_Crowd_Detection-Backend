package com.example.dininghallcrowddetection.controller;


import com.example.dininghallcrowddetection.common.Result;
import com.example.dininghallcrowddetection.entity.Hall;
import com.example.dininghallcrowddetection.entity.Window;
import com.example.dininghallcrowddetection.service.IHallService;
import com.example.dininghallcrowddetection.service.IWindowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xic
 * @since 2022-11-09
 */
@RestController
@RequestMapping("/window")
public class WindowController {
    @Resource
    private IWindowService windowService;

    //根据id新增或修改
    @PostMapping
    public Result save(@RequestBody Window window) {
        return Result.success(windowService.saveOrUpdate(window));
    }

    //根据id删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return Result.success(windowService.removeById(id));
    }

    //根据id批量删除
    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        return Result.success(windowService.removeBatchByIds(ids));
    }

    //返回所有
    @GetMapping
    public Result findAll() {
        return Result.success(windowService.list());
    }

    //通过id查询
    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(windowService.getById(id));
    }
}

