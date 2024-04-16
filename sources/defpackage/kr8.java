package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
import defpackage.we5;
import java.security.GeneralSecurityException;
/* compiled from: ProtoKeySerialization.java */
/* renamed from: kr8  reason: default package */
/* loaded from: classes2.dex */
public final class kr8 implements oca {
    private final String a;
    private final mk0 b;
    private final h c;
    private final we5.c d;
    private final mm7 e;
    private final Integer f;

    private kr8(String str, h hVar, we5.c cVar, mm7 mm7Var, Integer num) {
        this.a = str;
        this.b = xub.d(str);
        this.c = hVar;
        this.d = cVar;
        this.e = mm7Var;
        this.f = num;
    }

    public static kr8 b(String str, h hVar, we5.c cVar, mm7 mm7Var, Integer num) throws GeneralSecurityException {
        if (mm7Var == mm7.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new kr8(str, hVar, cVar, mm7Var, num);
    }

    @Override // defpackage.oca
    public mk0 a() {
        return this.b;
    }

    public Integer c() {
        return this.f;
    }

    public we5.c d() {
        return this.d;
    }

    public mm7 e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public h g() {
        return this.c;
    }
}
