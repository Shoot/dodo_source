package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.measurement.internal.w6;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class db extends ua {
    /* JADX INFO: Access modifiers changed from: package-private */
    public db(va vaVar) {
        super(vaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle A(List<com.google.android.gms.internal.measurement.f0> list) {
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.f0 f0Var : list) {
            String e0 = f0Var.e0();
            if (f0Var.h0()) {
                bundle.putDouble(e0, f0Var.H());
            } else if (f0Var.i0()) {
                bundle.putFloat(e0, f0Var.S());
            } else if (f0Var.l0()) {
                bundle.putString(e0, f0Var.f0());
            } else if (f0Var.j0()) {
                bundle.putLong(e0, f0Var.Z());
            }
        }
        return bundle;
    }

    private final Bundle B(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList2.add(B((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.f0 E(com.google.android.gms.internal.measurement.d0 d0Var, String str) {
        for (com.google.android.gms.internal.measurement.f0 f0Var : d0Var.e0()) {
            if (f0Var.e0().equals(str)) {
                return f0Var;
            }
        }
        return null;
    }

    private static String L(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <BuilderT extends j3d> BuilderT P(BuilderT buildert, byte[] bArr) throws zzjq {
        com.google.android.gms.internal.measurement.s1 a = com.google.android.gms.internal.measurement.s1.a();
        if (a != null) {
            return (BuilderT) buildert.o1(bArr, a);
        }
        return (BuilderT) buildert.W(bArr);
    }

    private static void Q(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void R(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                Q(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void S(d0.a aVar, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.f0> K = aVar.K();
        int i = 0;
        while (true) {
            if (i < K.size()) {
                if (str.equals(K.get(i).e0())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        f0.a z = com.google.android.gms.internal.measurement.f0.b0().z(str);
        if (obj instanceof Long) {
            z.v(((Long) obj).longValue());
        } else if (obj instanceof String) {
            z.B((String) obj);
        } else if (obj instanceof Double) {
            z.t(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.v(i, z);
        } else {
            aVar.z(z);
        }
    }

    private static void W(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void X(StringBuilder sb, int i, com.google.android.gms.internal.measurement.d dVar) {
        if (dVar == null) {
            return;
        }
        W(sb, i);
        sb.append("filter {\n");
        if (dVar.P()) {
            a0(sb, i, "complement", Boolean.valueOf(dVar.O()));
        }
        if (dVar.R()) {
            a0(sb, i, "param_name", f().f(dVar.N()));
        }
        if (dVar.S()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.g M = dVar.M();
            if (M != null) {
                W(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (M.P()) {
                    a0(sb, i2, "match_type", M.H().name());
                }
                if (M.O()) {
                    a0(sb, i2, "expression", M.K());
                }
                if (M.N()) {
                    a0(sb, i2, "case_sensitive", Boolean.valueOf(M.M()));
                }
                if (M.m() > 0) {
                    W(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : M.L()) {
                        W(sb, i + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                W(sb, i2);
                sb.append("}\n");
            }
        }
        if (dVar.Q()) {
            Y(sb, i + 1, "number_filter", dVar.L());
        }
        W(sb, i);
        sb.append("}\n");
    }

    private static void Y(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.e eVar) {
        if (eVar == null) {
            return;
        }
        W(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (eVar.O()) {
            a0(sb, i, "comparison_type", eVar.H().name());
        }
        if (eVar.Q()) {
            a0(sb, i, "match_as_float", Boolean.valueOf(eVar.N()));
        }
        if (eVar.P()) {
            a0(sb, i, "comparison_value", eVar.K());
        }
        if (eVar.S()) {
            a0(sb, i, "min_comparison_value", eVar.M());
        }
        if (eVar.R()) {
            a0(sb, i, "max_comparison_value", eVar.L());
        }
        W(sb, i);
        sb.append("}\n");
    }

    private static void Z(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.k0 k0Var) {
        Integer num;
        Integer num2;
        Long l;
        if (k0Var == null) {
            return;
        }
        W(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (k0Var.K() != 0) {
            W(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : k0Var.b0()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (k0Var.S() != 0) {
            W(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : k0Var.d0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (k0Var.m() != 0) {
            W(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.c0 c0Var : k0Var.a0()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                if (c0Var.P()) {
                    num2 = Integer.valueOf(c0Var.m());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c0Var.O()) {
                    l = Long.valueOf(c0Var.L());
                } else {
                    l = null;
                }
                sb.append(l);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (k0Var.O() != 0) {
            W(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.l0 l0Var : k0Var.c0()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                if (l0Var.Q()) {
                    num = Integer.valueOf(l0Var.L());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i10 = 0;
                for (Long l4 : l0Var.P()) {
                    long longValue = l4.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        W(sb, 3);
        sb.append("}\n");
    }

    private static void a0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        W(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void b0(StringBuilder sb, int i, List<com.google.android.gms.internal.measurement.f0> list) {
        String str;
        String str2;
        Long l;
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (com.google.android.gms.internal.measurement.f0 f0Var : list) {
            if (f0Var != null) {
                W(sb, i2);
                sb.append("param {\n");
                Double d = null;
                if (f0Var.k0()) {
                    str = f().f(f0Var.e0());
                } else {
                    str = null;
                }
                a0(sb, i2, Action.NAME_ATTRIBUTE, str);
                if (f0Var.l0()) {
                    str2 = f0Var.f0();
                } else {
                    str2 = null;
                }
                a0(sb, i2, "string_value", str2);
                if (f0Var.j0()) {
                    l = Long.valueOf(f0Var.Z());
                } else {
                    l = null;
                }
                a0(sb, i2, "int_value", l);
                if (f0Var.h0()) {
                    d = Double.valueOf(f0Var.H());
                }
                a0(sb, i2, "double_value", d);
                if (f0Var.X() > 0) {
                    b0(sb, i2, f0Var.g0());
                }
                W(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d0(zzbe zzbeVar, zzo zzoVar) {
        gh8.j(zzbeVar);
        gh8.j(zzoVar);
        if (TextUtils.isEmpty(zzoVar.b) && TextUtils.isEmpty(zzoVar.q)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e0(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & list.get(i / 64).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static Bundle f0(List<com.google.android.gms.internal.measurement.f0> list) {
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.f0 f0Var : list) {
            String e0 = f0Var.e0();
            if (f0Var.h0()) {
                bundle.putString(e0, String.valueOf(f0Var.H()));
            } else if (f0Var.i0()) {
                bundle.putString(e0, String.valueOf(f0Var.S()));
            } else if (f0Var.l0()) {
                bundle.putString(e0, f0Var.f0());
            } else if (f0Var.j0()) {
                bundle.putString(e0, String.valueOf(f0Var.Z()));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g0(com.google.android.gms.internal.measurement.d0 d0Var, String str) {
        com.google.android.gms.internal.measurement.f0 E = E(d0Var, str);
        if (E != null) {
            if (E.l0()) {
                return E.f0();
            }
            if (E.j0()) {
                return Long.valueOf(E.Z());
            }
            if (E.h0()) {
                return Double.valueOf(E.H());
            }
            if (E.X() > 0) {
                List<com.google.android.gms.internal.measurement.f0> g0 = E.g0();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.f0 f0Var : g0) {
                    if (f0Var != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.f0 f0Var2 : f0Var.g0()) {
                            if (f0Var2.l0()) {
                                bundle.putString(f0Var2.e0(), f0Var2.f0());
                            } else if (f0Var2.j0()) {
                                bundle.putLong(f0Var2.e0(), f0Var2.Z());
                            } else if (f0Var2.h0()) {
                                bundle.putDouble(f0Var2.e0(), f0Var2.H());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    private static Bundle j0(List<com.google.android.gms.internal.measurement.m0> list) {
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.m0 m0Var : list) {
            String b0 = m0Var.b0();
            if (m0Var.d0()) {
                bundle.putString(b0, String.valueOf(m0Var.H()));
            } else if (m0Var.e0()) {
                bundle.putString(b0, String.valueOf(m0Var.P()));
            } else if (m0Var.h0()) {
                bundle.putString(b0, m0Var.c0());
            } else if (m0Var.f0()) {
                bundle.putString(b0, String.valueOf(m0Var.V()));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(i0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.a0(); i++) {
            if (str.equals(aVar.G0(i).b0())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T C(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            n().F().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.d0 D(v vVar) {
        d0.a y = com.google.android.gms.internal.measurement.d0.b0().y(vVar.e);
        Iterator<String> it = vVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            f0.a z = com.google.android.gms.internal.measurement.f0.b0().z(next);
            Object v = vVar.f.v(next);
            gh8.j(v);
            T(z, v);
            y.z(z);
        }
        return (com.google.android.gms.internal.measurement.d0) ((com.google.android.gms.internal.measurement.b2) y.u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbe F(dnc dncVar) {
        String str;
        Object obj;
        Bundle B = B(dncVar.g(), true);
        if (B.containsKey("_o") && (obj = B.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String b = d1d.b(dncVar.e());
        if (b == null) {
            b = dncVar.e();
        }
        return new zzbe(b, new zzaz(B), str2, dncVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    @android.annotation.TargetApi(30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzmh G(java.lang.String r10, com.google.android.gms.internal.measurement.i0.a r11, com.google.android.gms.internal.measurement.d0.a r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.G(java.lang.String, com.google.android.gms.internal.measurement.i0$a, com.google.android.gms.internal.measurement.d0$a, java.lang.String):com.google.android.gms.measurement.internal.zzmh");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    @android.annotation.TargetApi(30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzmh H(java.lang.String r10, com.google.android.gms.internal.measurement.i0 r11, com.google.android.gms.internal.measurement.d0.a r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.H(java.lang.String, com.google.android.gms.internal.measurement.i0, com.google.android.gms.internal.measurement.d0$a, java.lang.String):com.google.android.gms.measurement.internal.zzmh");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String I(com.google.android.gms.internal.measurement.c cVar) {
        if (cVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (cVar.X()) {
            a0(sb, 0, "filter_id", Integer.valueOf(cVar.M()));
        }
        a0(sb, 0, "event_name", f().c(cVar.Q()));
        String L = L(cVar.S(), cVar.T(), cVar.U());
        if (!L.isEmpty()) {
            a0(sb, 0, "filter_type", L);
        }
        if (cVar.V()) {
            Y(sb, 1, "event_count_filter", cVar.P());
        }
        if (cVar.m() > 0) {
            sb.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.d dVar : cVar.R()) {
                X(sb, 2, dVar);
            }
        }
        W(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String J(com.google.android.gms.internal.measurement.f fVar) {
        if (fVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (fVar.Q()) {
            a0(sb, 0, "filter_id", Integer.valueOf(fVar.m()));
        }
        a0(sb, 0, "property_name", f().g(fVar.M()));
        String L = L(fVar.N(), fVar.O(), fVar.P());
        if (!L.isEmpty()) {
            a0(sb, 0, "filter_type", L);
        }
        X(sb, 1, fVar.J());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String K(com.google.android.gms.internal.measurement.h0 h0Var) {
        Long l;
        Long l2;
        com.google.android.gms.internal.measurement.a0 C3;
        if (h0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.i0 i0Var : h0Var.M()) {
            if (i0Var != null) {
                W(sb, 1);
                sb.append("bundle {\n");
                if (i0Var.b1()) {
                    a0(sb, 1, "protocol_version", Integer.valueOf(i0Var.X1()));
                }
                if (s8d.a() && a().C(i0Var.G3(), b0.t0) && i0Var.e1()) {
                    a0(sb, 1, "session_stitching_token", i0Var.r0());
                }
                a0(sb, 1, "platform", i0Var.p0());
                if (i0Var.W0()) {
                    a0(sb, 1, "gmp_version", Long.valueOf(i0Var.g3()));
                }
                if (i0Var.j1()) {
                    a0(sb, 1, "uploading_gmp_version", Long.valueOf(i0Var.z3()));
                }
                if (i0Var.U0()) {
                    a0(sb, 1, "dynamite_version", Long.valueOf(i0Var.T2()));
                }
                if (i0Var.D0()) {
                    a0(sb, 1, "config_version", Long.valueOf(i0Var.F2()));
                }
                a0(sb, 1, "gmp_app_id", i0Var.m0());
                a0(sb, 1, "admob_app_id", i0Var.F3());
                a0(sb, 1, HiAnalyticsConstant.BI_KEY_APP_ID, i0Var.G3());
                a0(sb, 1, "app_version", i0Var.f0());
                if (i0Var.A0()) {
                    a0(sb, 1, "app_version_major", Integer.valueOf(i0Var.F0()));
                }
                a0(sb, 1, "firebase_instance_id", i0Var.l0());
                if (i0Var.T0()) {
                    a0(sb, 1, "dev_cert_hash", Long.valueOf(i0Var.M2()));
                }
                a0(sb, 1, "app_store", i0Var.I3());
                if (i0Var.i1()) {
                    a0(sb, 1, "upload_timestamp_millis", Long.valueOf(i0Var.w3()));
                }
                if (i0Var.f1()) {
                    a0(sb, 1, "start_timestamp_millis", Long.valueOf(i0Var.q3()));
                }
                if (i0Var.V0()) {
                    a0(sb, 1, "end_timestamp_millis", Long.valueOf(i0Var.a3()));
                }
                if (i0Var.a1()) {
                    a0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(i0Var.n3()));
                }
                if (i0Var.Z0()) {
                    a0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(i0Var.k3()));
                }
                a0(sb, 1, "app_instance_id", i0Var.H3());
                a0(sb, 1, "resettable_device_id", i0Var.q0());
                a0(sb, 1, "ds_id", i0Var.k0());
                if (i0Var.Y0()) {
                    a0(sb, 1, "limited_ad_tracking", Boolean.valueOf(i0Var.y0()));
                }
                a0(sb, 1, "os_version", i0Var.o0());
                a0(sb, 1, "device_model", i0Var.j0());
                a0(sb, 1, "user_default_language", i0Var.s0());
                if (i0Var.h1()) {
                    a0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(i0Var.p2()));
                }
                if (i0Var.C0()) {
                    a0(sb, 1, "bundle_sequential_index", Integer.valueOf(i0Var.k1()));
                }
                if (i0Var.d1()) {
                    a0(sb, 1, "service_upload", Boolean.valueOf(i0Var.z0()));
                }
                a0(sb, 1, "health_monitor", i0Var.n0());
                if (i0Var.c1()) {
                    a0(sb, 1, "retry_counter", Integer.valueOf(i0Var.h2()));
                }
                if (i0Var.R0()) {
                    a0(sb, 1, "consent_signals", i0Var.h0());
                }
                if (i0Var.X0()) {
                    a0(sb, 1, "is_dma_region", Boolean.valueOf(i0Var.x0()));
                }
                if (i0Var.S0()) {
                    a0(sb, 1, "core_platform_services", i0Var.i0());
                }
                if (i0Var.E0()) {
                    a0(sb, 1, "consent_diagnostics", i0Var.g0());
                }
                if (i0Var.g1()) {
                    a0(sb, 1, "target_os_version", Long.valueOf(i0Var.t3()));
                }
                if (g8d.a() && a().C(i0Var.G3(), b0.H0)) {
                    a0(sb, 1, "ad_services_version", Integer.valueOf(i0Var.m()));
                    if (i0Var.B0() && (C3 = i0Var.C3()) != null) {
                        W(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        a0(sb, 2, "eligible", Boolean.valueOf(C3.Z()));
                        a0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(C3.d0()));
                        a0(sb, 2, "pre_r", Boolean.valueOf(C3.e0()));
                        a0(sb, 2, "r_extensions_too_old", Boolean.valueOf(C3.f0()));
                        a0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(C3.V()));
                        a0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(C3.S()));
                        a0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(C3.c0()));
                        W(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<com.google.android.gms.internal.measurement.m0> v0 = i0Var.v0();
                if (v0 != null) {
                    for (com.google.android.gms.internal.measurement.m0 m0Var : v0) {
                        if (m0Var != null) {
                            W(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            if (m0Var.g0()) {
                                l = Long.valueOf(m0Var.Y());
                            } else {
                                l = null;
                            }
                            a0(sb, 2, "set_timestamp_millis", l);
                            a0(sb, 2, Action.NAME_ATTRIBUTE, f().g(m0Var.b0()));
                            a0(sb, 2, "string_value", m0Var.c0());
                            if (m0Var.f0()) {
                                l2 = Long.valueOf(m0Var.V());
                            } else {
                                l2 = null;
                            }
                            a0(sb, 2, "int_value", l2);
                            if (m0Var.d0()) {
                                d = Double.valueOf(m0Var.H());
                            }
                            a0(sb, 2, "double_value", d);
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.b0> t0 = i0Var.t0();
                i0Var.G3();
                if (t0 != null) {
                    for (com.google.android.gms.internal.measurement.b0 b0Var : t0) {
                        if (b0Var != null) {
                            W(sb, 2);
                            sb.append("audience_membership {\n");
                            if (b0Var.U()) {
                                a0(sb, 2, "audience_id", Integer.valueOf(b0Var.m()));
                            }
                            if (b0Var.V()) {
                                a0(sb, 2, "new_audience", Boolean.valueOf(b0Var.T()));
                            }
                            Z(sb, 2, "current_data", b0Var.R());
                            if (b0Var.X()) {
                                Z(sb, 2, "previous_data", b0Var.S());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.d0> u0 = i0Var.u0();
                if (u0 != null) {
                    for (com.google.android.gms.internal.measurement.d0 d0Var : u0) {
                        if (d0Var != null) {
                            W(sb, 2);
                            sb.append("event {\n");
                            a0(sb, 2, Action.NAME_ATTRIBUTE, f().c(d0Var.d0()));
                            if (d0Var.h0()) {
                                a0(sb, 2, "timestamp_millis", Long.valueOf(d0Var.a0()));
                            }
                            if (d0Var.g0()) {
                                a0(sb, 2, "previous_timestamp_millis", Long.valueOf(d0Var.Z()));
                            }
                            if (d0Var.f0()) {
                                a0(sb, 2, "count", Integer.valueOf(d0Var.m()));
                            }
                            if (d0Var.U() != 0) {
                                b0(sb, 2, d0Var.e0());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                W(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> N(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                n().K().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    n().K().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r5.add(O((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> O(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.O(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.O(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(f0.a aVar, Object obj) {
        Bundle[] bundleArr;
        gh8.j(obj);
        aVar.F().C().A().D();
        if (obj instanceof String) {
            aVar.B((String) obj);
        } else if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.t(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    f0.a b0 = com.google.android.gms.internal.measurement.f0.b0();
                    for (String str : bundle.keySet()) {
                        f0.a z = com.google.android.gms.internal.measurement.f0.b0().z(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            z.v(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            z.B((String) obj2);
                        } else if (obj2 instanceof Double) {
                            z.t(((Double) obj2).doubleValue());
                        }
                        b0.w(z);
                    }
                    if (b0.s() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.f0) ((com.google.android.gms.internal.measurement.b2) b0.u()));
                    }
                }
            }
            aVar.y(arrayList);
        } else {
            n().F().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(i0.a aVar) {
        n().J().a("Checking account type status for ad personalization signals");
        if (k0(aVar.c1())) {
            n().E().a("Turning off ad personalization due to account type");
            com.google.android.gms.internal.measurement.m0 m0Var = (com.google.android.gms.internal.measurement.m0) ((com.google.android.gms.internal.measurement.b2) com.google.android.gms.internal.measurement.m0.Z().w("_npa").z(e().t()).v(1L).u());
            int i = 0;
            while (true) {
                if (i < aVar.a0()) {
                    if ("_npa".equals(aVar.G0(i).b0())) {
                        aVar.y(i, m0Var);
                        break;
                    }
                    i++;
                } else {
                    aVar.F(m0Var);
                    break;
                }
            }
            if (y5d.a() && a().s(b0.Q0)) {
                h a = h.a(aVar.e1());
                a.d(w6.a.AD_PERSONALIZATION, j.CHILD_ACCOUNT);
                aVar.p0(a.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(m0.a aVar, Object obj) {
        gh8.j(obj);
        aVar.B().y().s();
        if (obj instanceof String) {
            aVar.A((String) obj);
        } else if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.t(((Double) obj).doubleValue());
        } else {
            n().F().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(long j, long j2) {
        if (j != 0 && j2 > 0 && Math.abs(b().currentTimeMillis() - j) <= j2) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] i0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            n().F().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k0(String str) {
        if (x5d.a() && a().s(b0.Z0)) {
            return false;
        }
        gh8.j(str);
        u4 C0 = p().C0(str);
        if (C0 == null || !e().x() || !C0.r() || !q().U(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] l0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            n().F().b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db m() {
        return super.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> m0() {
        Map<String, String> c = b0.c(this.b.zza());
        if (c == null || c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = b0.R.a(null).intValue();
        for (Map.Entry<String, String> entry : c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            n().K().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    n().K().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ob o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ k p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ g5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ w9 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long y(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return z(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long z(byte[] bArr) {
        gh8.j(bArr);
        h().l();
        MessageDigest S0 = jb.S0();
        if (S0 == null) {
            n().F().a("Failed to get MD5");
            return 0L;
        }
        return jb.A(S0.digest(bArr));
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
