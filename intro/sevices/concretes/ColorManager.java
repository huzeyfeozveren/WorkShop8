package com.tobeto.a.spring.intro.sevices.concretes;

import com.tobeto.a.spring.intro.entities.Color;
import com.tobeto.a.spring.intro.repositories.ColorRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.ColorService;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.AddColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.DeleteColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.UpdateColorRequest;
import org.springframework.stereotype.Service;

@Service
public class ColorManager implements ColorService {
    private ColorRepository colorRepository;

    public ColorManager(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Override
    public void add(AddColorRequest request) {
        Color color = new Color();
        color.setColorName(request.getColorName());
        colorRepository.save(color);

    }

    @Override
    public void delete(DeleteColorRequest request) {
        Color colorToDelete = colorRepository.findById(request.getId()).orElseThrow();
        colorRepository.delete(colorToDelete);
    }

    @Override
    public void update(UpdateColorRequest request) {
        Color colorToUpdate = colorRepository.findById(request.getId()).orElseThrow();
        colorToUpdate.setColorName(request.getName());

        colorRepository.save(colorToUpdate);
    }
}
