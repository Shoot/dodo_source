package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public class e {
    private static final Object n = new Object();
    private static final Object o = new Object();
    private static volatile e p;
    @NonNull
    private final Set<AbstractC0033e> b;
    @NonNull
    private final b e;
    @NonNull
    final g f;
    final boolean g;
    final boolean h;
    final int[] i;
    private final boolean j;
    private final int k;
    private final int l;
    private final d m;
    @NonNull
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private volatile int c = 3;
    @NonNull
    private final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    private static final class a extends b {
        private volatile androidx.emoji2.text.h b;
        private volatile l c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0032a extends h {
            C0032a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.a.m(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(@NonNull l lVar) {
                a.this.d(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.a.f.a(new C0032a());
            } catch (Throwable th) {
                this.a.m(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.e.b
        void c(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.g);
        }

        void d(@NonNull l lVar) {
            if (lVar == null) {
                this.a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = lVar;
            l lVar2 = this.c;
            i iVar = new i();
            d dVar = this.a.m;
            e eVar = this.a;
            this.b = new androidx.emoji2.text.h(lVar2, iVar, dVar, eVar.h, eVar.i);
            this.a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        final e a;

        b(e eVar) {
            this.a = eVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        void c(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        @NonNull
        final g a;
        boolean b;
        boolean c;
        int[] d;
        Set<AbstractC0033e> e;
        boolean f;
        int g = -16711936;
        int h = 0;
        @NonNull
        d i = new androidx.emoji2.text.d();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(@NonNull g gVar) {
            kh8.g(gVar, "metadataLoader cannot be null.");
            this.a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NonNull
        public final g a() {
            return this.a;
        }

        @NonNull
        public c b(int i) {
            this.h = i;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(@NonNull CharSequence charSequence, int i, int i2, int i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {
        private final List<AbstractC0033e> a;
        private final Throwable b;
        private final int c;

        f(@NonNull AbstractC0033e abstractC0033e, int i) {
            this(Arrays.asList((AbstractC0033e) kh8.g(abstractC0033e, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.a.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    this.a.get(i).a(this.b);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.a.get(i).b();
                i++;
            }
        }

        f(@NonNull Collection<AbstractC0033e> collection, int i) {
            this(collection, i, null);
        }

        f(@NonNull Collection<AbstractC0033e> collection, int i, Throwable th) {
            kh8.g(collection, "initCallbacks cannot be null");
            this.a = new ArrayList(collection);
            this.c = i;
            this.b = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(@NonNull h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(@NonNull l lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public uf3 a(@NonNull androidx.emoji2.text.g gVar) {
            return new sob(gVar);
        }
    }

    private e(@NonNull c cVar) {
        this.g = cVar.b;
        this.h = cVar.c;
        this.i = cVar.d;
        this.j = cVar.f;
        this.k = cVar.g;
        this.f = cVar.a;
        this.l = cVar.h;
        this.m = cVar.i;
        qr qrVar = new qr();
        this.b = qrVar;
        Set<AbstractC0033e> set = cVar.e;
        if (set != null && !set.isEmpty()) {
            qrVar.addAll(cVar.e);
        }
        this.e = new a(this);
        l();
    }

    @NonNull
    public static e b() {
        e eVar;
        boolean z;
        synchronized (n) {
            eVar = p;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            kh8.h(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i2, i3, z);
    }

    public static boolean f(@NonNull Editable editable, int i2, @NonNull KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i2, keyEvent);
    }

    @NonNull
    public static e g(@NonNull c cVar) {
        e eVar = p;
        if (eVar == null) {
            synchronized (n) {
                try {
                    eVar = p;
                    if (eVar == null) {
                        eVar = new e(cVar);
                        p = eVar;
                    }
                } finally {
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        if (p != null) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (d() == 1) {
            return true;
        }
        return false;
    }

    private void l() {
        this.a.writeLock().lock();
        try {
            if (this.l == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (d() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.k;
    }

    public int d() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.j;
    }

    public void k() {
        boolean z = true;
        if (this.l != 1) {
            z = false;
        }
        kh8.h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return p(charSequence, 0, length);
    }

    public CharSequence p(CharSequence charSequence, int i2, int i3) {
        return q(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3, int i4) {
        return r(charSequence, i2, i3, i4, 0);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kh8.h(j(), "Not initialized yet");
        kh8.d(i2, "start cannot be negative");
        kh8.d(i3, "end cannot be negative");
        kh8.d(i4, "maxEmojiCount cannot be negative");
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        kh8.a(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i2 <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        kh8.a(z2, "start should be < than charSequence length");
        if (i3 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        kh8.a(z3, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i2 != i3) {
            if (i5 != 1) {
                if (i5 != 2) {
                    z4 = this.g;
                } else {
                    z4 = false;
                }
            } else {
                z4 = true;
            }
            return this.e.b(charSequence, i2, i3, i4, z4);
        }
        return charSequence;
    }

    public void s(@NonNull AbstractC0033e abstractC0033e) {
        kh8.g(abstractC0033e, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(abstractC0033e);
                this.a.writeLock().unlock();
            }
            this.d.post(new f(abstractC0033e, this.c));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void t(@NonNull AbstractC0033e abstractC0033e) {
        kh8.g(abstractC0033e, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(abstractC0033e);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void u(@NonNull EditorInfo editorInfo) {
        if (j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.e.c(editorInfo);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0033e {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
