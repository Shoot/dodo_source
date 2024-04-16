package defpackage;

import androidx.annotation.NonNull;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebasePerfTraceValidator.java */
/* renamed from: uw3  reason: default package */
/* loaded from: classes2.dex */
public final class uw3 extends yx7 {
    private static final sh b = sh.e();
    private final wjb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uw3(@NonNull wjb wjbVar) {
        this.a = wjbVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                yx7.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                b.j(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(@NonNull wjb wjbVar) {
        return i(wjbVar, 0);
    }

    private boolean i(wjb wjbVar, int i) {
        if (wjbVar == null) {
            return false;
        }
        if (i > 1) {
            b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : wjbVar.t0().entrySet()) {
            if (!l(entry.getKey())) {
                sh shVar = b;
                shVar.j("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m(entry.getValue())) {
                sh shVar2 = b;
                shVar2.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (wjb wjbVar2 : wjbVar.B0()) {
            if (!i(wjbVar2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(@NonNull wjb wjbVar) {
        if (wjbVar.s0() > 0) {
            return true;
        }
        for (wjb wjbVar2 : wjbVar.B0()) {
            if (wjbVar2.s0() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(@NonNull wjb wjbVar) {
        return wjbVar.z0().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            b.j("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            b.j("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    private boolean m(Long l) {
        if (l != null) {
            return true;
        }
        return false;
    }

    private boolean n(@NonNull wjb wjbVar) {
        Long l = wjbVar.t0().get(dr1.FRAMES_TOTAL.toString());
        if (l != null && l.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    private boolean o(wjb wjbVar, int i) {
        if (wjbVar == null) {
            b.j("TraceMetric is null");
            return false;
        } else if (i > 1) {
            b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(wjbVar.z0())) {
            sh shVar = b;
            shVar.j("invalid TraceId:" + wjbVar.z0());
            return false;
        } else if (!p(wjbVar)) {
            sh shVar2 = b;
            shVar2.j("invalid TraceDuration:" + wjbVar.w0());
            return false;
        } else if (!wjbVar.C0()) {
            b.j("clientStartTimeUs is null.");
            return false;
        } else if (k(wjbVar) && !n(wjbVar)) {
            sh shVar3 = b;
            shVar3.j("non-positive totalFrames in screen trace " + wjbVar.z0());
            return false;
        } else {
            for (wjb wjbVar2 : wjbVar.B0()) {
                if (!o(wjbVar2, i + 1)) {
                    return false;
                }
            }
            if (!g(wjbVar.u0())) {
                return false;
            }
            return true;
        }
    }

    private boolean p(wjb wjbVar) {
        if (wjbVar != null && wjbVar.w0() > 0) {
            return true;
        }
        return false;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yx7
    public boolean c() {
        if (!o(this.a, 0)) {
            sh shVar = b;
            shVar.j("Invalid Trace:" + this.a.z0());
            return false;
        } else if (j(this.a) && !h(this.a)) {
            sh shVar2 = b;
            shVar2.j("Invalid Counters for Trace:" + this.a.z0());
            return false;
        } else {
            return true;
        }
    }
}
