package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.fw6;
import java.net.URI;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebasePerfNetworkValidator.java */
/* renamed from: rw3  reason: default package */
/* loaded from: classes2.dex */
public final class rw3 extends yx7 {
    private static final sh c = sh.e();
    private final fw6 a;
    private final Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rw3(fw6 fw6Var, Context context) {
        this.b = context;
        this.a = fw6Var;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            c.k("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, @NonNull Context context) {
        if (uri == null) {
            return false;
        }
        return rpb.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        if (str != null && !i(str) && str.length() <= 255) {
            return true;
        }
        return false;
    }

    private boolean m(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    private boolean n(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    private boolean o(int i) {
        if (i != -1 && i <= 0) {
            return false;
        }
        return true;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        if (!"http".equalsIgnoreCase(str) && !"https".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    private boolean q(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    private boolean r(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yx7
    public boolean c() {
        fw6.d dVar;
        if (j(this.a.D0())) {
            sh shVar = c;
            shVar.j("URL is missing:" + this.a.D0());
            return false;
        }
        URI g = g(this.a.D0());
        if (g == null) {
            c.j("URL cannot be parsed");
            return false;
        } else if (!h(g, this.b)) {
            sh shVar2 = c;
            shVar2.j("URL fails allowlist rule: " + g);
            return false;
        } else if (!k(g.getHost())) {
            c.j("URL host is null or invalid");
            return false;
        } else if (!p(g.getScheme())) {
            c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g.getUserInfo())) {
            c.j("URL user info is null");
            return false;
        } else if (!o(g.getPort())) {
            c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.a.F0()) {
                dVar = this.a.u0();
            } else {
                dVar = null;
            }
            if (!l(dVar)) {
                sh shVar3 = c;
                shVar3.j("HTTP Method is null or invalid: " + this.a.u0());
                return false;
            } else if (this.a.G0() && !m(this.a.v0())) {
                sh shVar4 = c;
                shVar4.j("HTTP ResponseCode is a negative value:" + this.a.v0());
                return false;
            } else if (this.a.H0() && !n(this.a.x0())) {
                sh shVar5 = c;
                shVar5.j("Request Payload is a negative value:" + this.a.x0());
                return false;
            } else if (this.a.I0() && !n(this.a.z0())) {
                sh shVar6 = c;
                shVar6.j("Response Payload is a negative value:" + this.a.z0());
                return false;
            } else if (this.a.E0() && this.a.s0() > 0) {
                if (this.a.J0() && !q(this.a.A0())) {
                    sh shVar7 = c;
                    shVar7.j("Time to complete the request is a negative value:" + this.a.A0());
                    return false;
                } else if (this.a.L0() && !q(this.a.C0())) {
                    sh shVar8 = c;
                    shVar8.j("Time from the start of the request to the start of the response is null or a negative value:" + this.a.C0());
                    return false;
                } else if (this.a.K0() && this.a.B0() > 0) {
                    if (!this.a.G0()) {
                        c.j("Did not receive a HTTP Response Code");
                        return false;
                    }
                    return true;
                } else {
                    sh shVar9 = c;
                    shVar9.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.a.B0());
                    return false;
                }
            } else {
                sh shVar10 = c;
                shVar10.j("Start time of the request is null, or zero, or a negative value:" + this.a.s0());
                return false;
            }
        }
    }

    boolean l(fw6.d dVar) {
        if (dVar != null && dVar != fw6.d.HTTP_METHOD_UNKNOWN) {
            return true;
        }
        return false;
    }
}
