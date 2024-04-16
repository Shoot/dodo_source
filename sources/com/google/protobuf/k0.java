package com.google.protobuf;

import java.io.IOException;
/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface k0 extends bi6 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes.dex */
    public interface a extends bi6, Cloneable {
        k0 a();

        k0 k();

        a n0(k0 k0Var);

        a q0(g gVar, m mVar) throws IOException;
    }

    a b();

    f c();

    int d();

    a e();

    er7<? extends k0> g();

    void l(CodedOutputStream codedOutputStream) throws IOException;
}
