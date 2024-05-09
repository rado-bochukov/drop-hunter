package com.example.dropfarmer.service.impl;

import com.example.dropfarmer.model.view.AirdropViewModel;
import com.example.dropfarmer.repository.AirdropRepository;
import com.example.dropfarmer.service.AirdropService;
import com.example.dropfarmer.util.mapper.AirdropMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirdropServiceImpl implements AirdropService {
    private final AirdropRepository airdropRepository;
    private  final AirdropMapper airdropMapper;

    public AirdropServiceImpl(AirdropRepository airdropRepository, AirdropMapper airdropMapper) {
        this.airdropRepository = airdropRepository;
        this.airdropMapper = airdropMapper;
    }

    @Override
    public List<AirdropViewModel> getAllAirdrops() {
        return airdropRepository.findAll().stream()
                .map(airdropMapper::mapToAirdropViewModel)
                .collect(Collectors.toList());
    }
}
