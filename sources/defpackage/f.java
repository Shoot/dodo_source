package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0000¨\u0006\u000b"}, d2 = {"Liu3;", "Lnr7;", "path", "Lbu3;", c.a, "", "b", "dir", "mustCreate", "", "a", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: f  reason: default package */
/* loaded from: classes3.dex */
public final class f {
    public static final void a(iu3 iu3Var, nr7 nr7Var, boolean z) throws IOException {
        z65.h(iu3Var, "<this>");
        z65.h(nr7Var, "dir");
        gr grVar = new gr();
        for (nr7 nr7Var2 = nr7Var; nr7Var2 != null && !iu3Var.j(nr7Var2); nr7Var2 = nr7Var2.q()) {
            grVar.u(nr7Var2);
        }
        if (z && grVar.isEmpty()) {
            throw new IOException(nr7Var + " already exists.");
        }
        Iterator<E> it = grVar.iterator();
        while (it.hasNext()) {
            iu3Var.f((nr7) it.next());
        }
    }

    public static final boolean b(iu3 iu3Var, nr7 nr7Var) throws IOException {
        z65.h(iu3Var, "<this>");
        z65.h(nr7Var, "path");
        if (iu3Var.m(nr7Var) != null) {
            return true;
        }
        return false;
    }

    public static final bu3 c(iu3 iu3Var, nr7 nr7Var) throws IOException {
        z65.h(iu3Var, "<this>");
        z65.h(nr7Var, "path");
        bu3 m = iu3Var.m(nr7Var);
        if (m != null) {
            return m;
        }
        throw new FileNotFoundException("no such file: " + nr7Var);
    }
}
