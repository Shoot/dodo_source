package ru.dodopizza.backend.domain.state.dto.personalization;

import kotlin.Metadata;
/* compiled from: UpsellProducts.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/AdditionalData;", "", "experiment", "", "group", "reason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExperiment", "()Ljava/lang/String;", "getGroup", "getReason", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalData {
    @uca("experiment")
    private final String experiment;
    @uca("group")
    private final String group;
    @uca("reason")
    private final String reason;

    public AdditionalData(String str, String str2, String str3) {
        this.experiment = str;
        this.group = str2;
        this.reason = str3;
    }

    public static /* synthetic */ AdditionalData copy$default(AdditionalData additionalData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalData.experiment;
        }
        if ((i & 2) != 0) {
            str2 = additionalData.group;
        }
        if ((i & 4) != 0) {
            str3 = additionalData.reason;
        }
        return additionalData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.experiment;
    }

    public final String component2() {
        return this.group;
    }

    public final String component3() {
        return this.reason;
    }

    public final AdditionalData copy(String str, String str2, String str3) {
        return new AdditionalData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalData)) {
            return false;
        }
        AdditionalData additionalData = (AdditionalData) obj;
        if (z65.c(this.experiment, additionalData.experiment) && z65.c(this.group, additionalData.group) && z65.c(this.reason, additionalData.reason)) {
            return true;
        }
        return false;
    }

    public final String getExperiment() {
        return this.experiment;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.experiment;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.group;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.reason;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.experiment;
        String str2 = this.group;
        String str3 = this.reason;
        return "AdditionalData(experiment=" + str + ", group=" + str2 + ", reason=" + str3 + ")";
    }
}
