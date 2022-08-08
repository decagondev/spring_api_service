package com.decagondev.services;

import com.decagondev.entities.Result;
import org.springframework.stereotype.Service;

@Service
public class AluService {
    public Result calculate(int a, int b) {
        Result result = new Result(a + b, "Addition done");
        return result;
    }
}
