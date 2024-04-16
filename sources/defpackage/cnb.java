package defpackage;

import java.util.Stack;
/* compiled from: TrimmedThrowableData.java */
/* renamed from: cnb  reason: default package */
/* loaded from: classes2.dex */
public class cnb {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final cnb d;

    private cnb(String str, String str2, StackTraceElement[] stackTraceElementArr, cnb cnbVar) {
        this.a = str;
        this.b = str2;
        this.c = stackTraceElementArr;
        this.d = cnbVar;
    }

    public static cnb a(Throwable th, hta htaVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        cnb cnbVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            cnbVar = new cnb(th2.getLocalizedMessage(), th2.getClass().getName(), htaVar.a(th2.getStackTrace()), cnbVar);
        }
        return cnbVar;
    }
}
