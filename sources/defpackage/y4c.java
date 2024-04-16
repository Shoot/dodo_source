package defpackage;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
/* compiled from: WindowIdApi18.java */
/* renamed from: y4c  reason: default package */
/* loaded from: classes.dex */
class y4c implements z4c {
    private final WindowId a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4c(@NonNull View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof y4c) && ((y4c) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
