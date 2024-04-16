package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import kotlin.Metadata;
import ru.dodopizza.mindbox.model.MindboxPayload;
/* compiled from: MindboxPayloadParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmk6;", "", "", "payload", "Lru/dodopizza/mindbox/model/MindboxPayload;", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mk6  reason: default package */
/* loaded from: classes4.dex */
public final class mk6 {
    private final Gson a;

    public mk6(Gson gson) {
        z65.h(gson, "gson");
        this.a = gson;
    }

    public final MindboxPayload a(String str) {
        z65.h(str, "payload");
        try {
            return (MindboxPayload) this.a.k(str, MindboxPayload.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
