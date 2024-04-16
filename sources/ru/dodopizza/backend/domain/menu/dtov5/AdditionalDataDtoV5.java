package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: AdditionalDataDtoV5.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "", Action.KEY_ATTRIBUTE, "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalDataDtoV5 {
    @uca(Action.KEY_ATTRIBUTE)
    private final String key;
    @uca("value")
    private final String value;

    public AdditionalDataDtoV5(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ AdditionalDataDtoV5 copy$default(AdditionalDataDtoV5 additionalDataDtoV5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalDataDtoV5.key;
        }
        if ((i & 2) != 0) {
            str2 = additionalDataDtoV5.value;
        }
        return additionalDataDtoV5.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final AdditionalDataDtoV5 copy(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, "value");
        return new AdditionalDataDtoV5(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalDataDtoV5)) {
            return false;
        }
        AdditionalDataDtoV5 additionalDataDtoV5 = (AdditionalDataDtoV5) obj;
        if (z65.c(this.key, additionalDataDtoV5.key) && z65.c(this.value, additionalDataDtoV5.value)) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        return "AdditionalDataDtoV5(key=" + str + ", value=" + str2 + ")";
    }
}
