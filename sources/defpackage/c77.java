package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
@Metadata(d1 = {"d77", "e77"}, d2 = {}, k = 4, mv = {1, 9, 0})
/* renamed from: c77  reason: default package */
/* loaded from: classes3.dex */
public final class c77 {
    public static final zma a() {
        return e77.a();
    }

    public static final eh0 b(zma zmaVar) {
        return e77.b(zmaVar);
    }

    public static final fh0 c(pqa pqaVar) {
        return e77.c(pqaVar);
    }

    public static final boolean d(AssertionError assertionError) {
        return d77.b(assertionError);
    }

    public static final zma e(File file, boolean z) throws FileNotFoundException {
        return d77.c(file, z);
    }

    public static final zma f(OutputStream outputStream) {
        return d77.d(outputStream);
    }

    public static final zma g(Socket socket) throws IOException {
        return d77.e(socket);
    }

    public static final pqa i(File file) throws FileNotFoundException {
        return d77.g(file);
    }

    public static final pqa j(InputStream inputStream) {
        return d77.h(inputStream);
    }

    public static final pqa k(Socket socket) throws IOException {
        return d77.i(socket);
    }
}
