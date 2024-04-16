package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.cart.CartAPI;
import ru.dodopizza.backend.domain.cart.dto.AddToCartRequestDto;
import ru.dodopizza.backend.domain.cart.dto.EditInCartRequestDto;
import ru.dodopizza.backend.domain.cart.dto.RemoveFromCartRequestDto;
import ru.dodopizza.backend.domain.common.ObjectIdDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
import ru.dodopizza.backend.domain.state.dto.cart.CartProductDto;
import ru.dodopizza.backend.domain.state.dto.cart.request.CustomizationRequestDto;
import ru.dodopizza.backend.domain.state.dto.cart.request.PizzaHalvesRequestDto;
/* compiled from: CartQueueItemSenderImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\n #*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010$¨\u0006("}, d2 = {"Lvr0;", "Lur0;", "Lqr0$a;", "addToCartQueueItem", "Lru/dodopizza/backend/domain/cart/dto/AddToCartRequestDto;", "b", "Lqr0$c;", "editInCartQueueItem", "Lru/dodopizza/backend/domain/cart/dto/EditInCartRequestDto;", c.a, "Lqr0$d;", "removeFromCartQueueItem", "Lru/dodopizza/backend/domain/cart/dto/RemoveFromCartRequestDto;", DateTokenConverter.CONVERTER_KEY, "Lqr0;", "cartQueueItem", "", "a", "Las8;", "Lru/dodopizza/backend/domain/cart/CartAPI;", "Las8;", "cartApiProvider", "Lf8c;", "Lf8c;", "workflowIdProvider", "Ldua;", "Ldua;", "stateAnalyzer", "Lhq3;", "Lhq3;", "featureService", "Las0;", e.a, "Las0;", "cartQueueService", "kotlin.jvm.PlatformType", "()Lru/dodopizza/backend/domain/cart/CartAPI;", "cartApi", "<init>", "(Las8;Lf8c;Ldua;Lhq3;Las0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vr0  reason: default package */
/* loaded from: classes4.dex */
public final class vr0 implements ur0 {
    private final as8<CartAPI> a;
    private final f8c b;
    private final dua c;
    private final hq3 d;
    private final as0 e;

    public vr0(as8<CartAPI> as8Var, f8c f8cVar, dua duaVar, hq3 hq3Var, as0 as0Var) {
        z65.h(as8Var, "cartApiProvider");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(hq3Var, "featureService");
        z65.h(as0Var, "cartQueueService");
        this.a = as8Var;
        this.b = f8cVar;
        this.c = duaVar;
        this.d = hq3Var;
        this.e = as0Var;
    }

    private final AddToCartRequestDto b(qr0.a aVar) {
        int w;
        int w2;
        int w3;
        int w4;
        PizzaHalvesRequestDto pizzaHalvesRequestDto;
        int w5;
        Collection<xq0> collection;
        List l;
        int w6;
        int w7;
        Collection<xq0> collection2;
        List l2;
        int w8;
        int w9;
        Object Z;
        Object k0;
        int b = aVar.b();
        qq0 I = aVar.I();
        Collection<xq0> b2 = I.b();
        w = lc1.w(b2, 10);
        ArrayList<String> arrayList = new ArrayList(w);
        for (xq0 xq0Var : b2) {
            arrayList.add(xq0Var.getId());
        }
        w2 = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (String str : arrayList) {
            arrayList2.add(new ObjectIdDto(str));
        }
        Collection<xq0> a = I.a();
        w3 = lc1.w(a, 10);
        ArrayList<String> arrayList3 = new ArrayList(w3);
        for (xq0 xq0Var2 : a) {
            arrayList3.add(xq0Var2.getId());
        }
        w4 = lc1.w(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(w4);
        for (String str2 : arrayList3) {
            arrayList4.add(new ObjectIdDto(str2));
        }
        CustomizationRequestDto customizationRequestDto = new CustomizationRequestDto(arrayList2, arrayList4);
        List<mr0> z = aVar.z();
        if (!(!z.isEmpty())) {
            z = null;
        }
        if (z != null) {
            Z = sc1.Z(z);
            ObjectIdDto objectIdDto = new ObjectIdDto(((mr0) Z).getId());
            k0 = sc1.k0(z);
            pizzaHalvesRequestDto = new PizzaHalvesRequestDto(objectIdDto, new ObjectIdDto(((mr0) k0).getId()));
        } else {
            pizzaHalvesRequestDto = null;
        }
        List<dq0> w0 = aVar.w0();
        w5 = lc1.w(w0, 10);
        ArrayList arrayList5 = new ArrayList(w5);
        for (dq0 dq0Var : w0) {
            String id = dq0Var.getId();
            qq0 d = dq0Var.d();
            if (d != null) {
                collection = d.b();
            } else {
                collection = null;
            }
            l = kc1.l();
            Iterable<xq0> iterable = (Iterable) mh5.c(collection, l);
            w6 = lc1.w(iterable, 10);
            ArrayList<String> arrayList6 = new ArrayList(w6);
            for (xq0 xq0Var3 : iterable) {
                arrayList6.add(xq0Var3.getId());
            }
            w7 = lc1.w(arrayList6, 10);
            ArrayList arrayList7 = new ArrayList(w7);
            for (String str3 : arrayList6) {
                arrayList7.add(new ObjectIdDto(str3));
            }
            qq0 d2 = dq0Var.d();
            if (d2 != null) {
                collection2 = d2.a();
            } else {
                collection2 = null;
            }
            l2 = kc1.l();
            Iterable<xq0> iterable2 = (Iterable) mh5.c(collection2, l2);
            w8 = lc1.w(iterable2, 10);
            ArrayList<String> arrayList8 = new ArrayList(w8);
            for (xq0 xq0Var4 : iterable2) {
                arrayList8.add(xq0Var4.getId());
            }
            w9 = lc1.w(arrayList8, 10);
            ArrayList arrayList9 = new ArrayList(w9);
            for (String str4 : arrayList8) {
                arrayList9.add(new ObjectIdDto(str4));
            }
            arrayList5.add(new CartProductDto(id, new CustomizationRequestDto(arrayList7, arrayList9)));
        }
        return new AddToCartRequestDto(b, customizationRequestDto, arrayList5, pizzaHalvesRequestDto, aVar.v0(), aVar.X(), this.b.b());
    }

    private final EditInCartRequestDto c(qr0.c cVar) {
        int w;
        CustomizationRequestDto customizationRequestDto;
        int w2;
        int w3;
        int w4;
        int w5;
        Collection<xq0> collection;
        List l;
        int w6;
        int w7;
        List l2;
        int w8;
        int w9;
        String b = this.b.b();
        String value = cVar.a().getValue();
        String X = cVar.X();
        List<dq0> w0 = cVar.w0();
        w = lc1.w(w0, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = w0.iterator();
        while (true) {
            Collection<xq0> collection2 = null;
            if (!it.hasNext()) {
                break;
            }
            dq0 dq0Var = (dq0) it.next();
            String id = dq0Var.getId();
            qq0 d = dq0Var.d();
            if (d != null) {
                collection = d.b();
            } else {
                collection = null;
            }
            l = kc1.l();
            Iterable<xq0> iterable = (Iterable) mh5.c(collection, l);
            w6 = lc1.w(iterable, 10);
            ArrayList<String> arrayList2 = new ArrayList(w6);
            for (xq0 xq0Var : iterable) {
                arrayList2.add(xq0Var.getId());
            }
            w7 = lc1.w(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(w7);
            for (String str : arrayList2) {
                arrayList3.add(new ObjectIdDto(str));
            }
            qq0 d2 = dq0Var.d();
            if (d2 != null) {
                collection2 = d2.a();
            }
            l2 = kc1.l();
            Iterable<xq0> iterable2 = (Iterable) mh5.c(collection2, l2);
            w8 = lc1.w(iterable2, 10);
            ArrayList<String> arrayList4 = new ArrayList(w8);
            for (xq0 xq0Var2 : iterable2) {
                arrayList4.add(xq0Var2.getId());
            }
            w9 = lc1.w(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(w9);
            for (String str2 : arrayList4) {
                arrayList5.add(new ObjectIdDto(str2));
            }
            arrayList.add(new CartProductDto(id, new CustomizationRequestDto(arrayList3, arrayList5)));
        }
        qq0 I = cVar.I();
        if (I != null) {
            Collection<xq0> b2 = I.b();
            w2 = lc1.w(b2, 10);
            ArrayList<String> arrayList6 = new ArrayList(w2);
            for (xq0 xq0Var3 : b2) {
                arrayList6.add(xq0Var3.getId());
            }
            w3 = lc1.w(arrayList6, 10);
            ArrayList arrayList7 = new ArrayList(w3);
            for (String str3 : arrayList6) {
                arrayList7.add(new ObjectIdDto(str3));
            }
            Collection<xq0> a = I.a();
            w4 = lc1.w(a, 10);
            ArrayList<String> arrayList8 = new ArrayList(w4);
            for (xq0 xq0Var4 : a) {
                arrayList8.add(xq0Var4.getId());
            }
            w5 = lc1.w(arrayList8, 10);
            ArrayList arrayList9 = new ArrayList(w5);
            for (String str4 : arrayList8) {
                arrayList9.add(new ObjectIdDto(str4));
            }
            customizationRequestDto = new CustomizationRequestDto(arrayList7, arrayList9);
        } else {
            customizationRequestDto = null;
        }
        return new EditInCartRequestDto(b, value, arrayList, customizationRequestDto, X);
    }

    private final RemoveFromCartRequestDto d(qr0.d dVar) {
        return new RemoveFromCartRequestDto(dVar.b(), dVar.a().getValue(), this.b.b());
    }

    private final CartAPI e() {
        return this.a.get();
    }

    @Override // defpackage.ur0
    public void a(qr0 qr0Var) {
        StateDto removeFromCart;
        z65.h(qr0Var, "cartQueueItem");
        if (qr0Var instanceof qr0.a) {
            removeFromCart = e().addToCart(b((qr0.a) qr0Var));
        } else if (qr0Var instanceof qr0.c) {
            removeFromCart = e().editInCartV3(c((qr0.c) qr0Var));
        } else if (qr0Var instanceof qr0.d) {
            removeFromCart = e().removeFromCart(d((qr0.d) qr0Var));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.e.c(qr0Var, false);
        this.c.d(removeFromCart);
    }
}
