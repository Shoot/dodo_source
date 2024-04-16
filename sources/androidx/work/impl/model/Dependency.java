package androidx.work.impl.model;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class Dependency {
    @NonNull
    public final String a;
    @NonNull
    public final String b;

    public Dependency(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
    }
}
