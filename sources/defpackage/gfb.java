package defpackage;

import defpackage.efb;
/* compiled from: ThreadsLibNotification_Factory_Impl.java */
/* renamed from: gfb  reason: default package */
/* loaded from: classes3.dex */
public final class gfb implements efb.b {
    private final ffb a;

    gfb(ffb ffbVar) {
        this.a = ffbVar;
    }

    public static as8<efb.b> b(ffb ffbVar) {
        return z45.a(new gfb(ffbVar));
    }

    @Override // defpackage.efb.b
    public efb a(u27 u27Var) {
        return this.a.b(u27Var);
    }
}
