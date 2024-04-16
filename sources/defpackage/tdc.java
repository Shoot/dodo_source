package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
/* compiled from: -MediaTypeCommon.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u0001\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0011"}, d2 = {"Lqc6;", "", Action.NAME_ATTRIBUTE, c.a, "", "other", "", "a", "f", "", "b", DateTokenConverter.CONVERTER_KEY, e.a, "Lec9;", "Lec9;", "TYPE_SUBTYPE", "PARAMETER", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: tdc  reason: default package */
/* loaded from: classes3.dex */
public final class tdc {
    private static final ec9 a = new ec9("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final ec9 b = new ec9(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final boolean a(qc6 qc6Var, Object obj) {
        z65.h(qc6Var, "<this>");
        if ((obj instanceof qc6) && z65.c(((qc6) obj).d(), qc6Var.d())) {
            return true;
        }
        return false;
    }

    public static final int b(qc6 qc6Var) {
        z65.h(qc6Var, "<this>");
        return qc6Var.d().hashCode();
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(defpackage.qc6 r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "name"
            defpackage.z65.h(r5, r0)
            java.lang.String[] r0 = r4.e()
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.fp8.c(r2, r0, r1)
            if (r0 < 0) goto L33
        L19:
            java.lang.String[] r1 = r4.e()
            r1 = r1[r2]
            r3 = 1
            boolean r1 = defpackage.c0b.v(r1, r5, r3)
            if (r1 == 0) goto L2e
            java.lang.String[] r4 = r4.e()
            int r2 = r2 + r3
            r4 = r4[r2]
            return r4
        L2e:
            if (r2 == r0) goto L33
            int r2 = r2 + 2
            goto L19
        L33:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdc.c(qc6, java.lang.String):java.lang.String");
    }

    public static final qc6 d(String str) {
        String str2;
        String str3;
        boolean J;
        boolean u;
        z65.h(str, "<this>");
        MatchResult C = zdc.C(a, str, 0);
        if (C != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = C.a().get(1).toLowerCase(locale);
            z65.g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = C.a().get(2).toLowerCase(locale);
            z65.g(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int k = C.b().k();
            while (true) {
                int i = k + 1;
                if (i < str.length()) {
                    MatchResult C2 = zdc.C(b, str, i);
                    if (C2 != null) {
                        MatchGroup matchGroup = C2.c().get(1);
                        if (matchGroup != null) {
                            str2 = matchGroup.a();
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            k = C2.b().k();
                        } else {
                            MatchGroup matchGroup2 = C2.c().get(2);
                            if (matchGroup2 != null) {
                                str3 = matchGroup2.a();
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                J = l0b.J(str3, "'", false, 2, null);
                                if (J) {
                                    u = l0b.u(str3, "'", false, 2, null);
                                    if (u && str3.length() > 2) {
                                        str3 = str3.substring(1, str3.length() - 1);
                                        z65.g(str3, "substring(...)");
                                    }
                                }
                            } else {
                                MatchGroup matchGroup3 = C2.c().get(3);
                                z65.e(matchGroup3);
                                str3 = matchGroup3.a();
                            }
                            arrayList.add(str2);
                            arrayList.add(str3);
                            k = C2.b().k();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(i);
                        z65.g(substring, "substring(...)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                } else {
                    return new qc6(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
            }
        } else {
            throw new IllegalArgumentException("No subtype found for: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    public static final qc6 e(String str) {
        z65.h(str, "<this>");
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final String f(qc6 qc6Var) {
        z65.h(qc6Var, "<this>");
        return qc6Var.d();
    }
}
