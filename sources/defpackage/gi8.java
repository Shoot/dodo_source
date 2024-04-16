package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PreferencesMapCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgi8;", "", "a", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
/* renamed from: gi8  reason: default package */
/* loaded from: classes.dex */
public final class gi8 {
    public static final a a = new a(null);

    /* compiled from: PreferencesMapCompat.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lgi8$a;", "", "Ljava/io/InputStream;", "input", "Lii8;", "a", "<init>", "()V", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
    /* renamed from: gi8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ii8 a(InputStream inputStream) {
            z65.h(inputStream, "input");
            try {
                ii8 R = ii8.R(inputStream);
                z65.g(R, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return R;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
