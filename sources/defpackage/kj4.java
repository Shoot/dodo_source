package defpackage;

import androidx.annotation.NonNull;
/* renamed from: kj4  reason: default package */
/* loaded from: classes.dex */
public enum kj4 {
    DARK("dark"),
    LIGHT("light"),
    CONTRAST("contrast");
    
    private final String a;

    kj4(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @yc5
    public String toString() {
        return this.a;
    }
}
