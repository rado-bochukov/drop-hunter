package com.example.dropfarmer.util.mapper;

import com.example.dropfarmer.model.entity.AirdropEntity;
import com.example.dropfarmer.model.view.AirdropViewModel;
import org.springframework.stereotype.Component;

@Component
public class AirdropMapper {
    public AirdropViewModel mapToAirdropViewModel(AirdropEntity airdrop){
        AirdropViewModel airdropViewModel=new AirdropViewModel();

        airdropViewModel.setId(airdrop.getId());
        airdropViewModel.setProjectName(airdrop.getProjectName());
        airdropViewModel.setImageUrl(airdrop.getImageUrl());
        airdropViewModel.setProjectXUrl(airdrop.getProjectXUrl());
        airdropViewModel.setProjectOfficialSiteUrl(airdrop.getProjectOfficialSiteUrl());
        airdropViewModel.setCategory(airdrop.getCategory());
        airdropViewModel.setCompleted(airdrop.isCompleted());
        airdropViewModel.setEligibilityCheckerUrl(airdrop.getEligibilityCheckerUrl());
        airdropViewModel.setSnapshot(airdrop.getSnapshot());

        return airdropViewModel;

    }
}
