package com.tobeto.a.spring.intro.sevices.concretes;

import com.tobeto.a.spring.intro.entities.Origin;
import com.tobeto.a.spring.intro.repositories.OriginRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.OriginService;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.AddOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.DeleteOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.UpdateOriginRequest;
import org.springframework.stereotype.Service;

@Service
public class OriginManager implements OriginService {
    private OriginRepository originRepository;

    public OriginManager(OriginRepository originRepository) {
        this.originRepository = originRepository;
    }

    public void add(AddOriginRequest request) {
        Origin origin = new Origin();
        origin.setName(request.getName());
        originRepository.save(origin);

    }

    @Override
    public void delete(DeleteOriginRequest request) {
        Origin originToDelete = originRepository.findById(request.getId()).orElseThrow();
        originRepository.delete(originToDelete);
    }

    @Override
    public void update(UpdateOriginRequest request) {
        Origin originToDelete = originRepository.findById(request.getId()).orElseThrow();
        originToDelete.setName(request.getName());
        originRepository.save(originToDelete);

    }
}
