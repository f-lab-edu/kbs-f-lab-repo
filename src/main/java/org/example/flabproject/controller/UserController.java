package org.example.flabproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.flabproject.dto.UserDto;
import org.example.flabproject.entity.User;
import org.example.flabproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    /*@GetMapping(value = "/users")
    public List<User> getId(@RequestParam(required = false) String index) {
        int testIndex = 1 ;
        //return userService.getUserId(Integer.parseInt(index));
        List<User> Users = userService.getUserIndex(testIndex);
        return userService.getUserIndex(testIndex);

    }*/

    @GetMapping(value = "/users")
    public ModelAndView getId() {
        int testIndex = 2 ;
        List<User> Users = userService.getUserIndex(testIndex);
        ModelAndView mav = new ModelAndView("/index");
        mav.addObject("Users", Users);
        return mav;
    }

    @GetMapping(value = "/save")
    public ModelAndView save() {
      String result = userService.save();
      ModelAndView mav = new ModelAndView("/save");
      mav.addObject("result", result);
      return mav;
    }
}
