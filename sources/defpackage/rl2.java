package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import java.nio.charset.Charset;
/* compiled from: DataTransportCrashlyticsReportSender.java */
/* renamed from: rl2  reason: default package */
/* loaded from: classes2.dex */
public class rl2 {
    private static final u12 c = new u12();
    private static final String d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final zkb<j12, byte[]> f = new zkb() { // from class: ql2
        @Override // defpackage.zkb
        public final Object apply(Object obj) {
            byte[] d2;
            d2 = rl2.d((j12) obj);
            return d2;
        }
    };
    private final rg9 a;
    private final zkb<j12, byte[]> b;

    rl2(rg9 rg9Var, zkb<j12, byte[]> zkbVar) {
        this.a = rg9Var;
        this.b = zkbVar;
    }

    public static rl2 b(Context context, gga ggaVar, w77 w77Var) {
        lmb.f(context);
        xlb g = lmb.c().g(new a(d, e));
        eh3 b = eh3.b("json");
        zkb<j12, byte[]> zkbVar = f;
        return new rl2(new rg9(g.a("FIREBASE_CRASHLYTICS_REPORT", j12.class, b, zkbVar), ggaVar.b(), w77Var), zkbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(j12 j12Var) {
        return c.M(j12Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    @NonNull
    public y6b<a22> c(@NonNull a22 a22Var, boolean z) {
        return this.a.i(a22Var, z).a();
    }
}
