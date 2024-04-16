package defpackage;

import java.lang.reflect.Type;
/* compiled from: TypeResolutionContext.java */
/* renamed from: znb  reason: default package */
/* loaded from: classes2.dex */
public interface znb {

    /* compiled from: TypeResolutionContext.java */
    /* renamed from: znb$a */
    /* loaded from: classes2.dex */
    public static class a implements znb {
        private final rnb a;
        private final qnb b;

        public a(rnb rnbVar, qnb qnbVar) {
            this.a = rnbVar;
            this.b = qnbVar;
        }

        @Override // defpackage.znb
        public y85 a(Type type) {
            return this.a.W(type, this.b);
        }
    }

    y85 a(Type type);
}
