package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
/* compiled from: CalendarSerializer.java */
@o85
/* renamed from: bm0  reason: default package */
/* loaded from: classes2.dex */
public class bm0 extends en2<Calendar> {
    public static final bm0 f = new bm0();

    public bm0() {
        this(null, null);
    }

    protected long L(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: M */
    public void f(Calendar calendar, ua5 ua5Var, bda bdaVar) throws IOException {
        if (G(bdaVar)) {
            ua5Var.p0(L(calendar));
        } else {
            H(calendar.getTime(), ua5Var, bdaVar);
        }
    }

    @Override // defpackage.en2
    /* renamed from: N */
    public bm0 K(Boolean bool, DateFormat dateFormat) {
        return new bm0(bool, dateFormat);
    }

    public bm0(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
