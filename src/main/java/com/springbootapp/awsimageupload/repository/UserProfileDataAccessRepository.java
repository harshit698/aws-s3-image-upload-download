package com.springbootapp.awsimageupload.repository;

import com.springbootapp.awsimageupload.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessRepository {

    private final FakeUserProfileRepository fakeUserProfileRepository;

    @Autowired
    public UserProfileDataAccessRepository(FakeUserProfileRepository fakeUserProfileRepository) {
        this.fakeUserProfileRepository = fakeUserProfileRepository;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileRepository.getUserProfiles();
    }
}
