package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ItemAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003BM\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Ly75;", "VH", "D", "", "Landroid/view/ViewGroup;", "viewGroup", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", c.a, "()Lkotlin/jvm/functions/Function1;", "isType", "Loyb;", "b", "Loyb;", "()Loyb;", "viewBinder", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Lcom/dodopizza/android/recyclerview/adapter/ViewHolderCreator;", "Lkotlin/jvm/functions/Function2;", "viewHolderCreator", "<init>", "(Lkotlin/jvm/functions/Function1;Loyb;Lkotlin/jvm/functions/Function2;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y75  reason: default package */
/* loaded from: classes.dex */
public class y75<VH, D> {
    private final Function1<Object, Boolean> a;
    private final oyb<VH, D> b;
    private final Function2<ViewGroup, LayoutInflater, RecyclerView.d0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public y75(Function1<Object, Boolean> function1, oyb<? super VH, ? super D> oybVar, Function2<? super ViewGroup, ? super LayoutInflater, ? extends RecyclerView.d0> function2) {
        z65.h(function1, "isType");
        z65.h(oybVar, "viewBinder");
        z65.h(function2, "viewHolderCreator");
        this.a = function1;
        this.b = oybVar;
        this.c = function2;
    }

    public RecyclerView.d0 a(ViewGroup viewGroup) {
        z65.h(viewGroup, "viewGroup");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Function2<ViewGroup, LayoutInflater, RecyclerView.d0> function2 = this.c;
        z65.e(from);
        return function2.invoke(viewGroup, from);
    }

    public final oyb<VH, D> b() {
        return this.b;
    }

    public final Function1<Object, Boolean> c() {
        return this.a;
    }
}
