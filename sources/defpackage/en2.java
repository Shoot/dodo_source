package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DateTimeSerializerBase.java */
/* renamed from: en2  reason: default package */
/* loaded from: classes2.dex */
public abstract class en2<T> extends bxa<T> implements bv1 {
    protected final Boolean c;
    protected final DateFormat d;
    protected final AtomicReference<DateFormat> e;

    /* JADX INFO: Access modifiers changed from: protected */
    public en2(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        AtomicReference<DateFormat> atomicReference;
        this.c = bool;
        this.d = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference<>();
        }
        this.e = atomicReference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean G(bda bdaVar) {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.d == null) {
            if (bdaVar != null) {
                return bdaVar.M0(qca.WRITE_DATES_AS_TIMESTAMPS);
            }
            throw new IllegalArgumentException("Null SerializerProvider passed for " + c().getName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(Date date, ua5 ua5Var, bda bdaVar) throws IOException {
        if (this.d == null) {
            bdaVar.E(date, ua5Var);
            return;
        }
        DateFormat andSet = this.e.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this.d.clone();
        }
        ua5Var.q1(andSet.format(date));
        ho1.a(this.e, null, andSet);
    }

    public abstract en2<T> K(Boolean bool, DateFormat dateFormat);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        boolean z;
        SimpleDateFormat simpleDateFormat;
        Locale x0;
        TimeZone z0;
        ta5.d s = s(bdaVar, ia0Var, c());
        if (s == null) {
            return this;
        }
        ta5.c j = s.j();
        if (j.a()) {
            return K(Boolean.TRUE, null);
        }
        if (s.n()) {
            if (s.m()) {
                x0 = s.f();
            } else {
                x0 = bdaVar.x0();
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(s.i(), x0);
            if (s.q()) {
                z0 = s.k();
            } else {
                z0 = bdaVar.z0();
            }
            simpleDateFormat2.setTimeZone(z0);
            return K(Boolean.FALSE, simpleDateFormat2);
        }
        boolean m = s.m();
        boolean q = s.q();
        if (j == ta5.c.STRING) {
            z = true;
        } else {
            z = false;
        }
        if (!m && !q && !z) {
            return this;
        }
        DateFormat m2 = bdaVar.f().m();
        if (m2 instanceof vwa) {
            vwa vwaVar = (vwa) m2;
            if (s.m()) {
                vwaVar = vwaVar.K(s.f());
            }
            if (s.q()) {
                vwaVar = vwaVar.L(s.k());
            }
            return K(Boolean.FALSE, vwaVar);
        }
        if (!(m2 instanceof SimpleDateFormat)) {
            bdaVar.l(c(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", m2.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) m2;
        if (m) {
            simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), s.f());
        } else {
            simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
        }
        TimeZone k = s.k();
        if (k != null && !k.equals(simpleDateFormat.getTimeZone())) {
            simpleDateFormat.setTimeZone(k);
        }
        return K(Boolean.FALSE, simpleDateFormat);
    }

    @Override // defpackage.gc5
    public boolean d(bda bdaVar, T t) {
        return false;
    }
}
