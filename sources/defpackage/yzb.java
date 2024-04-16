package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
/* compiled from: ViewOverlayApi18.java */
/* renamed from: yzb  reason: default package */
/* loaded from: classes.dex */
class yzb implements a0c {
    private final ViewOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yzb(@NonNull View view) {
        this.a = view.getOverlay();
    }

    @Override // defpackage.a0c
    public void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.a0c
    public void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }
}
