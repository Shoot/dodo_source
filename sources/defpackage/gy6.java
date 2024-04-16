package defpackage;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
/* compiled from: NioPathSerializer.java */
/* renamed from: gy6  reason: default package */
/* loaded from: classes2.dex */
public class gy6 extends bxa<Path> {
    public gy6() {
        super(t85.a());
    }

    public void G(Path path, ua5 ua5Var, bda bdaVar) throws IOException {
        URI uri;
        uri = path.toUri();
        ua5Var.q1(uri.toString());
    }

    public void H(Path path, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.f(path, t85.a(), nc5.VALUE_STRING));
        G(path, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    @Override // defpackage.cxa, defpackage.gc5
    public /* bridge */ /* synthetic */ void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        G(ey6.a(obj), ua5Var, bdaVar);
    }

    @Override // defpackage.bxa, defpackage.gc5
    public /* bridge */ /* synthetic */ void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        H(ey6.a(obj), ua5Var, bdaVar, bobVar);
    }
}
