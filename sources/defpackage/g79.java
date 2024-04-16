package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: ReLinker.java */
/* renamed from: g79  reason: default package */
/* loaded from: classes2.dex */
public class g79 {

    /* compiled from: ReLinker.java */
    /* renamed from: g79$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, h79 h79Var);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: g79$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: g79$c */
    /* loaded from: classes2.dex */
    public interface c {
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, str2, null);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        new h79().f(context, str, str2, cVar);
    }
}
