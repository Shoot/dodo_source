package androidx.work.impl.model;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class Preference {
    @NonNull
    public String a;
    public Long b;

    public Preference(@NonNull String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.a.equals(preference.a)) {
            return false;
        }
        Long l = this.b;
        Long l2 = preference.b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public Preference(@NonNull String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }
}
