package ru.dodopizza.backend.domain.menu.dtov5;

import kotlin.Metadata;
/* compiled from: AllergyAdviceDtoV5.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/AllergyAdviceDtoV5;", "", "contains", "", "mayContain", "(Ljava/lang/String;Ljava/lang/String;)V", "getContains", "()Ljava/lang/String;", "getMayContain", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AllergyAdviceDtoV5 {
    @uca("contains")
    private final String contains;
    @uca("mayContain")
    private final String mayContain;

    public AllergyAdviceDtoV5(String str, String str2) {
        z65.h(str, "contains");
        z65.h(str2, "mayContain");
        this.contains = str;
        this.mayContain = str2;
    }

    public static /* synthetic */ AllergyAdviceDtoV5 copy$default(AllergyAdviceDtoV5 allergyAdviceDtoV5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allergyAdviceDtoV5.contains;
        }
        if ((i & 2) != 0) {
            str2 = allergyAdviceDtoV5.mayContain;
        }
        return allergyAdviceDtoV5.copy(str, str2);
    }

    public final String component1() {
        return this.contains;
    }

    public final String component2() {
        return this.mayContain;
    }

    public final AllergyAdviceDtoV5 copy(String str, String str2) {
        z65.h(str, "contains");
        z65.h(str2, "mayContain");
        return new AllergyAdviceDtoV5(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllergyAdviceDtoV5)) {
            return false;
        }
        AllergyAdviceDtoV5 allergyAdviceDtoV5 = (AllergyAdviceDtoV5) obj;
        if (z65.c(this.contains, allergyAdviceDtoV5.contains) && z65.c(this.mayContain, allergyAdviceDtoV5.mayContain)) {
            return true;
        }
        return false;
    }

    public final String getContains() {
        return this.contains;
    }

    public final String getMayContain() {
        return this.mayContain;
    }

    public int hashCode() {
        return (this.contains.hashCode() * 31) + this.mayContain.hashCode();
    }

    public String toString() {
        String str = this.contains;
        String str2 = this.mayContain;
        return "AllergyAdviceDtoV5(contains=" + str + ", mayContain=" + str2 + ")";
    }
}
