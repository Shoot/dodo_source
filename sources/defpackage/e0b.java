package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "marginPrefix", "g", "newIndent", e.a, "f", DateTokenConverter.CONVERTER_KEY, "", c.a, "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: e0b  reason: default package */
/* loaded from: classes3.dex */
public class e0b extends d0b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e0b$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function1<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            z65.h(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e0b$b */
    /* loaded from: classes3.dex */
    public static final class b extends ej5 implements Function1<String, String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String str) {
            z65.h(str, "line");
            return this.a + str;
        }
    }

    private static final Function1<String, String> b(String str) {
        if (str.length() == 0) {
            return a.a;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!nw0.c(str.charAt(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    public static final String d(String str, String str2) {
        int i;
        String invoke;
        z65.h(str, "<this>");
        z65.h(str2, "newIndent");
        List<String> h0 = m0b.h0(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : h0) {
            if (!c0b.y((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ic1.w(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str3)));
        }
        Integer num = (Integer) ic1.n0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * h0.size());
        Function1<String, String> b2 = b(str2);
        int n = ic1.n(h0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : h0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ic1.v();
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == n) && c0b.y(str4)) {
                str4 = null;
            } else {
                String T0 = c0b.T0(str4, i);
                if (T0 != null && (invoke = b2.invoke(T0)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) ic1.g0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        z65.g(sb, "toString(...)");
        return sb;
    }

    public static final String e(String str, String str2, String str3) {
        int i;
        String invoke;
        z65.h(str, "<this>");
        z65.h(str2, "newIndent");
        z65.h(str3, "marginPrefix");
        if (!c0b.y(str3)) {
            List<String> h0 = m0b.h0(str);
            int length = str.length() + (str2.length() * h0.size());
            Function1<String, String> b2 = b(str2);
            int n = ic1.n(h0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : h0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ic1.v();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i2 == 0 || i2 == n) && c0b.y(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            if (!nw0.c(str4.charAt(i4))) {
                                i = i4;
                                break;
                            }
                            i4++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (c0b.I(str4, str3, i, false, 4, null)) {
                            z65.f(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            z65.g(str5, "substring(...)");
                        }
                    }
                    if (str5 != null && (invoke = b2.invoke(str5)) != null) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) ic1.g0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            z65.g(sb, "toString(...)");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static String f(String str) {
        z65.h(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        z65.h(str, "<this>");
        z65.h(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return g(str, str2);
    }
}
