package defpackage;

import defpackage.k;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ABTestValidator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Ll;", "", "Lk;", "item", "", "b", "Lzx9;", "a", "Lzx9;", "sdkVersionValidator", "Lbxb;", "Lrn5;", "()Lbxb;", "variantsValidator", "<init>", "(Lzx9;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public final class l {
    private final zx9 a;
    private final rn5 b;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            k.a.C0405a modulus = ((k.a) t).getModulus();
            z65.e(modulus);
            Integer lower = modulus.getLower();
            k.a.C0405a modulus2 = ((k.a) t2).getModulus();
            z65.e(modulus2);
            d = mk1.d(lower, modulus2.getLower());
            return d;
        }
    }

    /* compiled from: ABTestValidator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbxb;", "a", "()Lbxb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<bxb> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final bxb invoke() {
            return new bxb();
        }
    }

    public l(zx9 zx9Var) {
        rn5 b2;
        z65.h(zx9Var, "sdkVersionValidator");
        this.a = zx9Var;
        b2 = yn5.b(b.a);
        this.b = b2;
    }

    private final bxb a() {
        return (bxb) this.b.getValue();
    }

    public boolean b(k kVar) {
        boolean y;
        boolean y2;
        List<k.a> y0;
        Integer lower;
        if (kVar != null) {
            y = l0b.y(kVar.getId());
            if (y) {
                gk6.f(this, "The field 'id' in abtests block cannot be null. All abtests will not be used.", null, 2, null);
                return false;
            } else if (kVar.getSdkVersion() != null && this.a.a(kVar.getSdkVersion())) {
                String salt = kVar.getSalt();
                if (salt != null) {
                    y2 = l0b.y(salt);
                    if (!y2) {
                        if (kVar.getVariants() != null && kVar.getVariants().size() >= 2) {
                            List<k.a> variants = kVar.getVariants();
                            if (!(variants instanceof Collection) || !variants.isEmpty()) {
                                for (k.a aVar : variants) {
                                    if (!a().a(aVar)) {
                                        gk6.f(this, "In abtest " + kVar.getId() + " 'variants' field is invalid. All abtests will not be used.", null, 2, null);
                                        return false;
                                    }
                                }
                            }
                            y0 = sc1.y0(kVar.getVariants(), new a());
                            int i = 0;
                            for (k.a aVar2 : y0) {
                                k.a.C0405a modulus = aVar2.getModulus();
                                if (modulus != null && (lower = modulus.getLower()) != null && lower.intValue() == i) {
                                    Integer upper = aVar2.getModulus().getUpper();
                                    z65.e(upper);
                                    i = upper.intValue();
                                } else {
                                    gk6.f(this, "In abtest " + kVar.getId() + " 'variants' field not have full cover. All abtests will not be used.", null, 2, null);
                                    return false;
                                }
                            }
                            if (99 <= i && i < 101) {
                                return true;
                            }
                            gk6.f(this, "In abtest " + kVar.getId() + " 'variants' field not have full cover. All abtests will not be used.", null, 2, null);
                            return false;
                        }
                        gk6.f(this, "In abtest " + kVar.getId() + " 'variants' field must have at least two items. All abtests will not be used.", null, 2, null);
                        return false;
                    }
                }
                gk6.f(this, "In abtest " + kVar.getId() + " 'salt' field is invalid. All abtests will not be used.", null, 2, null);
                return false;
            } else {
                gk6.f(this, "In abtest " + kVar.getId() + " 'sdkVersion' field is invalid. All abtests will not be used.", null, 2, null);
                return false;
            }
        }
        gk6.f(this, "The element in abtests block cannot be null. All abtests will not be used.", null, 2, null);
        return false;
    }
}
