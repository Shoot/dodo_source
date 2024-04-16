package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: StringUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0004"}, d2 = {"", "", "b", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: yza  reason: default package */
/* loaded from: classes2.dex */
public final class yza {

    /* compiled from: StringUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yza$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            CharSequence R0;
            z65.h(str, "it");
            R0 = m0b.R0(str);
            return R0.toString();
        }
    }

    /* compiled from: StringUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yza$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<String, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            z65.h(str, "it");
            return Boolean.valueOf(str.length() > 0);
        }
    }

    public static final String a(String str) {
        String F;
        z65.h(str, "<this>");
        F = l0b.F(str, " ", " ", false, 4, null);
        return F;
    }

    public static final List<String> b(String str) {
        CharSequence R0;
        Sequence B0;
        Sequence q;
        Sequence j;
        List<String> s;
        z65.h(str, "<this>");
        R0 = m0b.R0(str);
        B0 = m0b.B0(R0.toString(), new char[]{CoreConstants.COMMA_CHAR}, false, 0, 6, null);
        q = dca.q(B0, a.a);
        j = dca.j(q, b.a);
        s = dca.s(j);
        return s;
    }
}
