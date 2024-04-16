package defpackage;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\f"}, d2 = {"Luva;", "Liwa;", "Ljwa;", "params", "Landroid/text/StaticLayout;", "b", "layout", "", "useFallbackLineSpacing", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uva  reason: default package */
/* loaded from: classes.dex */
final class uva implements iwa {
    @Override // defpackage.iwa
    public boolean a(StaticLayout staticLayout, boolean z) {
        z65.h(staticLayout, "layout");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return fwa.a(staticLayout);
        }
        if (i < 28) {
            return false;
        }
        return z;
    }

    @Override // defpackage.iwa
    public StaticLayout b(jwa jwaVar) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        z65.h(jwaVar, "params");
        obtain = StaticLayout.Builder.obtain(jwaVar.r(), jwaVar.q(), jwaVar.e(), jwaVar.o(), jwaVar.u());
        obtain.setTextDirection(jwaVar.s());
        obtain.setAlignment(jwaVar.a());
        obtain.setMaxLines(jwaVar.n());
        obtain.setEllipsize(jwaVar.c());
        obtain.setEllipsizedWidth(jwaVar.d());
        obtain.setLineSpacing(jwaVar.l(), jwaVar.m());
        obtain.setIncludePad(jwaVar.g());
        obtain.setBreakStrategy(jwaVar.b());
        obtain.setHyphenationFrequency(jwaVar.f());
        obtain.setIndents(jwaVar.i(), jwaVar.p());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            z65.g(obtain, "this");
            wva.a(obtain, jwaVar.h());
        }
        if (i >= 28) {
            z65.g(obtain, "this");
            yva.a(obtain, jwaVar.t());
        }
        if (i >= 33) {
            z65.g(obtain, "this");
            fwa.b(obtain, jwaVar.j(), jwaVar.k());
        }
        build = obtain.build();
        z65.g(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
