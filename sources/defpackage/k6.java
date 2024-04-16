package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AdapterBuilder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lk6;", "", "Ly75;", "itemAdapter", "", c.a, "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$d0;", DateTokenConverter.CONVERTER_KEY, "", "a", "Ljava/util/List;", "adapterList", "", "b", "itemAdapters", "<init>", "(Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k6  reason: default package */
/* loaded from: classes.dex */
public final class k6 {
    private final List<Object> a;
    private final List<y75<?, ?>> b;

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0004BU\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lk6$a;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "VH", "D", "", "Lk6;", "b", "a", "Lk6;", "adapterBuilder", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "isType", "Loyb;", c.a, "Loyb;", "viewBinder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "Landroid/view/LayoutInflater;", "Lcom/dodopizza/android/recyclerview/adapter/ViewHolderCreator;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "viewHolderCreator", "<init>", "(Lk6;Lkotlin/jvm/functions/Function1;Loyb;Lkotlin/jvm/functions/Function2;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k6$a */
    /* loaded from: classes.dex */
    public static final class a<VH extends RecyclerView.d0, D> {
        private final k6 a;
        private final Function1<Object, Boolean> b;
        private final oyb<VH, D> c;
        private final Function2<ViewGroup, LayoutInflater, RecyclerView.d0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k6 k6Var, Function1<Object, Boolean> function1, oyb<? super VH, ? super D> oybVar, Function2<? super ViewGroup, ? super LayoutInflater, ? extends RecyclerView.d0> function2) {
            z65.h(k6Var, "adapterBuilder");
            z65.h(function1, "isType");
            z65.h(oybVar, "viewBinder");
            z65.h(function2, "viewHolderCreator");
            this.a = k6Var;
            this.b = function1;
            this.c = oybVar;
            this.d = function2;
        }

        public final k6 a() {
            k6 k6Var = this.a;
            k6Var.c(new o6(this.b, this.c, this.d, k6Var.a));
            return k6Var;
        }

        public final k6 b() {
            k6 k6Var = this.a;
            k6Var.c(new y75(this.b, this.c, this.d));
            return k6Var;
        }
    }

    public k6(List<? extends Object> list) {
        z65.h(list, "adapterList");
        this.a = list;
        this.b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(y75<?, ?> y75Var) {
        this.b.add(y75Var);
    }

    public final RecyclerView.h<RecyclerView.d0> d() {
        return new vn1(this.a, this.b);
    }
}
