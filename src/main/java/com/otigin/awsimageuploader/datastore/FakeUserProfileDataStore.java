package com.otigin.awsimageuploader.datastore;

import com.otigin.awsimageuploader.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {

  private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));

  }

}
