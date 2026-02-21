package com.schoolmanagement.dto;

import java.util.List;

public record FeatureModule(String name, String objective, List<String> capabilities) {
}
