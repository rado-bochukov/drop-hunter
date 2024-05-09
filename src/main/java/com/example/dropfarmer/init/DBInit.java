package com.example.dropfarmer.init;

import com.example.dropfarmer.model.entity.AirdropEntity;
import com.example.dropfarmer.model.entity.enums.CategoryEnum;
import com.example.dropfarmer.repository.AirdropRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {
    
    private  final AirdropRepository airdropRepository;

    public DBInit(AirdropRepository airdropRepository) {
        this.airdropRepository = airdropRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(airdropRepository.count()==0){
            initStarkNet();
            initCelestia();
        }
    }

    private void initCelestia() {
        initProject("Celsetia",
                    "fakeURl",
                    "https://twitter.com/CelestiaOrg",
                    "https://celestia.org/",
                    CategoryEnum.STAKING,
                    true,
                    "eligibility_checker_url",
                    "11-11-2023");

    }

    private void initStarkNet() {
        initProject("StarkNet",
                "fakeURl_starkNet",
                "https://twitter.com/Starknet",
                "https://www.starknet.io/en",
                CategoryEnum.MAIN_NET,
                true,
                "eligibility_checker_url_starkNet",
                "01-12-2024");
    }

    private void initProject(String projectName,
                             String imageUrl,
                             String twitterUrl,
                             String projectOfficialSiteUrl,
                             CategoryEnum categoryEnum,
                             boolean isCompleted,
                             String eligibilityCheckerUrl,
                             String snapshot) {
        AirdropEntity airdrop=new AirdropEntity();
        airdrop.setProjectName(projectName);
        airdrop.setImageUrl(imageUrl);
        airdrop.setProjectXUrl(twitterUrl);
        airdrop.setProjectOfficialSiteUrl(projectOfficialSiteUrl);
        airdrop.setCategory(categoryEnum);
        airdrop.setCompleted(isCompleted);
        airdrop.setSnapshot(snapshot);
        airdrop.setEligibilityCheckerUrl(eligibilityCheckerUrl);

        airdropRepository.save(airdrop);
    }


}
