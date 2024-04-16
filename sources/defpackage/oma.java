package defpackage;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SingleOnClickListener.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "", "l", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: oma  reason: default package */
/* loaded from: classes.dex */
public final class oma {

    /* compiled from: SingleOnClickListener.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"oma$a", "Lnma;", "Landroid/view/View;", "v", "", DateTokenConverter.CONVERTER_KEY, "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oma$a */
    /* loaded from: classes.dex */
    public static final class a extends nma {
        final /* synthetic */ Function1<View, Unit> f;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super View, Unit> function1) {
            this.f = function1;
        }

        @Override // defpackage.nma
        public void d(View view) {
            z65.h(view, "v");
            this.f.invoke(view);
        }
    }

    public static final void a(View view, Function1<? super View, Unit> function1) {
        z65.h(view, "<this>");
        z65.h(function1, "l");
        view.setOnClickListener(new a(function1));
    }
}
