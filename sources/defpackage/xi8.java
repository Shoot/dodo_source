package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PresentationLevelPhoneFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lxi8;", "", "Lg48;", "b", "", "", "whiteList", "Lkotlin/Function1;", c.a, "([Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "auth_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xi8  reason: default package */
/* loaded from: classes.dex */
public final class xi8 {
    public static final xi8 a = new xi8();

    /* compiled from: PresentationLevelPhoneFilter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg48;", "phoneOutput", "a", "(Lg48;)Lg48;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xi8$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<g48, g48> {
        final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr) {
            super(1);
            this.a = strArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r0 != false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.g48 invoke(defpackage.g48 r4) {
            /*
                r3 = this;
                java.lang.String r0 = "phoneOutput"
                defpackage.z65.h(r4, r0)
                java.lang.String[] r0 = r3.a
                f28 r1 = r4.f()
                java.lang.String r1 = r1.a()
                java.util.Set r1 = defpackage.c0b.b1(r1)
                int r1 = r1.size()
                r2 = 1
                if (r1 == r2) goto L28
                f28 r1 = r4.f()
                java.lang.String r1 = r1.toString()
                boolean r0 = defpackage.ur.A(r0, r1)
                if (r0 == 0) goto L39
            L28:
                f28 r0 = r4.f()
                java.lang.String r0 = r0.a()
                int r0 = r0.length()
                r1 = 7
                if (r0 < r1) goto L39
                r0 = 0
                goto L3a
            L39:
                r0 = r4
            L3a:
                if (r0 != 0) goto L42
                xi8 r0 = defpackage.xi8.a
                g48 r0 = defpackage.xi8.a(r0, r4)
            L42:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xi8.a.invoke(g48):g48");
        }
    }

    /* compiled from: PresentationLevelPhoneFilter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg48;", "phoneOutput", "a", "(Lg48;)Lg48;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xi8$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<g48, g48> {
        final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String[] strArr) {
            super(1);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final g48 invoke(g48 g48Var) {
            boolean A;
            z65.h(g48Var, "phoneOutput");
            A = yr.A(this.a, g48Var.f().toString());
            if (A) {
                return xi8.a.b(g48Var);
            }
            return g48Var;
        }
    }

    private xi8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g48 b(g48 g48Var) {
        return g48.b(g48Var, null, null, null, new c58(true, true), 7, null);
    }

    public final Function1<g48, g48> c(String... strArr) {
        z65.h(strArr, "whiteList");
        return new a(strArr);
    }

    public final Function1<g48, g48> d(String... strArr) {
        z65.h(strArr, "whiteList");
        return new b(strArr);
    }
}
