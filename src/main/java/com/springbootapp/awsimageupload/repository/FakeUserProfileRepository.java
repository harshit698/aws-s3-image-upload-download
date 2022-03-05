package com.springbootapp.awsimageupload.repository;

import com.springbootapp.awsimageupload.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileRepository {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "harshit", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "bhatia", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
