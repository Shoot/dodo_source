package defpackage;
/* compiled from: MiddleOutFallbackStrategy.java */
/* renamed from: zi6  reason: default package */
/* loaded from: classes2.dex */
public class zi6 implements hta {
    private final int a;
    private final hta[] b;
    private final aj6 c;

    public zi6(int i, hta... htaVarArr) {
        this.a = i;
        this.b = htaVarArr;
        this.c = new aj6(i);
    }

    @Override // defpackage.hta
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        hta[] htaVarArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (hta htaVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = htaVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            return this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
