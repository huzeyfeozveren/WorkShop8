package com.tobeto.a.spring.intro.sevices.abstracts;

import com.tobeto.a.spring.intro.sevices.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.UpdateCarRequest;

public interface CarService {
    void add(AddCarRequest request);
    void delete(DeleteCarRequest request);
    void update(UpdateCarRequest request);
}
