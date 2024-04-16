package com.inappstory.sdk.stories.api.models;
/* loaded from: classes3.dex */
public class StatisticPermissions {
    public boolean allowCrash;
    public boolean allowProfiling;
    public boolean allowStatV1;
    public boolean allowStatV2;

    public StatisticPermissions() {
        this.allowProfiling = false;
        this.allowStatV1 = true;
        this.allowStatV2 = false;
        this.allowCrash = false;
    }

    public StatisticPermissions(boolean z, Boolean bool, Boolean bool2, Boolean bool3) {
        this.allowStatV1 = true;
        this.allowStatV2 = false;
        this.allowCrash = false;
        this.allowProfiling = z;
        if (bool != null) {
            this.allowStatV1 = bool.booleanValue();
        }
        if (bool2 != null) {
            this.allowStatV2 = bool2.booleanValue();
        }
        if (bool3 != null) {
            this.allowCrash = bool3.booleanValue();
        }
    }
}
