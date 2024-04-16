package defpackage;

import kotlin.Metadata;
/* compiled from: LocationPermissionChecker.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lxv5;", "Lwv5;", "Lry7;", "exactLocationPermission", "b", "a", "Lfy7;", "Lfy7;", "permissionChecker", "<init>", "(Lfy7;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xv5  reason: default package */
/* loaded from: classes4.dex */
public final class xv5 implements wv5 {
    private final fy7 a;

    /* compiled from: LocationPermissionChecker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xv5$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ry7.values().length];
            try {
                iArr[ry7.DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ry7.DENIED_FOREVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ry7.GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xv5(fy7 fy7Var) {
        z65.h(fy7Var, "permissionChecker");
        this.a = fy7Var;
    }

    private final ry7 b(ry7 ry7Var) {
        ry7 a2 = this.a.a("android.permission.ACCESS_COARSE_LOCATION");
        if (a.$EnumSwitchMapping$0[a2.ordinal()] == 3) {
            return a2;
        }
        return ry7Var;
    }

    @Override // defpackage.wv5
    public ry7 a() {
        ry7 a2 = this.a.a("android.permission.ACCESS_FINE_LOCATION");
        int i = a.$EnumSwitchMapping$0[a2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return b(a2);
            }
            return a2;
        }
        return b(a2);
    }
}
