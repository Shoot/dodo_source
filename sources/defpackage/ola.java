package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter.SimpleOrderItemVH;
import defpackage.xf7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SimpleOrderItemBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lola;", "Loyb;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/adapter/SimpleOrderItemVH;", "Lxf7$b;", "view", "data", "", "position", "", "f", "Lg78;", "a", "Lg78;", "pizzaDoughNameFormatter", "<init>", "(Lg78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ola  reason: default package */
/* loaded from: classes2.dex */
public final class ola extends oyb<SimpleOrderItemVH, xf7.b> {
    private final g78 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleOrderItemBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ola$a */
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
    /* compiled from: SimpleOrderItemBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ola$b */
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

    public ola(g78 g78Var) {
        z65.h(g78Var, "pizzaDoughNameFormatter");
        this.a = g78Var;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(SimpleOrderItemVH simpleOrderItemVH, xf7.b bVar, int i) {
        String i0;
        String i02;
        Object Z;
        Object k0;
        z65.h(simpleOrderItemVH, "view");
        z65.h(bVar, "data");
        xg7 a2 = bVar.a();
        simpleOrderItemVH.setPrice(bVar.h());
        simpleOrderItemVH.setTitle(a2.getName());
        if (a2.d() == kl8.b && a2.e().c() != null && a2.e().a() != null) {
            simpleOrderItemVH.setSizeDescription(this.a.b(a2.e().c(), a2.e().a()));
        } else {
            simpleOrderItemVH.setProductSize(a2.e());
        }
        List<String> a3 = a2.a().a();
        List<String> list = null;
        if (!(!a3.isEmpty())) {
            a3 = null;
        }
        if (a3 != null) {
            Z = sc1.Z(a3);
            k0 = sc1.k0(a3);
            simpleOrderItemVH.showHalvesImages((String) Z, (String) k0, a2.c());
        } else {
            simpleOrderItemVH.setImageUrl(a2.b(), ff4.a());
        }
        List<String> c = a2.a().c();
        if (!(!c.isEmpty())) {
            c = null;
        }
        if (c != null) {
            i02 = sc1.i0(c, null, null, null, 0, null, a.a, 31, null);
            simpleOrderItemVH.setToppings(i02);
        }
        List<String> b2 = a2.a().b();
        if (!b2.isEmpty()) {
            list = b2;
        }
        if (list != null) {
            i0 = sc1.i0(list, null, null, null, 0, null, b.a, 31, null);
            simpleOrderItemVH.setRemovedIngredients(i0);
        }
    }
}
