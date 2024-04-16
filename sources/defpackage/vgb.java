package defpackage;

import java.io.IOException;
import java.util.TimeZone;
/* compiled from: TimeZoneSerializer.java */
/* renamed from: vgb  reason: default package */
/* loaded from: classes2.dex */
public class vgb extends bxa<TimeZone> {
    public vgb() {
        super(TimeZone.class);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: G */
    public void f(TimeZone timeZone, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.q1(timeZone.getID());
    }

    @Override // defpackage.bxa, defpackage.gc5
    /* renamed from: H */
    public void i(TimeZone timeZone, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.f(timeZone, TimeZone.class, nc5.VALUE_STRING));
        f(timeZone, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }
}
