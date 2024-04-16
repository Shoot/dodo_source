package defpackage;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.cr7;
import defpackage.s86;
import defpackage.v86;
import defpackage.w86;
import defpackage.y86;
import defpackage.z86;
/* compiled from: AbstractMarkwonPlugin.java */
/* renamed from: s1  reason: default package */
/* loaded from: classes3.dex */
public abstract class s1 implements v86 {
    public void afterSetText(@NonNull TextView textView) {
    }

    @Override // defpackage.v86
    public void beforeRender(@NonNull jz6 jz6Var) {
    }

    @Override // defpackage.v86
    public void configure(@NonNull v86.b bVar) {
    }

    @Override // defpackage.v86
    public void configureConfiguration(@NonNull s86.b bVar) {
    }

    @Override // defpackage.v86
    public void configureParser(@NonNull cr7.a aVar) {
    }

    @Override // defpackage.v86
    public void configureSpansFactory(@NonNull w86.a aVar) {
    }

    @Override // defpackage.v86
    public void configureTheme(@NonNull y86.a aVar) {
    }

    @Override // defpackage.v86
    public void configureVisitor(@NonNull z86.b bVar) {
    }

    @Override // defpackage.v86
    @NonNull
    public String processMarkdown(@NonNull String str) {
        return str;
    }

    @Override // defpackage.v86
    public void afterRender(@NonNull jz6 jz6Var, @NonNull z86 z86Var) {
    }

    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
    }
}
