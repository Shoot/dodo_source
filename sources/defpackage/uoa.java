package defpackage;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.snackbar.Snackbar;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SnackBarExtensions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u00102\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J\u0014\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J$\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rJ\u0006\u0010\u0011\u001a\u00020\u000eR\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006 "}, d2 = {"Luoa;", "", "Lkotlin/Function0;", "Landroid/view/View;", "provider", "", e.a, "", DateTokenConverter.CONVERTER_KEY, "", Image.TYPE_HIGH, "f", "titleRes", "Lkotlin/Function1;", "Lcom/google/android/material/snackbar/Snackbar;", "listener", "g", "b", "a", "I", "durationInSeconds", "linesCount", c.a, "Lkotlin/jvm/functions/Function0;", "viewProvider", "Ljava/lang/String;", "message", "titleResource", "Lkotlin/jvm/functions/Function1;", "actionListener", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uoa  reason: default package */
/* loaded from: classes.dex */
public final class uoa {
    public static final a g = new a(null);
    private int a;
    private Function0<? extends View> c;
    private Function1<? super Snackbar, Unit> f;
    private int b = Integer.MAX_VALUE;
    private String d = "";
    private int e = -1;

    /* compiled from: SnackBarExtensions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Luoa$a;", "", "", "DEFAULT_PADDING", "F", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uoa$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(uoa uoaVar, Snackbar snackbar, View view) {
        z65.h(uoaVar, "this$0");
        z65.h(snackbar, "$this_apply");
        Function1<? super Snackbar, Unit> function1 = uoaVar.f;
        if (function1 != null) {
            function1.invoke(snackbar);
        }
    }

    public final Snackbar b() {
        Function0<? extends View> function0 = this.c;
        if (function0 == null) {
            z65.z("viewProvider");
            function0 = null;
        }
        final Snackbar i0 = Snackbar.i0(function0.invoke(), this.d, 0);
        z65.g(i0, "make(...)");
        i0.Q((int) TimeUnit.SECONDS.toMillis(this.a));
        coa.d(i0);
        coa.g(i0);
        coa.c(i0, this.b);
        coa.f(i0);
        coa.e(i0, 8.0f);
        if (this.f != null) {
            i0.k0(this.e, new View.OnClickListener() { // from class: toa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uoa.c(uoa.this, i0, view);
                }
            });
        }
        return i0;
    }

    public final void d(Function0<Integer> function0) {
        z65.h(function0, "provider");
        this.a = function0.invoke().intValue();
    }

    public final void e(Function0<? extends View> function0) {
        z65.h(function0, "provider");
        this.c = function0;
    }

    public final void f(Function0<Integer> function0) {
        z65.h(function0, "provider");
        this.b = function0.invoke().intValue();
    }

    public final void g(int i, Function1<? super Snackbar, Unit> function1) {
        z65.h(function1, "listener");
        this.e = i;
        this.f = function1;
    }

    public final void h(Function0<String> function0) {
        z65.h(function0, "provider");
        this.d = function0.invoke();
    }
}
