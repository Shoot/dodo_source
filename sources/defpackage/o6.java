package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AdaptiveItemAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B[\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016j\u0002`\u0018\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lo6;", "VH", "D", "Ly75;", "Landroid/view/ViewGroup;", "viewGroup", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "dataList", "", e.a, "I", "maxCardHeight", "Lkotlin/Function1;", "", "isType", "Loyb;", "viewBinder", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Lcom/dodopizza/android/recyclerview/adapter/ViewHolderCreator;", "viewHolderCreator", "<init>", "(Lkotlin/jvm/functions/Function1;Loyb;Lkotlin/jvm/functions/Function2;Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o6  reason: default package */
/* loaded from: classes.dex */
public final class o6<VH, D> extends y75<VH, D> {
    private final List<Object> d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(Function1<Object, Boolean> function1, oyb<? super VH, ? super D> oybVar, Function2<? super ViewGroup, ? super LayoutInflater, ? extends RecyclerView.d0> function2, List<? extends Object> list) {
        super(function1, oybVar, function2);
        z65.h(function1, "isType");
        z65.h(oybVar, "viewBinder");
        z65.h(function2, "viewHolderCreator");
        z65.h(list, "dataList");
        this.d = list;
        this.e = -1;
    }

    @Override // defpackage.y75
    public RecyclerView.d0 a(ViewGroup viewGroup) {
        List<? extends Object> l;
        z65.h(viewGroup, "viewGroup");
        RecyclerView.d0 a = super.a(viewGroup);
        if (this.e < 0) {
            int i = 0;
            for (Object obj : this.d) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                oyb<VH, D> b = b();
                l = kc1.l();
                b.c(a, obj, i, l);
                View view = a.itemView;
                z65.g(view, "itemView");
                this.e = Math.max(un3.f(view), this.e);
                i = i2;
            }
        }
        ViewGroup.LayoutParams layoutParams = a.itemView.getLayoutParams();
        layoutParams.height = this.e;
        a.itemView.setLayoutParams(layoutParams);
        return a;
    }
}
