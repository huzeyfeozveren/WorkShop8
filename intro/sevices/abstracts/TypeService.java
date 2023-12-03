package com.tobeto.a.spring.intro.sevices.abstracts;

import com.tobeto.a.spring.intro.sevices.dtos.type.requests.AddTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.DeleteTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.UpdateTypeRequest;

public interface TypeService {
    void add(AddTypeRequest request);
    void delete(DeleteTypeRequest request);
    void update(UpdateTypeRequest request);
}
