package im.threads.business.formatters;

import com.google.gson.Gson;
import com.google.gson.a;
import kotlin.Metadata;
/* compiled from: JsonFormatter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"Lim/threads/business/formatters/JsonFormatter;", "", "()V", "jsonToPrettyFormat", "", "jsonString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonFormatter {
    public final String jsonToPrettyFormat(String str) {
        try {
            pa5 c = pb5.c(str);
            Gson b = new a().j().e().b();
            z65.g(b, "GsonBuilder().setPrettyP…serializeNulls().create()");
            String s = b.s(c);
            z65.g(s, "{\n            val jsonOb…son(jsonObject)\n        }");
            return s;
        } catch (Exception unused) {
            return "Cannot create PrettyJson. Input json: " + str;
        }
    }
}
