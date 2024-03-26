package com.poly.j6d8_asm_ph18618.rest.controller;

import com.poly.j6d8_asm_ph18618.entity.OrderDetail;
import com.poly.j6d8_asm_ph18618.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orderDetail")
public class OrderDetailRestController {
    @Autowired
    OrderDetailService orderDetailService;
    @GetMapping("/list/{id}")
    public List<OrderDetail> getAll(@PathVariable("id") Long id) {
        return orderDetailService.getAllByOrder(id);
    }
}
