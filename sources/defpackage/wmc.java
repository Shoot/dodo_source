package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: wmc  reason: default package */
/* loaded from: classes2.dex */
public final class wmc {
    private dnc a;
    private dnc b;
    private List<dnc> c;

    public wmc() {
        this.a = new dnc("", 0L, null);
        this.b = new dnc("", 0L, null);
        this.c = new ArrayList();
    }

    public final dnc a() {
        return this.a;
    }

    public final void b(String str, long j, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, dnc.c(str2, this.a.b(str2), map.get(str2)));
        }
        this.c.add(new dnc(str, j, hashMap));
    }

    public final void c(dnc dncVar) {
        this.a = dncVar;
        this.b = (dnc) dncVar.clone();
        this.c.clear();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        wmc wmcVar = new wmc((dnc) this.a.clone());
        for (dnc dncVar : this.c) {
            wmcVar.c.add((dnc) dncVar.clone());
        }
        return wmcVar;
    }

    public final dnc d() {
        return this.b;
    }

    public final void e(dnc dncVar) {
        this.b = dncVar;
    }

    public final List<dnc> f() {
        return this.c;
    }

    private wmc(dnc dncVar) {
        this.a = dncVar;
        this.b = (dnc) dncVar.clone();
        this.c = new ArrayList();
    }
}
