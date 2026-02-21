package com.schoolmanagement.dto;

import java.util.List;
import java.util.Map;

public record DesignBlueprint(
    List<String> targetUsers,
    List<FeatureModule> coreFeatures,
    Map<String, List<String>> userFlow,
    Map<String, List<String>> databaseSchema,
    List<String> technologyStack
) {
}
