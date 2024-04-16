package defpackage;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "a", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: mzb  reason: default package */
/* loaded from: classes.dex */
public final class mzb {

    /* compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: mzb$a */
    /* loaded from: classes.dex */
    /* synthetic */ class a extends m94 implements Function1<ViewParent, ViewParent> {
        public static final a a = new a();

        a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final ViewParent invoke(ViewParent viewParent) {
            z65.h(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    public static final Sequence<ViewParent> a(View view) {
        Sequence<ViewParent> e;
        z65.h(view, "<this>");
        e = bca.e(view.getParent(), a.a);
        return e;
    }
}
