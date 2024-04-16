package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
/* compiled from: ViewOverlayApi18.java */
/* renamed from: xzb  reason: default package */
/* loaded from: classes2.dex */
class xzb implements zzb {
    private final ViewOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xzb(@NonNull View view) {
        this.a = view.getOverlay();
    }

    @Override // defpackage.zzb
    public void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.zzb
    public void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }
}
