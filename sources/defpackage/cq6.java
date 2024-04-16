package defpackage;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
/* compiled from: MultiWindowModeChangedInfo.java */
/* renamed from: cq6  reason: default package */
/* loaded from: classes.dex */
public final class cq6 {
    private final boolean a;
    private final Configuration b;

    public cq6(boolean z) {
        this.a = z;
        this.b = null;
    }

    public boolean a() {
        return this.a;
    }

    public cq6(boolean z, @NonNull Configuration configuration) {
        this.a = z;
        this.b = configuration;
    }
}
