package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: State.java */
/* renamed from: aua  reason: default package */
/* loaded from: classes3.dex */
public final class aua {
    byte[] A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    byte[] H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P;
    int U;
    int V;
    int W;
    int X;
    int Y;
    byte[] Z;
    int b;
    byte[] d;
    int g;
    boolean h;
    boolean i;
    boolean j;
    int w;
    int x;
    int y;
    byte[] z;
    int a = 0;
    final ob0 c = new ob0();
    final int[] e = new int[3240];
    final int[] f = new int[3240];
    final ar4 k = new ar4();
    final ar4 l = new ar4();
    final ar4 m = new ar4();
    final int[] n = new int[3];
    final int[] o = new int[3];
    final int[] p = new int[6];
    final int[] q = {16, 15, 11, 4};
    int r = 0;
    int s = 0;
    int t = 0;
    boolean u = false;
    int v = 0;
    int Q = 0;
    long R = 0;
    byte[] S = new byte[0];
    int T = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aua auaVar) throws IOException {
        int i = auaVar.a;
        if (i != 0) {
            if (i == 11) {
                return;
            }
            auaVar.a = 11;
            ob0.b(auaVar.c);
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    private static int b(ob0 ob0Var) {
        if (ob0.i(ob0Var, 1) == 0) {
            return 16;
        }
        int i = ob0.i(ob0Var, 3);
        if (i != 0) {
            return i + 17;
        }
        int i2 = ob0.i(ob0Var, 3);
        if (i2 == 0) {
            return 17;
        }
        return i2 + 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(aua auaVar, InputStream inputStream) {
        if (auaVar.a == 0) {
            ob0.e(auaVar.c, inputStream);
            int b = b(auaVar.c);
            if (b != 9) {
                int i = 1 << b;
                auaVar.P = i;
                auaVar.O = i - 16;
                auaVar.a = 1;
                return;
            }
            throw new kg0("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
}
