package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¨\u0006\u0006"}, d2 = {"", "", "b", "exception", "", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/ExceptionsKt")
/* renamed from: vl3  reason: default package */
/* loaded from: classes3.dex */
public class vl3 {
    public static void a(Throwable th, Throwable th2) {
        z65.h(th, "<this>");
        z65.h(th2, "exception");
        if (th != th2) {
            dc8.a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        z65.h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        z65.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
