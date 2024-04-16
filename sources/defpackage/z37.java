package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import defpackage.ua5;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: NumberSerializer.java */
@o85
/* renamed from: z37  reason: default package */
/* loaded from: classes2.dex */
public class z37 extends bxa<Number> implements bv1 {
    public static final z37 d = new z37(Number.class);
    protected final boolean c;

    /* compiled from: NumberSerializer.java */
    /* renamed from: z37$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ta5.c.values().length];
            a = iArr;
            try {
                iArr[ta5.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NumberSerializer.java */
    /* renamed from: z37$b */
    /* loaded from: classes2.dex */
    public static final class b extends vhb {
        static final b c = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // defpackage.vhb
        public String G(Object obj) {
            throw new IllegalStateException();
        }

        protected boolean H(ua5 ua5Var, BigDecimal bigDecimal) throws IOException {
            int scale = bigDecimal.scale();
            if (scale >= -9999 && scale <= 9999) {
                return true;
            }
            return false;
        }

        @Override // defpackage.vhb, defpackage.gc5
        public boolean d(bda bdaVar, Object obj) {
            return false;
        }

        @Override // defpackage.vhb, defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            String obj2;
            if (ua5Var.q(ua5.b.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!H(ua5Var, bigDecimal)) {
                    bdaVar.R0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            ua5Var.q1(obj2);
        }
    }

    public z37(Class<? extends Number> cls) {
        super(cls, false);
        this.c = cls == BigInteger.class;
    }

    public static gc5<?> G() {
        return b.c;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: H */
    public void f(Number number, ua5 ua5Var, bda bdaVar) throws IOException {
        if (number instanceof BigDecimal) {
            ua5Var.r0((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            ua5Var.x0((BigInteger) number);
        } else if (number instanceof Long) {
            ua5Var.p0(number.longValue());
        } else if (number instanceof Double) {
            ua5Var.m0(number.doubleValue());
        } else if (number instanceof Float) {
            ua5Var.n0(number.floatValue());
        } else if (!(number instanceof Integer) && !(number instanceof Byte) && !(number instanceof Short)) {
            ua5Var.q0(number.toString());
        } else {
            ua5Var.o0(number.intValue());
        }
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        ta5.d s = s(bdaVar, ia0Var, c());
        if (s != null && a.a[s.j().ordinal()] == 1) {
            if (c() == BigDecimal.class) {
                return G();
            }
            return uhb.c;
        }
        return this;
    }
}
