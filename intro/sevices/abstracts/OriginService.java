package com.tobeto.a.spring.intro.sevices.abstracts;

import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.AddOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.DeleteOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.UpdateOriginRequest;

public interface OriginService {
    void add(AddOriginRequest request);
    void delete(DeleteOriginRequest request);
    void update(UpdateOriginRequest request);
}
