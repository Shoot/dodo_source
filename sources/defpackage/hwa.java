package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lhwa;", "Liwa;", "Ljwa;", "params", "Landroid/text/StaticLayout;", "b", "layout", "", "useFallbackLineSpacing", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hwa  reason: default package */
/* loaded from: classes.dex */
public final class hwa implements iwa {
    public static final a a = new a(null);
    private static boolean b;
    private static Constructor<StaticLayout> c;

    /* compiled from: StaticLayoutFactory.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lhwa$a;", "", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "b", "", "isInitialized", "Z", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: hwa$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (hwa.b) {
                return hwa.c;
            }
            hwa.b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                hwa.c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                hwa.c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return hwa.c;
        }
    }

    @Override // defpackage.iwa
    public boolean a(StaticLayout staticLayout, boolean z) {
        z65.h(staticLayout, "layout");
        return false;
    }

    @Override // defpackage.iwa
    public StaticLayout b(jwa jwaVar) {
        z65.h(jwaVar, "params");
        Constructor b2 = a.b();
        StaticLayout staticLayout = null;
        if (b2 != null) {
            try {
                staticLayout = (StaticLayout) b2.newInstance(jwaVar.r(), Integer.valueOf(jwaVar.q()), Integer.valueOf(jwaVar.e()), jwaVar.o(), Integer.valueOf(jwaVar.u()), jwaVar.a(), jwaVar.s(), Float.valueOf(jwaVar.m()), Float.valueOf(jwaVar.l()), Boolean.valueOf(jwaVar.g()), jwaVar.c(), Integer.valueOf(jwaVar.d()), Integer.valueOf(jwaVar.n()));
            } catch (IllegalAccessException unused) {
                c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(jwaVar.r(), jwaVar.q(), jwaVar.e(), jwaVar.o(), jwaVar.u(), jwaVar.a(), jwaVar.m(), jwaVar.l(), jwaVar.g(), jwaVar.c(), jwaVar.d());
    }
}
