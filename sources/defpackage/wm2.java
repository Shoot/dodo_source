package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
/* compiled from: DateSerializer.java */
@o85
/* renamed from: wm2  reason: default package */
/* loaded from: classes2.dex */
public class wm2 extends en2<Date> {
    public static final wm2 f = new wm2();

    public wm2() {
        this(null, null);
    }

    protected long L(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: M */
    public void f(Date date, ua5 ua5Var, bda bdaVar) throws IOException {
        if (G(bdaVar)) {
            ua5Var.p0(L(date));
        } else {
            H(date, ua5Var, bdaVar);
        }
    }

    @Override // defpackage.en2
    /* renamed from: N */
    public wm2 K(Boolean bool, DateFormat dateFormat) {
        return new wm2(bool, dateFormat);
    }

    public wm2(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
