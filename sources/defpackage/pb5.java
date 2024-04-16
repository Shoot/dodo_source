package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/* compiled from: JsonParser.java */
/* renamed from: pb5  reason: default package */
/* loaded from: classes2.dex */
public final class pb5 {
    public static pa5 a(yb5 yb5Var) throws JsonIOException, JsonSyntaxException {
        boolean n = yb5Var.n();
        yb5Var.W(true);
        try {
            try {
                return zya.a(yb5Var);
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source: " + yb5Var + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + yb5Var + " to Json", e2);
            }
        } finally {
            yb5Var.W(n);
        }
    }

    public static pa5 b(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            yb5 yb5Var = new yb5(reader);
            pa5 a = a(yb5Var);
            if (!a.p() && yb5Var.N() != mc5.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    public static pa5 c(String str) throws JsonSyntaxException {
        return b(new StringReader(str));
    }
}
