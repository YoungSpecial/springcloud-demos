package com.example.server.controller;

import com.example.server.entity.WgArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wg")
public class WgController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/getWgs")
    private List<WgArea> getWgAreas(){
        List<WgArea> results = jdbcTemplate.query("select * from wg_area where area_level=3 ",new BeanPropertyRowMapper<>(WgArea.class));
        return results;
    }

}
