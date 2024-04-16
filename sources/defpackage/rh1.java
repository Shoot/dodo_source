package defpackage;

import android.content.Context;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter.ComboProductViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ComboProductBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lrh1;", "Loyb;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/ComboProductViewHolder;", "Lxg7;", "view", "data", "", "position", "", "f", "Lg78;", "a", "Lg78;", "pizzaDoughNameFormatter", "<init>", "(Lg78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rh1  reason: default package */
/* loaded from: classes2.dex */
public final class rh1 extends oyb<ComboProductViewHolder, xg7> {
    private final g78 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rh1$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<String, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(String str) {
            z65.h(str, "it");
            return qhb.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rh1$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<String, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(String str) {
            z65.h(str, "it");
            return qhb.a(str);
        }
    }

    public rh1(g78 g78Var) {
        z65.h(g78Var, "pizzaDoughNameFormatter");
        this.a = g78Var;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(ComboProductViewHolder comboProductViewHolder, xg7 xg7Var, int i) {
        String i0;
        String i02;
        z65.h(comboProductViewHolder, "view");
        z65.h(xg7Var, "data");
        comboProductViewHolder.hideDescription();
        comboProductViewHolder.hideFooter();
        Context context = comboProductViewHolder.itemView.getContext();
        z65.g(context, "getContext(...)");
        comboProductViewHolder.setTitle(ql8.c(context, xg7Var.d(), xg7Var.getName(), xg7Var.e().b()));
        comboProductViewHolder.showImage(xg7Var.b(), ff4.a());
        String c = xg7Var.e().c();
        String a2 = xg7Var.e().a();
        if (c != null && a2 != null) {
            comboProductViewHolder.showSizeDescription(this.a.b(c, a2));
        } else {
            comboProductViewHolder.hideSizeDescription();
        }
        List<String> c2 = xg7Var.a().c();
        if (!c2.isEmpty()) {
            i02 = sc1.i0(c2, null, null, null, 0, null, a.a, 31, null);
            comboProductViewHolder.showToppingDescription(i02);
        } else {
            comboProductViewHolder.hideToppingDescription();
        }
        List<String> b2 = xg7Var.a().b();
        if (!b2.isEmpty()) {
            i0 = sc1.i0(b2, null, null, null, 0, null, b.a, 31, null);
            comboProductViewHolder.showRemovedIngredient(i0);
            return;
        }
        comboProductViewHolder.hideRemovedIngredient();
    }
}
