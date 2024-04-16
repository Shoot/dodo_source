package defpackage;

import androidx.annotation.NonNull;
/* renamed from: ij4  reason: default package */
/* loaded from: classes.dex */
public enum ij4 {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");
    
    private final String a;

    ij4(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @yc5
    public String toString() {
        return this.a;
    }
}
