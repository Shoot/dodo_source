package defpackage;

import ch.qos.logback.core.util.FileSize;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageUnit.java */
/* renamed from: txa  reason: default package */
/* loaded from: classes2.dex */
public abstract class txa {
    public static final txa b;
    public static final txa c;
    public static final txa d;
    public static final txa e;
    public static final txa f;
    private static final /* synthetic */ txa[] g;
    long a;

    /* compiled from: StorageUnit.java */
    /* renamed from: txa$a */
    /* loaded from: classes2.dex */
    enum a extends txa {
        a(String str, int i, long j) {
            super(str, i, j, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        b = aVar;
        txa txaVar = new txa("GIGABYTES", 1, FileSize.GB_COEFFICIENT) { // from class: txa.b
        };
        c = txaVar;
        txa txaVar2 = new txa("MEGABYTES", 2, 1048576L) { // from class: txa.c
        };
        d = txaVar2;
        txa txaVar3 = new txa("KILOBYTES", 3, FileSize.KB_COEFFICIENT) { // from class: txa.d
        };
        e = txaVar3;
        txa txaVar4 = new txa("BYTES", 4, 1L) { // from class: txa.e
        };
        f = txaVar4;
        g = new txa[]{aVar, txaVar, txaVar2, txaVar3, txaVar4};
    }

    /* synthetic */ txa(String str, int i, long j, a aVar) {
        this(str, i, j);
    }

    public static txa valueOf(String str) {
        return (txa) Enum.valueOf(txa.class, str);
    }

    public static txa[] values() {
        return (txa[]) g.clone();
    }

    public long a(long j) {
        return (j * this.a) / e.a;
    }

    private txa(String str, int i, long j) {
        this.a = j;
    }
}
