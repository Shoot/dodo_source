package defpackage;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
/* compiled from: PictureInPictureModeChangedInfo.java */
/* renamed from: d68  reason: default package */
/* loaded from: classes.dex */
public final class d68 {
    private final boolean a;
    private final Configuration b;

    public d68(boolean z) {
        this.a = z;
        this.b = null;
    }

    public boolean a() {
        return this.a;
    }

    public d68(boolean z, @NonNull Configuration configuration) {
        this.a = z;
        this.b = configuration;
    }
}
