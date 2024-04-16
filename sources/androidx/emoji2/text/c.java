package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: DefaultEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
        private final b a;

        public a(b bVar) {
            this.a = bVar == null ? e() : bVar;
        }

        private e.c a(@NonNull Context context, n34 n34Var) {
            if (n34Var == null) {
                return null;
            }
            return new i(context, n34Var);
        }

        @NonNull
        private List<List<byte[]>> b(@NonNull Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @NonNull
        private n34 d(@NonNull ProviderInfo providerInfo, @NonNull PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new n34(str, str2, "emojicompat-emoji-font", b(this.a.b(packageManager, str2)));
        }

        @NonNull
        private static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new d();
            }
            return new C0031c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                return true;
            }
            return false;
        }

        private ProviderInfo g(@NonNull PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a = this.a.a(resolveInfo);
                if (f(a)) {
                    return a;
                }
            }
            return null;
        }

        public e.c c(@NonNull Context context) {
            return a(context, h(context));
        }

        n34 h(@NonNull Context context) {
            PackageManager packageManager = context.getPackageManager();
            kh8.g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b {
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            throw null;
        }

        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i) {
            throw null;
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class d extends C0031c {
        @Override // androidx.emoji2.text.c.b
        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static i a(@NonNull Context context) {
        return (i) new a(null).c(context);
    }
}
