package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
/* compiled from: ViewGroupOverlayApi18.java */
/* renamed from: ezb  reason: default package */
/* loaded from: classes.dex */
class ezb implements fzb {
    private final ViewGroupOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ezb(@NonNull ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // defpackage.a0c
    public void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.a0c
    public void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // defpackage.fzb
    public void c(@NonNull View view) {
        this.a.add(view);
    }

    @Override // defpackage.fzb
    public void d(@NonNull View view) {
        this.a.remove(view);
    }
}
