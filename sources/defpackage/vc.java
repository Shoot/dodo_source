package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
/* compiled from: AnalyticsExtensions.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u001a\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u001a\u0012\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u0007*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u001a\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004\u001a\u0014\u0010#\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0007\u001a\u0014\u0010%\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\"\u001a\u00020$H\u0007\u001a\u0012\u0010&\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\"\u001a\u00020!\u001a\u0014\u0010)\u001a\u00020\u0007*\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'\u001a\u001c\u0010*\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'\u001a\u001b\u0010,\u001a\u00020\u0007*\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010!¢\u0006\u0004\b,\u0010-\u001a\u0012\u00100\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u00020.\u001a\u0014\u00101\u001a\u00020\u0007*\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0004\u001a\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004022\b\u0010/\u001a\u0004\u0018\u00010\u0004\u001a\u0010\u00104\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0004\u001a\u000e\u00105\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.\u001a\u0012\u00107\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020!\u001a\u0012\u0010:\u001a\u00020\u0007*\u00020\u00072\u0006\u00109\u001a\u000208\u001a\u0012\u0010;\u001a\u00020\u0007*\u00020\u00072\u0006\u00109\u001a\u000208\u001a\u000e\u0010<\u001a\u00020\u00042\u0006\u00109\u001a\u000208¨\u0006="}, d2 = {"Lxq0;", "Lijb;", "toppingType", "", "", "", "g", "Lbc;", "Ld88;", "pizzeria", "w", "x", "", "Ltja;", "shoppingItems", "y", "Lqd;", "sender", "z", "", "isNewAddressSystem", Image.TYPE_HIGH, c.a, "paramName", "Lhn6;", "money", "o", "A", "orderId", "t", "id", "a", "b", "", "orderType", "l", "Ljk7;", Image.TYPE_MEDIUM, Image.TYPE_SMALL, "Lmi7;", "orderState", "q", "r", "orderNumber", "p", "(Lbc;Ljava/lang/Integer;)Lbc;", "Lkl8;", "category", "i", "j", "Lkotlin/Pair;", "k", "f", DateTokenConverter.CONVERTER_KEY, "index", "n", "Ldu7;", "paymentMethodType", "u", "v", e.a, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: vc  reason: default package */
/* loaded from: classes4.dex */
public final class vc {

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vc$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl8.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kl8.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kl8.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kl8.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kl8.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kl8.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kl8.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[du7.values().length];
            try {
                iArr2[du7.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[du7.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[du7.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[du7.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[du7.k.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[du7.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[du7.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[du7.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[du7.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[du7.o.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[du7.e.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final bc A(bc bcVar, String str) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "sender", str, false, 4, null);
    }

    public static final String a(String str) {
        String F;
        if (str != null) {
            F = l0b.F(str, "-", "", false, 4, null);
            return F;
        }
        return null;
    }

    public static final String b(String str) {
        String q0;
        z65.h(str, "id");
        q0 = m0b.q0(str, "_M");
        return q0;
    }

    private static final String c(boolean z) {
        if (z) {
            return "new";
        }
        return "old";
    }

    public static final String d(kl8 kl8Var) {
        z65.h(kl8Var, "category");
        switch (a.$EnumSwitchMapping$0[kl8Var.ordinal()]) {
            case 1:
                return ProductEntity.TYPE_PIZZA;
            case 2:
                return "drinks";
            case 3:
                return "snacks";
            case 4:
                return "sauces";
            case 5:
                return "other";
            case 6:
                return "desserts";
            case 7:
                return "hot_and_ready";
            case 8:
                return "combo";
            case 9:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String e(du7 du7Var) {
        z65.h(du7Var, "paymentMethodType");
        switch (a.$EnumSwitchMapping$1[du7Var.ordinal()]) {
            case 1:
                return "cash";
            case 2:
                return "terminal";
            case 3:
                return "google pay";
            case 4:
                return "card";
            case 5:
                return "saved card";
            case 6:
                return "paypal";
            case 7:
                return "sber pay";
            case 8:
                return "app2app pay";
            case 9:
                return "apple pay";
            case 10:
                return "sbp pay";
            case 11:
                return "undefined";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String f(String str) {
        kl8.a aVar = kl8.a.a;
        if (str == null) {
            str = "";
        }
        return d(aVar.b(str));
    }

    public static final Map<String, Object> g(xq0 xq0Var, ijb ijbVar) {
        Map<String, Object> k;
        z65.h(xq0Var, "<this>");
        z65.h(ijbVar, "toppingType");
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, xq0Var.getName()), lnb.a("price", Double.valueOf(xq0Var.h().a())), lnb.a("quantity", 1), lnb.a("toppingId", xq0Var.getId()), lnb.a(MessageAttributes.TYPE, ijbVar.a()));
        return k;
    }

    public static final bc h(bc bcVar, boolean z) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "address_system", c(z), false, 4, null);
    }

    public static final bc i(bc bcVar, kl8 kl8Var) {
        z65.h(bcVar, "<this>");
        z65.h(kl8Var, "category");
        return bc.e(bcVar, "category", d(kl8Var), false, 4, null);
    }

    public static final bc j(bc bcVar, String str) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "category", f(str), false, 4, null);
    }

    public static final Pair<String, String> k(String str) {
        return lnb.a("category", f(str));
    }

    public static final bc l(bc bcVar, int i) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "deliveryType", uc.a.b(i), false, 4, null);
    }

    public static final bc m(bc bcVar, jk7 jk7Var) {
        z65.h(bcVar, "<this>");
        z65.h(jk7Var, "orderType");
        return l(bcVar, jk7Var.i());
    }

    public static final bc n(bc bcVar, int i) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "position", Integer.valueOf(i + 1), false, 4, null);
    }

    public static final bc o(bc bcVar, String str, hn6 hn6Var) {
        z65.h(bcVar, "<this>");
        z65.h(str, "paramName");
        z65.h(hn6Var, "money");
        return bc.e(bcVar, str, Double.valueOf(hn6Var.a()), false, 4, null);
    }

    public static final bc p(bc bcVar, Integer num) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "orderNumber", num, false, 4, null);
    }

    public static final bc q(bc bcVar, mi7 mi7Var) {
        z65.h(bcVar, "<this>");
        return r(bcVar, "status", mi7Var);
    }

    public static final bc r(bc bcVar, String str, mi7 mi7Var) {
        z65.h(bcVar, "<this>");
        z65.h(str, "paramName");
        return bc.e(bcVar, str, uc.a.a(mi7Var), false, 4, null);
    }

    public static final bc s(bc bcVar, int i) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "orderType", uc.a.b(i), false, 4, null);
    }

    public static final bc t(bc bcVar, String str) {
        z65.h(bcVar, "<this>");
        return bc.e(bcVar, "orderUUId", a(str), false, 4, null);
    }

    public static final bc u(bc bcVar, du7 du7Var) {
        z65.h(bcVar, "<this>");
        z65.h(du7Var, "paymentMethodType");
        return bc.e(bcVar, "payment_type", e(du7Var), false, 4, null);
    }

    public static final bc v(bc bcVar, du7 du7Var) {
        z65.h(bcVar, "<this>");
        z65.h(du7Var, "paymentMethodType");
        return bc.e(bcVar, "paymentType", e(du7Var), false, 4, null);
    }

    public static final bc w(bc bcVar, d88 d88Var) {
        z65.h(bcVar, "<this>");
        if (d88Var != null) {
            bc.e(bcVar, "pizzeriaName", d88Var.getName(), false, 4, null);
            bc.e(bcVar, "pizzeriaUUId", a(d88Var.getId()), false, 4, null);
        }
        return bcVar;
    }

    public static final bc x(bc bcVar, d88 d88Var) {
        String F;
        z65.h(bcVar, "<this>");
        if (d88Var != null) {
            bc e = bc.e(bcVar, "pizzeria_name", d88Var.getName(), false, 4, null);
            F = l0b.F(d88Var.getId(), "-", "", false, 4, null);
            bc.e(e, "pizzeria_id", F, false, 4, null);
        }
        return bcVar;
    }

    public static final bc y(bc bcVar, Collection<? extends tja> collection) {
        int w;
        z65.h(bcVar, "<this>");
        z65.h(collection, "shoppingItems");
        Collection<? extends tja> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tja tjaVar : collection2) {
            arrayList.add(tjaVar.Y().getId());
        }
        return bc.e(bcVar, "productIds", arrayList, false, 4, null);
    }

    public static final bc z(bc bcVar, qd qdVar) {
        String str;
        z65.h(bcVar, "<this>");
        if (qdVar != null) {
            str = qdVar.getValue();
        } else {
            str = null;
        }
        return A(bcVar, str);
    }
}
