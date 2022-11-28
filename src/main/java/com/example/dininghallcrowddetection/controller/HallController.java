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

    //add by id
    @PostMapping
    public Result save(@RequestBody Hall hall) {
        return Result.success(hallService.saveOrUpdate(hall));
    }

    //delete by id
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return Result.success(hallService.removeById(id));
    }

    //delete batch by id
    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        return Result.success(hallService.removeBatchByIds(ids));
    }

    //return all
    @GetMapping
    public List<Hall> findAll() {
        return hallService.list();
    }

    //find by id
    @GetMapping("/{id}")
    public Hall findOne(@PathVariable Integer id) {
        return hallService.getById(id);
    }
}

