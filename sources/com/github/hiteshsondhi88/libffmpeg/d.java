package com.github.hiteshsondhi88.libffmpeg;

import android.content.Context;
import android.text.TextUtils;
import com.github.hiteshsondhi88.libffmpeg.exceptions.FFmpegCommandAlreadyRunningException;
import com.github.hiteshsondhi88.libffmpeg.exceptions.FFmpegNotSupportedException;
import java.lang.reflect.Array;
import java.util.Map;
/* compiled from: FFmpeg.java */
/* loaded from: classes2.dex */
public class d {
    private static d e;
    private final Context a;
    private e b;
    private h c;
    private long d = Long.MAX_VALUE;

    /* compiled from: FFmpeg.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.x86.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.ARMv7.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        j.e(m.e(applicationContext));
    }

    public static d d(Context context) {
        if (e == null) {
            e = new d(context);
        }
        return e;
    }

    public <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2));
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public void b(Map<String, String> map, String[] strArr, f fVar) throws FFmpegCommandAlreadyRunningException {
        e eVar = this.b;
        if (eVar != null && !eVar.c()) {
            throw new FFmpegCommandAlreadyRunningException("FFmpeg command is already running, you are only allowed to run single command at a time");
        }
        if (strArr.length != 0) {
            e eVar2 = new e((String[]) a(new String[]{i.e(this.a, map)}, strArr), this.d, fVar);
            this.b = eVar2;
            eVar2.execute(new Void[0]);
            return;
        }
        throw new IllegalArgumentException("shell command cannot be empty");
    }

    public void c(String[] strArr, f fVar) throws FFmpegCommandAlreadyRunningException {
        b(null, strArr, fVar);
    }

    public void e(g gVar) throws FFmpegNotSupportedException {
        String str;
        int i = a.a[c.c().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = null;
                } else {
                    throw new FFmpegNotSupportedException("Device not supported");
                }
            } else {
                j.d("Loading FFmpeg for armv7 CPU");
                str = "armeabi-v7a";
            }
        } else {
            j.d("Loading FFmpeg for x86 CPU");
            str = "x86";
        }
        if (!TextUtils.isEmpty(str)) {
            h hVar = new h(this.a, str, gVar);
            this.c = hVar;
            hVar.execute(new Void[0]);
            return;
        }
        throw new FFmpegNotSupportedException("Device not supported");
    }
}
