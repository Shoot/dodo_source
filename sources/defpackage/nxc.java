package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: nxc  reason: default package */
/* loaded from: classes2.dex */
public enum nxc implements l2d {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    
    private static final k2d<nxc> h = new k2d<nxc>() { // from class: mxc
    };
    private final int a;

    nxc(int i2) {
        this.a = i2;
    }

    public static nxc a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
                        }
                        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
                    }
                    return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
                }
                return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
            }
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
    }

    public static n2d i() {
        return oxc.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + nxc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    @Override // defpackage.l2d
    public final int zza() {
        return this.a;
    }
}
