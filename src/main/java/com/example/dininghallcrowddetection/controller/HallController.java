package com.example.dininghallcrowddetection.controller;


import com.example.dininghallcrowddetection.common.Result;
import com.example.dininghallcrowddetection.entity.Hall;
import com.example.dininghallcrowddetection.service.IHallService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xic
 * @since 2022-11-09
 */
@RestController
@RequestMapping("/hall")
public class HallController {
    @Resource
    private IHallService hallService;

    //根据id新增或修改
    @PostMapping
    public Result save(@RequestBody Hall hall) {
        return Result.success(hallService.saveOrUpdate(hall));
    }

    //根据id删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return Result.success(hallService.removeById(id));
    }

    //根据id批量删除
    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        return Result.success(hallService.removeBatchByIds(ids));
    }

    //返回所有
    @GetMapping
    public List<Hall> findAll() {
        return hallService.list();
    }

    //通过id查询
    @GetMapping("/{id}")
    public Hall findOne(@PathVariable Integer id) {
        return hallService.getById(id);
    }
}

