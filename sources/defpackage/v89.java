package defpackage;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
/* compiled from: RealmThreadPoolExecutor.java */
/* renamed from: v89  reason: default package */
/* loaded from: classes3.dex */
public class v89 extends ThreadPoolExecutor {
    private static final int d = a();
    private boolean a;
    private ReentrantLock b;
    private Condition c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmThreadPoolExecutor.java */
    /* renamed from: v89$a */
    /* loaded from: classes3.dex */
    public class a implements FileFilter {
        final /* synthetic */ Pattern a;

        a(Pattern pattern) {
            this.a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.a.matcher(file.getName()).matches();
        }
    }

    private v89(int i, int i2) {
        super(i, i2, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int a() {
        int b = b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (b <= 0) {
            b = Runtime.getRuntime().availableProcessors();
        }
        if (b <= 0) {
            return 1;
        }
        return 1 + (b * 2);
    }

    private static int b(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static v89 c() {
        int i = d;
        return new v89(i, i);
    }

    public static v89 d() {
        return new v89(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.b.lock();
        while (this.a) {
            try {
                try {
                    this.c.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.b.unlock();
            }
        }
    }
}
