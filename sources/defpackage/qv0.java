package defpackage;

import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import defpackage.c8c;
import defpackage.ov0;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChangeWorkflowResultHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lqv0;", "Lpv0;", "Lkotlin/Function1;", "Lcom/dodopizza/persistence/entity/StateErrorEntity;", "Lc8c;", "b", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "newState", "Lov0;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qv0  reason: default package */
/* loaded from: classes4.dex */
public final class qv0 implements pv0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChangeWorkflowResultHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/persistence/entity/StateErrorEntity;", "Lc8c;", "a", "(Lcom/dodopizza/persistence/entity/StateErrorEntity;)Lc8c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qv0$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<StateErrorEntity, c8c> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c8c invoke(StateErrorEntity stateErrorEntity) {
            boolean y;
            z65.h(stateErrorEntity, "$this$null");
            Integer errorCode = stateErrorEntity.getErrorCode();
            String str = "";
            if (errorCode != null && errorCode.intValue() == 222) {
                String description = stateErrorEntity.getDescription();
                if (description != null) {
                    str = description;
                }
                return new c8c.e(str);
            } else if (errorCode != null && errorCode.intValue() == 260) {
                String description2 = stateErrorEntity.getDescription();
                if (description2 != null) {
                    str = description2;
                }
                return new c8c.b(str);
            } else if (errorCode != null && errorCode.intValue() == 204) {
                return c8c.g.a;
            } else {
                if (errorCode != null && errorCode.intValue() == 221) {
                    return c8c.g.a;
                }
                if (errorCode != null && errorCode.intValue() == 220) {
                    return c8c.g.a;
                }
                if (errorCode != null && errorCode.intValue() == 203) {
                    return c8c.f.a;
                }
                if (errorCode != null && errorCode.intValue() == 211) {
                    return c8c.k.a;
                }
                if (errorCode != null && errorCode.intValue() == 212) {
                    return c8c.c.a;
                }
                if (errorCode != null && errorCode.intValue() == 213) {
                    return c8c.a.a;
                }
                if (errorCode != null && errorCode.intValue() == 34) {
                    return c8c.i.a;
                }
                if (errorCode != null && errorCode.intValue() == 102) {
                    return c8c.j.a;
                }
                if (errorCode != null && errorCode.intValue() == 39) {
                    String description3 = stateErrorEntity.getDescription();
                    if (description3 != null) {
                        str = description3;
                    }
                    return new c8c.d(str);
                }
                String description4 = stateErrorEntity.getDescription();
                if (description4 != null) {
                    y = l0b.y(description4);
                    if (!y) {
                        String description5 = stateErrorEntity.getDescription();
                        if (description5 != null) {
                            str = description5;
                        }
                        return new c8c.h(str, stateErrorEntity.getErrorCode());
                    }
                }
                return c8c.l.a;
            }
        }
    }

    private final Function1<StateErrorEntity, c8c> b() {
        return a.a;
    }

    @Override // defpackage.pv0
    public ov0 a(StateEntity stateEntity) {
        Integer errorCode;
        Integer errorCode2;
        Integer errorCode3;
        int w;
        Collection<nr0> collection;
        List l;
        z65.h(stateEntity, "newState");
        k0<StateErrorEntity> errors = stateEntity.getErrors();
        boolean z = false;
        if (!(errors instanceof Collection) || !errors.isEmpty()) {
            for (StateErrorEntity stateErrorEntity : errors) {
                Integer errorCode4 = stateErrorEntity.getErrorCode();
                if ((errorCode4 != null && errorCode4.intValue() == 21) || (((errorCode = stateErrorEntity.getErrorCode()) != null && errorCode.intValue() == 2) || (((errorCode2 = stateErrorEntity.getErrorCode()) != null && errorCode2.intValue() == 38) || ((errorCode3 = stateErrorEntity.getErrorCode()) != null && errorCode3.intValue() == 37)))) {
                    z = true;
                    break;
                }
            }
        }
        if ((!stateEntity.getErrors().isEmpty()) && z) {
            CartEntity cart = stateEntity.getCart();
            if (cart != null) {
                collection = mq0.a.a(cart);
            } else {
                collection = null;
            }
            l = kc1.l();
            return new ov0.a.c((Collection) mh5.c(collection, l));
        } else if (!stateEntity.getErrors().isEmpty()) {
            k0<StateErrorEntity> errors2 = stateEntity.getErrors();
            Function1<StateErrorEntity, c8c> b = b();
            w = lc1.w(errors2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (StateErrorEntity stateErrorEntity2 : errors2) {
                arrayList.add(b.invoke(stateErrorEntity2));
            }
            return new ov0.a.e(arrayList);
        } else {
            Integer cartError = stateEntity.getCartError();
            if (cartError != null && cartError.intValue() == 20) {
                return ov0.a.b.a;
            }
            Integer cartError2 = stateEntity.getCartError();
            if (cartError2 != null && cartError2.intValue() == 715827882) {
                return ov0.a.d.a;
            }
            Integer cartError3 = stateEntity.getCartError();
            if (cartError3 != null && cartError3.intValue() == 1073741823) {
                return ov0.a.C0471a.a;
            }
            return ov0.b.a;
        }
    }
}
