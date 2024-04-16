package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: FrameDecoderExecutor.java */
/* renamed from: c74  reason: default package */
/* loaded from: classes2.dex */
public class c74 {
    private static int c = 4;
    private ArrayList<HandlerThread> a;
    private AtomicInteger b;

    /* compiled from: FrameDecoderExecutor.java */
    /* renamed from: c74$b */
    /* loaded from: classes2.dex */
    static class b {
        static final c74 a = new c74();
    }

    public static c74 b() {
        return b.a;
    }

    public int a() {
        return this.b.getAndIncrement();
    }

    public Looper c(int i) {
        int i2 = i % c;
        if (i2 >= this.a.size()) {
            HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i2);
            handlerThread.start();
            this.a.add(handlerThread);
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                return looper;
            }
            return Looper.getMainLooper();
        } else if (this.a.get(i2) != null) {
            Looper looper2 = this.a.get(i2).getLooper();
            if (looper2 != null) {
                return looper2;
            }
            return Looper.getMainLooper();
        } else {
            return Looper.getMainLooper();
        }
    }

    private c74() {
        this.a = new ArrayList<>();
        this.b = new AtomicInteger(0);
    }
}
