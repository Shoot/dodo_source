package androidx.work.impl.model;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class SystemIdInfo {
    @NonNull
    public final String a;
    public final int b;

    public SystemIdInfo(@NonNull String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.b != systemIdInfo.b) {
            return false;
        }
        return this.a.equals(systemIdInfo.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
