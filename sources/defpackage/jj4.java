package defpackage;

import androidx.annotation.NonNull;
/* renamed from: jj4  reason: default package */
/* loaded from: classes.dex */
public enum jj4 {
    INVISIBLE("invisible"),
    NORMAL("normal"),
    COMPACT("compact");
    
    private final String a;

    jj4(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @yc5
    public String toString() {
        return this.a;
    }
}
