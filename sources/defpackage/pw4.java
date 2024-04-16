package defpackage;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.s86;
import defpackage.w86;
/* compiled from: ImagesPlugin.java */
/* renamed from: pw4  reason: default package */
/* loaded from: classes3.dex */
public class pw4 extends s1 {
    private final zx a;

    /* compiled from: ImagesPlugin.java */
    /* renamed from: pw4$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    pw4() {
        this(new zx());
    }

    @NonNull
    public static pw4 a() {
        return new pw4();
    }

    @Override // defpackage.s1
    public void afterSetText(@NonNull TextView textView) {
        dy.b(textView);
    }

    @Override // defpackage.s1
    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
        dy.c(textView);
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureConfiguration(@NonNull s86.b bVar) {
        bVar.h(this.a.c());
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureSpansFactory(@NonNull w86.a aVar) {
        aVar.b(bu4.class, new tv4());
    }

    pw4(@NonNull zx zxVar) {
        this.a = zxVar;
    }
}
