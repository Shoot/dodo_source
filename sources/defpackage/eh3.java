package defpackage;

import androidx.annotation.NonNull;
/* compiled from: Encoding.java */
/* renamed from: eh3  reason: default package */
/* loaded from: classes2.dex */
public final class eh3 {
    private final String a;

    private eh3(@NonNull String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static eh3 b(@NonNull String str) {
        return new eh3(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh3)) {
            return false;
        }
        return this.a.equals(((eh3) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
