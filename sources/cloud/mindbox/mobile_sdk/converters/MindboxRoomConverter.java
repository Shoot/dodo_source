package cloud.mindbox.mobile_sdk.converters;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.models.EventType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MindboxRoomConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J0\u0010\u0007\u001a\u00020\u00022&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0005H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0007R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcloud/mindbox/mobile_sdk/converters/MindboxRoomConverter;", "", "", "value", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", e.a, c.a, "Lcloud/mindbox/mobile_sdk/models/EventType;", DateTokenConverter.CONVERTER_KEY, "a", "Lcom/google/gson/Gson;", "b", "Lrn5;", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxRoomConverter {
    public static final MindboxRoomConverter a = new MindboxRoomConverter();
    private static final rn5 b;

    /* compiled from: MindboxRoomConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Gson> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    static {
        rn5 b2;
        b2 = yn5.b(a.a);
        b = b2;
    }

    private MindboxRoomConverter() {
    }

    public static final String a(EventType eventType) {
        if (eventType != null) {
            String str = eventType.ordinal() + ';' + a.b().t(eventType);
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    private final Gson b() {
        return (Gson) b.getValue();
    }

    public static final String c(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return "";
        }
        String t = a.b().t(hashMap);
        z65.g(t, "gson.toJson(value)");
        return t;
    }

    public static final EventType d(String str) {
        String O0;
        String I0;
        z65.h(str, "value");
        O0 = m0b.O0(str, ";", "-1");
        int parseInt = Integer.parseInt(O0);
        I0 = m0b.I0(str, ";", "");
        Object l = a.b().l(I0, EventType.Companion.typeToken(parseInt).getType());
        z65.g(l, "gson.fromJson(json, Even….typeToken(ordinal).type)");
        return (EventType) l;
    }

    public static final HashMap<String, String> e(String str) {
        z65.h(str, "value");
        return (HashMap) a.b().l(str, new TypeToken<HashMap<String, String>>() { // from class: cloud.mindbox.mobile_sdk.converters.MindboxRoomConverter$stringToHashMap$1
        }.getType());
    }
}
