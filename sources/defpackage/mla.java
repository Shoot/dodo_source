package defpackage;

import defpackage.j81;
import java.io.Serializable;
import java.util.Map;
/* compiled from: SimpleMixInResolver.java */
/* renamed from: mla  reason: default package */
/* loaded from: classes2.dex */
public class mla implements j81.a, Serializable {
    protected final j81.a a;
    protected Map<k81, Class<?>> b;

    public mla(j81.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.j81.a
    public Class<?> a(Class<?> cls) {
        Class<?> a;
        Map<k81, Class<?>> map;
        j81.a aVar = this.a;
        if (aVar == null) {
            a = null;
        } else {
            a = aVar.a(cls);
        }
        if (a == null && (map = this.b) != null) {
            return map.get(new k81(cls));
        }
        return a;
    }

    public boolean b() {
        if (this.b == null) {
            j81.a aVar = this.a;
            if (aVar == null) {
                return false;
            }
            if (aVar instanceof mla) {
                return ((mla) aVar).b();
            }
            return true;
        }
        return true;
    }
}
