package im.threads.business.preferences;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: PrefKeysForMigration.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0016j\b\u0012\u0004\u0012\u00020\u0004`\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lim/threads/business/preferences/PrefKeysForMigration;", "", "()V", "APP_MARKER", "", "getAPP_MARKER", "()Ljava/lang/String;", "AUTH_SCHEMA", "getAUTH_SCHEMA", "AUTH_TOKEN", "getAUTH_TOKEN", "CLIENT_ID_SIGNATURE", "getCLIENT_ID_SIGNATURE", "DEFAULT_CLIENT_NAMETITLE_TAG", "getDEFAULT_CLIENT_NAMETITLE_TAG", "EXTRA_DATE", "getEXTRA_DATE", "TAG_CLIENT_ID", "getTAG_CLIENT_ID", "TAG_CLIENT_ID_ENCRYPTED", "getTAG_CLIENT_ID_ENCRYPTED", StatisticManager.LIST, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrefKeysForMigration {
    private final ArrayList<String> list;
    private final String APP_MARKER = "APP_MARKER";
    private final String TAG_CLIENT_ID = "TAG_CLIENT_ID";
    private final String AUTH_TOKEN = "AUTH_TOKEN";
    private final String AUTH_SCHEMA = "AUTH_SCHEMA";
    private final String CLIENT_ID_SIGNATURE = "CLIENT_ID_SIGNATURE";
    private final String DEFAULT_CLIENT_NAMETITLE_TAG = "DEFAULT_CLIENT_NAMETITLE_TAG";
    private final String EXTRA_DATE = "EXTRA_DATE";
    private final String TAG_CLIENT_ID_ENCRYPTED = "TAG_CLIENT_ID_ENCRYPTED";

    public PrefKeysForMigration() {
        ArrayList<String> h;
        h = kc1.h("APP_MARKER", "TAG_CLIENT_ID", "AUTH_TOKEN", "AUTH_SCHEMA", "CLIENT_ID_SIGNATURE", "DEFAULT_CLIENT_NAMETITLE_TAG", "EXTRA_DATE", "TAG_CLIENT_ID_ENCRYPTED");
        this.list = h;
    }

    public final String getAPP_MARKER() {
        return this.APP_MARKER;
    }

    public final String getAUTH_SCHEMA() {
        return this.AUTH_SCHEMA;
    }

    public final String getAUTH_TOKEN() {
        return this.AUTH_TOKEN;
    }

    public final String getCLIENT_ID_SIGNATURE() {
        return this.CLIENT_ID_SIGNATURE;
    }

    public final String getDEFAULT_CLIENT_NAMETITLE_TAG() {
        return this.DEFAULT_CLIENT_NAMETITLE_TAG;
    }

    public final String getEXTRA_DATE() {
        return this.EXTRA_DATE;
    }

    public final ArrayList<String> getList() {
        return this.list;
    }

    public final String getTAG_CLIENT_ID() {
        return this.TAG_CLIENT_ID;
    }

    public final String getTAG_CLIENT_ID_ENCRYPTED() {
        return this.TAG_CLIENT_ID_ENCRYPTED;
    }
}
