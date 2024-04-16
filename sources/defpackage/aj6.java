package defpackage;
/* compiled from: MiddleOutStrategy.java */
/* renamed from: aj6  reason: default package */
/* loaded from: classes2.dex */
public class aj6 implements hta {
    private final int a;

    public aj6(int i) {
        this.a = i;
    }

    @Override // defpackage.hta
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
