package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.business.transport.PushMessageAttributes;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Marker;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class jb extends s6 {
    private static final String[] i = {"firebase_", "google_", "ga_"};
    private static final String[] j = {"_err"};
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private jc6 f;
    private Boolean g;
    private Integer h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jb(u5 u5Var) {
        super(u5Var);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(byte[] bArr) {
        boolean z;
        gh8.j(bArr);
        int i2 = 0;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        gh8.m(z);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    private static boolean A0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle C(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C0(String str) {
        String a = b0.b0.a(null);
        if (!a.equals(Marker.ANY_MARKER) && !Arrays.asList(a.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static Bundle F(List<zznb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zznb zznbVar : list) {
            String str = zznbVar.f;
            if (str != null) {
                bundle.putString(zznbVar.b, str);
            } else {
                Long l = zznbVar.d;
                if (l != null) {
                    bundle.putLong(zznbVar.b, l.longValue());
                } else {
                    Double d = zznbVar.h;
                    if (d != null) {
                        bundle.putDouble(zznbVar.b, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean G0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    private final Object H(int i2, Object obj, boolean z, boolean z2, String str) {
        Parcelable[] parcelableArr;
        Bundle D;
        long j2;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j2 = 1;
                } else {
                    j2 = 0;
                }
                return Long.valueOf(j2);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if ((parcelable instanceof Bundle) && (D = D((Bundle) parcelable, null)) != null && !D.isEmpty()) {
                            arrayList.add(D);
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return I(String.valueOf(obj), i2, z);
            }
        }
        return obj;
    }

    public static String I(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i2) {
            if (!z) {
                return null;
            }
            String substring = str.substring(0, str.offsetByCodePoints(0, i2));
            return substring + "...";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean I0(String str) {
        gh8.f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    private static void K(Bundle bundle, int i2, String str, Object obj) {
        if (u0(bundle, i2)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                gh8.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean K0(String str) {
        for (String str2 : j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int L0(String str) {
        if (!v0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, str)) {
            return 14;
        }
        if (!i0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int M0(String str) {
        if (!B0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, str)) {
            return 14;
        }
        if (!i0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private static int N0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str) || "_gbraid".equals(str)) {
            return 100;
        }
        return 36;
    }

    public static void P(p8 p8Var, Bundle bundle, boolean z) {
        if (bundle != null && p8Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = p8Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = p8Var.b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", p8Var.c);
        } else if (bundle != null && p8Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void Q(ib ibVar, int i2, String str, String str2, int i3) {
        R(ibVar, null, i2, str, str2, i3);
    }

    private static boolean Q0(String str) {
        gh8.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(ib ibVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        u0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        ibVar.b(str, "_err", bundle);
    }

    private final void S(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str4;
        String str5;
        int w;
        if (bundle == null) {
            return;
        }
        int w2 = a().w();
        int i3 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str6)) {
                i2 = 0;
            } else {
                if (!z) {
                    i2 = M0(str6);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i2 = L0(str6);
                }
            }
            if (i2 != 0) {
                if (i2 == 3) {
                    str4 = str6;
                } else {
                    str4 = null;
                }
                K(bundle, i2, str6, str4);
                bundle.remove(str6);
            } else {
                if (g0(bundle.get(str6))) {
                    n().L().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    w = 22;
                    str5 = str6;
                } else {
                    str5 = str6;
                    w = w(str, str2, str6, bundle.get(str6), bundle, list, z, false);
                }
                if (w != 0 && !"_ev".equals(str5)) {
                    K(bundle, w, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (I0(str5) && !m0(str5, g1d.d)) {
                    int i4 = i3 + 1;
                    if (!b0(231100000, true)) {
                        n().G().c("Item array not supported on client's version of Google Play Services (Android Only)", f().c(str2), f().a(bundle));
                        u0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i4 > w2) {
                        if (l7d.a() && a().s(b0.E0)) {
                            m4 G = n().G();
                            G.c("Item can't contain more than " + w2 + " item-scoped custom params", f().c(str2), f().a(bundle));
                            u0(bundle, 28);
                            bundle.remove(str5);
                        } else {
                            n().G().c("Item cannot contain custom parameters", f().c(str2), f().a(bundle));
                            u0(bundle, 23);
                            bundle.remove(str5);
                        }
                    }
                    i3 = i4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest S0() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @TargetApi(30)
    private final boolean W0() {
        Integer num;
        if (this.g == null) {
            jc6 P0 = P0();
            boolean z = false;
            if (P0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = P0.b().get(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        num2 = num;
                        n().K().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        n().J().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        n().K().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        n().J().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        n().K().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        n().J().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (TimeoutException e4) {
                        e = e4;
                        num2 = num;
                        n().K().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        n().J().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    }
                }
                this.g = Boolean.valueOf(z);
            } catch (InterruptedException e5) {
                e = e5;
            } catch (CancellationException e6) {
                e = e6;
            } catch (ExecutionException e7) {
                e = e7;
            } catch (TimeoutException e8) {
                e = e8;
            }
            n().J().b("Measurement manager api status result", num);
        }
        return this.g.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        gh8.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d0(Context context, boolean z) {
        gh8.j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return A0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return A0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            gh8.j(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty && isEmpty2) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean m0(String str, String[] strArr) {
        gh8.j(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] p0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> s0(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, zzaeVar.a);
            bundle.putString(PushMessageAttributes.ORIGIN, zzaeVar.b);
            bundle.putLong("creation_timestamp", zzaeVar.d);
            bundle.putString(Action.NAME_ATTRIBUTE, zzaeVar.c.b);
            b1d.b(bundle, gh8.j(zzaeVar.c.h()));
            bundle.putBoolean("active", zzaeVar.e);
            String str = zzaeVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbe zzbeVar = zzaeVar.g;
            if (zzbeVar != null) {
                bundle.putString("timed_out_event_name", zzbeVar.a);
                zzaz zzazVar = zzbeVar.b;
                if (zzazVar != null) {
                    bundle.putBundle("timed_out_event_params", zzazVar.t());
                }
            }
            bundle.putLong("trigger_timeout", zzaeVar.h);
            zzbe zzbeVar2 = zzaeVar.i;
            if (zzbeVar2 != null) {
                bundle.putString("triggered_event_name", zzbeVar2.a);
                zzaz zzazVar2 = zzbeVar2.b;
                if (zzazVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzazVar2.t());
                }
            }
            bundle.putLong("triggered_timestamp", zzaeVar.c.c);
            bundle.putLong("time_to_live", zzaeVar.j);
            zzbe zzbeVar3 = zzaeVar.k;
            if (zzbeVar3 != null) {
                bundle.putString("expired_event_name", zzbeVar3.a);
                zzaz zzazVar3 = zzbeVar3.b;
                if (zzazVar3 != null) {
                    bundle.putBundle("expired_event_params", zzazVar3.t());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean t0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = t8c.a(context).e(str, 64);
            if (e != null && (signatureArr = e.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            n().F().b("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            n().F().b("Error obtaining certificate", e3);
            return true;
        }
    }

    private static boolean u0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int w(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List<java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jb.w(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] w0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        } else {
            return null;
        }
    }

    public static long x(long j2, long j3) {
        return (j2 + (j3 * 60000)) / CoreConstants.MILLIS_IN_ONE_DAY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion > 3) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                return extensionVersion2;
            }
            return 0;
        }
        return 0;
    }

    public static long z(zzaz zzazVar) {
        long j2 = 0;
        if (zzazVar == null) {
            return 0L;
        }
        Iterator<String> it = zzazVar.iterator();
        while (it.hasNext()) {
            Object v = zzazVar.v(it.next());
            if (v instanceof Parcelable[]) {
                j2 += ((Parcelable[]) v).length;
            }
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle B(Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                if (z2) {
                    str5 = uri.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                if (z) {
                    str9 = uri.getQueryParameter("sfmc_id");
                } else {
                    str9 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z2 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(KustoStorage.KustoTable.COLUMN_SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z2 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(RemoteMessageConst.Notification.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            n().K().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B0(String str, String str2) {
        if (str2 == null) {
            n().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            n().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                n().G().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    n().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle D(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object r0 = r0(str2, bundle.get(str2));
                if (r0 == null) {
                    n().L().b("Param value can't be null", f().f(str2));
                } else {
                    N(bundle2, str2, r0);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D0(String str) {
        l();
        if (t8c.a(zza()).a(str) == 0) {
            return true;
        }
        n().E().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle E(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int i2;
        int i3;
        String str3;
        String str4;
        jb jbVar = this;
        boolean m0 = m0(str2, d1d.d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int F = a().F();
            int i4 = 0;
            for (String str5 : new TreeSet(bundle.keySet())) {
                if (list != null && list.contains(str5)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i2 = jbVar.M0(str5);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = jbVar.L0(str5);
                    }
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str4 = str5;
                    } else {
                        str4 = null;
                    }
                    K(bundle2, i2, str5, str4);
                    bundle2.remove(str5);
                    i3 = F;
                } else {
                    i3 = F;
                    int w = w(str, str2, str5, bundle.get(str5), bundle2, list, z, m0);
                    if (w == 17) {
                        K(bundle2, w, str5, Boolean.FALSE);
                    } else if (w != 0 && !"_ev".equals(str5)) {
                        if (w == 21) {
                            str3 = str2;
                        } else {
                            str3 = str5;
                        }
                        K(bundle2, w, str3, bundle.get(str5));
                        bundle2.remove(str5);
                    }
                    if (I0(str5)) {
                        int i5 = i4 + 1;
                        if (i5 > i3) {
                            n().G().c("Event can't contain more than " + i3 + " params", f().c(str2), f().a(bundle));
                            u0(bundle2, 5);
                            bundle2.remove(str5);
                        }
                        i4 = i5;
                    }
                }
                F = i3;
                jbVar = this;
            }
            return bundle2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().M().equals(str);
    }

    public final int F0() {
        if (this.h == null) {
            this.h = Integer.valueOf(com.google.android.gms.common.b.f().a(zza()) / 1000);
        }
        return this.h.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbe G(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (u(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle E = E(str, str2, bundle2, gc1.b("_o"), true);
            if (z) {
                E = D(E, str);
            }
            gh8.j(E);
            return new zzbe(str2, new zzaz(E), str3, j2);
        }
        n().F().b("Invalid conditional property event name", f().g(str2));
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long H0() {
        int extensionVersion;
        long j2;
        l();
        if (!C0(this.a.A().E())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j2 = 8;
            } else if (x0() < b0.X.a(null).intValue()) {
                j2 = 16;
            } else {
                j2 = 0;
            }
        } else {
            j2 = 4;
        }
        if (!D0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !W0()) {
            j2 |= 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final URL J(long j2, String str, String str2, long j3, String str3) {
        try {
            gh8.f(str2);
            gh8.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(F0())), str2, str, Long.valueOf(j3));
            if (str.equals(a().N())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat(ContainerUtils.FIELD_DELIMITER);
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e) {
            e = e;
            n().F().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            n().F().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean J0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            n().K().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                h().N(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            n().L().c("Not putting event parameter. Invalid value type. name, type", f().f(str), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(o4 o4Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(o4Var.d.keySet())) {
            if (I0(str) && (i3 = i3 + 1) > i2) {
                n().G().c("Event can't contain more than " + i2 + " params", f().c(o4Var.a), f().a(o4Var.d));
                u0(o4Var.d, 5);
                o4Var.d.remove(str);
            }
        }
    }

    public final long O0() {
        long andIncrement;
        long j2;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nextLong = new Random(System.nanoTime() ^ b().currentTimeMillis()).nextLong();
                int i2 = this.e + 1;
                this.e = i2;
                j2 = nextLong + i2;
            }
            return j2;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1L, 1L);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jc6 P0() {
        if (this.f == null) {
            this.f = jc6.a(zza());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String R0() {
        byte[] bArr = new byte[16];
        T0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(huc hucVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning int value to wrapper", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom T0() {
        l();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void U(huc hucVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning long value to wrapper", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U0() {
        l();
        if (H0() == 1) {
            return true;
        }
        return false;
    }

    public final void V(huc hucVar, Bundle bundle) {
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning bundle value to wrapper", e);
        }
    }

    public final boolean V0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void W(huc hucVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning string value to wrapper", e);
        }
    }

    public final void X(huc hucVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void Y(huc hucVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void Z(huc hucVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            hucVar.q(bundle);
        } catch (RemoteException e) {
            this.a.n().K().b("Error returning byte array to wrapper", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a0(Parcelable[] parcelableArr, int i2, boolean z) {
        gh8.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (I0(str) && !m0(str, g1d.d) && (i3 = i3 + 1) > i2) {
                    if (z) {
                        n().G().c("Param can't contain more than " + i2 + " item-scoped custom parameters", f().f(str), f().a(bundle));
                        u0(bundle, 28);
                    } else {
                        n().G().c("Param cannot contain item-scoped custom parameters", f().f(str), f().a(bundle));
                        u0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    public final boolean b0(int i2, boolean z) {
        Boolean V = this.a.I().V();
        if (F0() < i2 / 1000) {
            if (V == null || V.booleanValue()) {
                return false;
            }
            return true;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean h0(String str, double d) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (RuntimeException e) {
            n().F().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i0(String str, int i2, String str2) {
        if (str2 == null) {
            n().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i2) {
            n().G().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        } else {
            return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!Q0(str)) {
                if (this.a.q()) {
                    n().G().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", k4.u(str));
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            if (!Q0(str2)) {
                n().G().b("Invalid admob_app_id. Analytics disabled.", k4.u(str2));
                return false;
            }
            return true;
        } else {
            if (this.a.q()) {
                n().G().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                n().L().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final void m() {
        l();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                n().K().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n0(String str, String[] strArr, String str2) {
        return o0(str, strArr, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            n().G().b("Name is required and can't be null. Type", str);
            return false;
        }
        gh8.j(str2);
        for (String str3 : i) {
            if (str2.startsWith(str3)) {
                n().G().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m0(str2, strArr)) {
            if (strArr2 == null || !m0(str2, strArr2)) {
                n().G().c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int q0(String str) {
        if (!v0("user property", str)) {
            return 6;
        }
        if (!n0("user property", f1d.a, str)) {
            return 15;
        }
        if (!i0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object r0(String str, Object obj) {
        int q;
        if ("_ev".equals(str)) {
            return H(a().v(null, false), obj, true, true, null);
        }
        if (G0(str)) {
            q = a().v(null, false);
        } else {
            q = a().q(null, false);
        }
        return H(q, obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final boolean s() {
        return true;
    }

    public final int t(int i2) {
        return com.google.android.gms.common.b.f().h(zza(), com.google.android.gms.common.d.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u(String str) {
        if (!v0("event", str)) {
            return 2;
        }
        if (!o0("event", d1d.a, d1d.b, str)) {
            return 13;
        }
        if (!i0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int v(String str, Object obj) {
        boolean k0;
        if ("_ldl".equals(str)) {
            k0 = k0("user property referrer", str, N0(str), obj);
        } else {
            k0 = k0("user property", str, N0(str), obj);
        }
        if (k0) {
            return 0;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v0(String str, String str2) {
        if (str2 == null) {
            n().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            n().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                n().G().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    n().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please submit an issue!!! */
    public final long y(Context context, String str) {
        l();
        gh8.j(context);
        gh8.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest S0 = S0();
        long j2 = -1;
        if (S0 == null) {
            n().F().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    n().F().b("Package name not found", e);
                }
                if (!t0(context, str)) {
                    Signature[] signatureArr = t8c.a(context).e(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j2 = A(S0.digest(signatureArr[0].toByteArray()));
                    } else {
                        n().K().a("Could not get signatures");
                    }
                }
            }
            j2 = 0;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long y0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i2 = 0;
        try {
            ApplicationInfo c = t8c.a(zza()).c(str, 0);
            if (c != null) {
                i2 = c.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            n().I().b("PackageManager failed to find running app: app_id", str);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return H(N0(str), obj, true, false, null);
        }
        return H(N0(str), obj, false, false, null);
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
