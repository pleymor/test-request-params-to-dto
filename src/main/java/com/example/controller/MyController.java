package com.example.controller;

import com.example.dto.TestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Adrien Laugueux.
 */
@RestController
@RequestMapping(path = {"/api"}, produces = APPLICATION_JSON_VALUE)
public class MyController {

    // GET: dto NOT populated from query params "?a=azaz"
    @RequestMapping(method = GET, path = "test")
    public TestDto test(TestDto testDto) {
        return testDto; // null
    }

    // POST: dto WELL populated from body json {"a"="azaz"}
    @RequestMapping(method = POST, path = "test")
    public TestDto postTest(@RequestBody TestDto testDto) {
        return testDto; // "azaz"
    }
}
