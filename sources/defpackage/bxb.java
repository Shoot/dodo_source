package defpackage;

import defpackage.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VariantValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lbxb;", "", "Lk$a;", "item", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bxb  reason: default package */
/* loaded from: classes.dex */
public final class bxb {
    public static final a a = new a(null);

    /* compiled from: VariantValidator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lbxb$a;", "", "", "ALL", "Ljava/lang/String;", "CONCRETE", "TYPE_IN_APPS", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: bxb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean a(k.a aVar) {
        boolean y;
        Object Z;
        boolean w;
        Object Z2;
        if (aVar != null) {
            y = l0b.y(aVar.getId());
            if (y) {
                gk6.f(this, "The 'id' field can not be null or empty", null, 2, null);
                return false;
            } else if (aVar.getModulus() == null) {
                gk6.f(this, "The 'modulus' field can not be null", null, 2, null);
                return false;
            } else if (aVar.getModulus().getLower() != null && aVar.getModulus().getUpper() != null && aVar.getModulus().getLower().intValue() >= 0 && aVar.getModulus().getUpper().intValue() <= 100 && aVar.getModulus().getLower().intValue() < aVar.getModulus().getUpper().intValue()) {
                if (aVar.getObjects() == null) {
                    gk6.f(this, "The 'objects' field can not be null", null, 2, null);
                    return false;
                } else if (aVar.getObjects().size() == 1) {
                    Z = sc1.Z(aVar.getObjects());
                    w = l0b.w(((k.a.b) Z).getType(), "inapps", false, 2, null);
                    if (w) {
                        Z2 = sc1.Z(aVar.getObjects());
                        if (vn3.f(((k.a.b) Z2).getKind(), "all", "concrete")) {
                            return true;
                        }
                        gk6.f(this, "The 'kind' field must be all or concrete", null, 2, null);
                        return false;
                    }
                    gk6.f(this, "The 'objects' field type can be inapps", null, 2, null);
                    return false;
                } else {
                    gk6.f(this, "The 'objects' field must be only one", null, 2, null);
                    return false;
                }
            } else {
                gk6.f(this, "The 'lower' and 'upper' field is invalid", null, 2, null);
                return false;
            }
        }
        gk6.f(this, "Variant item can not be null", null, 2, null);
        return false;
    }
}
